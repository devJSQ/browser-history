# Visited Site History Tracker

## Objective 
Use data structure and algorithms, to store data from a text file.

## Problem 

You are developing a program to simulate the management of browser history. The program needs to keep track of visited URL sites so that the user can navigate to new or previous sites.

To interact with the program, the user requires a display menu to choose whether to **view the last visited site**, **add a new site**, or **exit the program**.

> The history of the visited sites is stored in a text file.

## Features 
- Menu display to interact with the program.
- Add a new site to the history.
- Read the URL visited site from the `history.txt` file.
- Retrieve the last visited site URL.


## Implementation
- Create a method to display the menu to interact with the program. If the user choice is 1, retrieve the last visited site URL. If 2, add a new site URL. Lastly, if the user choice is 3, exit the program.
- Create a class `Display` which has methods to read the `history.txt` file and store it in a list.
- Create a method to retrieve the last visited site URL from the list.
- Create a method to add a new site URL to the list.

## Example
When the program runs, the user shall see the following menu:
```
Visited site navigation
Enter your choice
_________________________
1-> New site URL
2-> Previous site URL
3-> Exit
```
If the user enters 1, the program shall prompt the user to enter the new site URL.
```
1-> New site URL
2-> Previous site URL
3-> Exit
1
Enter site URL: safcsp.org.sa
```

If the user enters 2, the program shall display the last visited site URL.
```
1-> New site URL
2-> Previous site URL
3-> Exit
2
Previous site: safcsp.org.sa
```

If the user enters 3, the program shall exit.
```
1-> New site URL
2-> Previous site URL
3-> Exit
3
Exiting...
```

## Test case
- Retrieve the last visited site URL shall output: ```http://example.com```

- Add the site URL `https://safcsp.org.sa`

- Retrieve the last visited site URL shall output: ```https://safcsp.org.sa```


## Qualification to pass
- [ ] The program shall run successfully without any error.
- [ ] The Program's output shall match the use case output.
- [ ] The program shall have all the features mentioned above.


## Code 
```java 
import java.io.IOException;

public class Main {

    static Display display = new Display();
    
    static Stack stack = new Stack();

    public static void main(String[] args) throws IOException {

        display.readFile();
        display.display();
    }
}

```
