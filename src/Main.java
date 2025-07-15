import java.io.*;
import java.util.*;
public class BrowserHistory {
    private Stack<String> urlHistory = new Stack<>();
    private final String fileName = "history.txt";

    public BrowserHistory() {
        loadFromFile();
    }

    private void loadFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            Stack<String> temp = new Stack<>();
            while ((line = br.readLine()) != null) {
                temp.push(line.trim());
            }
            while (!temp.isEmpty()) {
                urlHistory.push(temp.pop());}
        } catch (IOException e) {
            System.out.println("history.txt not found:(. Starting with empty history.");
        }
    }

    public void printAll() {
        if (urlHistory.isEmpty()) {
            System.out.println("no URLs in history.");
            return;
        }
        for (String url : urlHistory) {
            System.out.println(url);
        }
    }

    public void addURL(String url) {
        urlHistory.push(url);
    }

    public void previousURL() {
        if (urlHistory.isEmpty()) {
            System.out.println("no URLs in history.");
        } else {
            System.out.println("Previous site: " + urlHistory.pop());
        }
    }
    public void updateFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            Stack<String> temp = new Stack<>();
            while (!urlHistory.isEmpty()) {
                temp.push(urlHistory.pop());
            }
            while (!temp.isEmpty()) {
                String url = temp.pop();
                bw.write(url);
                bw.newLine();
                urlHistory.push(url); }
        } catch (IOException e) {
            System.out.println("Error updating history.txt: " + e.getMessage());
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nURL history tracker program :) ");
            System.out.println("Enter your choice");
            System.out.println("_________________________");
            System.out.println("1-> Print all the URL");
            System.out.println("2-> Add a new URL");
            System.out.println("3-> Return the last URL");
            System.out.println("4-> Exit");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    history.printAll();
                    break;
                case 2:
                    System.out.print("Enter site URL: ");
                    String newUrl = scanner.nextLine();
                    history.addURL(newUrl);
                    break;
                case 3:
                    history.previousURL();
                    break;
                case 4:
                    System.out.println("Goodbye...");
                    history.updateFile();
                    break;
                default:
                    System.out.println("invalid choice, please try again.");
            }

        } while (choice != 4);
    }
}
