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

