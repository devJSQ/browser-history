# Visited Site History Tracker

## Objective 
Use data structure and algorithms, to store data from a text file.

## Problem 

You are developing a program to simulate the management of browser history. The program needs to keep track of visited URL sites so that the user can navigate to new or previous sites.

To interact with the program, the user requires a display menu to choose whether to **return the last visited site**, **add a new site**, or **exit the program**.

> The history of the visited sites is stored in a text file.

## Features 
- Menu display to interact with the program.
- Add a new site URL to the `history.txt` file.
- Read the URL visited site from the `history.txt` file.
- Retrieve/pop the last visited site URL from the `history.txt` file.


## Implementation
- Take an input from the user, so if the input is 1, **print the last visited site URL from** `history.txt`, if the user input is 2, **add a new site URL to the** `history.txt`, and if the input is 3 then **exit the program**.
- Create a class `BrowserHistory` which has methods two methods `previousURL` and `addURL`.
    - The `previousURL` method will return the last URL from the `history.txt`, and then remove it from the `history.txt`.
    - The `addURL` method will add a URL to the `history.txt`.

> Note if the user inputs 2 the `addURL` method will invoked and if the user inputs 1 the `previousURL` method will invoke.

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
The user enters 1, the program shall return the last visited site URL and remove it from `history.txt`.
```
1-> New site URL
2-> Previous site URL
3-> Exit
1
Previous site: https://dev.java
```

The user enters 2, the program shall prompt the user to enter a new site URL and save the URL to `history.txt`.
```
1-> New site URL
2-> Previous site URL
3-> Exit
2
Enter site URL: safcsp.org.sa
```

The user enters 1, the program shall display the last visited site URL.
```
1-> New site URL
2-> Previous site URL
3-> Exit
1
Previous site: safcsp.org.sa
```

The user enters 3, the program shall exit.
```
1-> New site URL
2-> Previous site URL
3-> Exit
3
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
