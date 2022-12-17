1. You are making a program for a water sensor that should check if the water is boiling.
Take the integer temperature in Celsius as input and output "Boiling" if the temperature is above or equal to 100. Output "Not boiling" if it's not.
Sample Input
105

Sample Output
Boiling

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int temp = in.nextInt();

    if (temp >= 100) {
      System.out.println("Boiling");
    } else {
      System.out.println("Not boiling");
    }
  }
}

___________________________________________
2. You are making a robot that should categorize items by their color. Each color corresponds to a box with a specific number.
For simplicity, our program will handle 3 colors:
red goes to box #1
green goes to box #2
black goes to box #3

Your program needs to take a color as input and output the corresponding box number.
Sample Input
green

Sample Output
2

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String color = in.nextLine();

    switch (color) {
      case "red":
        System.out.println("1");
        break;
      case "green":
        System.out.println("2");
        break;
      case "black":
        System.out.println("3");
        break;
    }
  }
}

___________________________________________________________________
3. Given the age of a person as an input, output their age group. Here are the age groups you need to handle:
Child: 0 to 11
Teen: 12 to 17
Adult: 18 to 64

Sample Input
42

Sample Output
Adult

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int age = in.nextInt();

    if (age >= 0 && age <= 11) {
      System.out.println("Child");
    } else if (age >= 12 && age <= 17) {
      System.out.println("Teen");
    } else if (age >= 18 && age <= 64) {
      System.out.println("Adult");
    }
  }
}

____________________________________________________
4. Your math teacher asked you to calculate the sum of the numbers 1 to N, where N is a given number.
Task: Take an integer N from input and output the sum of the numbers 1 to N, inclusive.

Sample Input:
10

Sample Output:
55
  
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += i;
    }

    System.out.println(sum);
  }
}
______________________________
5. The factorial of a number N is equal to 1 * 2 * 3 * ... * N. For example, the factorial of 5 is 1* 2 * 3 * 4 * 5  = 120.
Use a for loop to make the calculation, and start the loop from the number 1. Create a program that takes a number from input and output the factorial of that number.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number = scanner.nextInt();

    int factorial = 1;

    for (int i = 1; i <= number; i++) {
      factorial *= i;
    }

    System.out.println(factorial);
  }
}
______________________________

6. You are making a program for a vending machine that provides drinks. The menu of the drinks is stored in an array called menu:
String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"}; 

Take the choice of the customer as an integer from input and output the corresponding menu item.
Also, check for errors: in case the input is out of the range of the array, output "Invalid".

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
 Scanner scanner = new Scanner(System.in);

    int choice = scanner.nextInt();

    if (choice >= 0 && choice < menu.length) {
System.out.println(menu[choice]);
    } else {
      System.out.println("Invalid");
    }
  }
}
__________________________
7. The given code declares an array that holds the monthly revenues for a company for a year.
You need to calculate the average monthly revenue for the year. For that, calculate the sum of the revenue for all the months and divide it by the number of items in the array.
 
 public class Program {
    public static void main(String[] args) {
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
        double sum = 0;

        for (double x : revenue) {
            sum += x;
        }
        System.out.println(sum / 12);
    }
}
___________
8. You are creating a ticketing program for a small movie theater.
The seats are represented using a 2-dimensional array. Each item can have the values 1 and 0 - 1 is occupied, and 0 if it's free.
Your program needs to take as input the row and the column of the seat and output Free if it's free, and Sold if it's not.
  
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        int[][] seats = {
        {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
        {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
        {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);
     
    int row = sc.nextInt();
    int column = sc.nextInt();

    if(seats[row][column] == 0){
        System.out.println("Free");
    } else System.out.println("Sold");
  }
}
