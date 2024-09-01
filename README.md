# Visited Site History Tracker

## Objective 
Use data structure and algorithms, to store data from a text file.

## Problem 

You are developing a program to simulate the management of browser history. The program needs to keep track of visited URL sites so that the user can navigate to new or previous sites.

To interact with the program, the user requires a display menu to choose whether to **return the last visited site**, **add a new site**, or **exit the program**.

> The history of the visited sites is stored in a text file called [history.txt](https://github.com/SAFCSP-Team/browser-history/blob/main/src/history.txt).

## Features 
- A display menu to interact with the program.
- Save the URL sites from the `history.txt` file into a data structure.
- Print all the URL sites from the data structure from last to first.
- Add a new site URL to the data structure file.
- Retrieve/pop the last visited URL site from the data structure.
- When the program closes update the `history.txt` file's URL with the data structure.


## Implementation
- Create a menu that takes input from the user, based on the user's input do the following:
    - 1: Print all the URL sites.
    - 2: Add a new URL site to the data structure.
    - 3: Return the last URL site and remove it.
    - 4: Close the program.

- Create a class `BrowserHistory` with four methods `printAll`, `previousURL`, `addURL`, and `updateFile`.
    - Create a data structure, and save the URL site from the `history.txt` file into a data structure. 
    - Create a method called `previousURL` that returns the last URL from the data structure and removes it.
    - Create a method called `printALl` that prints all the URLs from the data structure.
    - Create a method called `addURL` that adds a URL to the data strucutre.
    - Create a method called `updateFile` that updates the URL in the `history.txt` with the data structure. 

> Note if the user inputs a number a certain method will invoked. 

## Example
When the program runs, the user shall see the following menu:
```
URL history tracker program
Enter your choice
_________________________
1-> Print all the URL
2-> Add a new URL
3-> Return the last URL
4-> Exit
```
The user enters 1, the program shall return all the URLs.
```
Enter your choice
_________________________
1-> Print all the URL
2-> Add a new URL
3-> Return the last URL
4-> Exit
1
https://www.python.org
https://javascript.info
https://dev.java
```

The user enters 2, the program shall prompt the user to enter a new site URL.
```
1-> Print all the URL
2-> Add a new URL
3-> Return the last URL
4-> Exit
2
Enter site URL: safcsp.org.sa
```

The user enters 3, the program shall display the last visited site URL.
```
1-> Print all the URL
2-> Add a new URL
3-> Return the last URL
4-> Exit
3
Previous site: safcsp.org.sa
```

The user enters 4, the program shall exit.
```
1-> Print all the URL
2-> Add a new URL
3-> Return the last URL
4-> Exit
4
Goodbye...
```

## Test case
- Retrieve the last visited site URL shall output: ```https://dev.java```

- Add the site URL `https://safcsp.org.sa`

- Retrieve the last visited site URL shall output: ```https://safcsp.org.sa```


## Qualification to pass
- [ ] The program shall run successfully without any error.
- [ ] The Program's output shall match the use case output.
- [ ] The program shall have all the features mentioned above.


## Code 
```java 
class Main {

    public static void main(String [] args) {

        // your code here
    }
}
```
