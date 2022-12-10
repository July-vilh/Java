1. switch
Instead of many if else statements, which become hard to read, we can use a switch statement.

A switch statement tests a variable for equality against a list of values.

Here is the previous example using a switch statement:

int day = 2;

switch(day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
}

____
2. It is important to have a break statement for each case.
If no break appears, the program will continue to execute the next case in the switch, even if the value does not match the variable that is switched on.
Run this example to see what happens when there is no break in the case:

int day = 2;

switch(day) {
  case 1:
    System.out.println("Monday");
  case 2:
    System.out.println("Tuesday");
  case 3:
    System.out.println("Wednesday");
}

RESULT: Tuesday
        Wednesday

____
3. The default Case
A switch statement can have an optional default case.
Оператор switch может иметь необязательный регистр по умолчанию.

 int day = 5;

        switch(day) {
        case 1:
            System.out.println("Monday");
        case 2:
            System.out.println("Tuesday");
        case 3:
            System.out.println("Wednesday");
        default: 
            System.out.println("Another day");
        }
    }
}

RESULT: Another day

