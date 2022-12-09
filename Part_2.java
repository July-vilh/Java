Input
To take input from the user, we first must import the corresponding class.
That is done using the following line:

import java.util.Scanner;

This imports the Scanner class, which we will use for taking input. 
Это импортирует класс Scanner, который мы будем использовать для приема входных данных.
  
After importing the Scanner class, we need to create a Scanner object:
Scanner sc = new Scanner(System.in);

В зависимости от типа данных может использоваться разный строковый ввод:
Similarly, we can take a integer as input using nextInt():

int age = sc.nextInt();
double weight = sc.nextDouble();
float size = sc.nextFloat();
boolean decision = sc.nextBoolean();

Multiple Inputs
You can use the same Scanner to take multiple inputs.

For example, lets take the name and age as input and output them

Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
int age = sc.nextInt();
System.out.println(name+": "+age);

That's how you take input from the user in Java!

Here are the steps:
1. import the java.util.Scanner class.
2. create a Scanner object:

Scanner sc = new Scanner(System.in);

3. Use the corresponding method of the Scanner to take input, for example:
int num = sc.nextInt();


CONDITIONALS
Conditional statements are used to perform different actions based on different conditions. 

For example, a billing program can apply a discount to the total only if the amount is greater than a threshold. 

Например, программа выставления счетов может применить скидку к общей сумме только в том случае, если сумма превышает пороговое значение.

The if statement is one of the most frequently used conditional statements.
If the if statements condition is true, the block of code inside the if statement is executed. 

Syntax:
if (condition) {
  //some code 
}

Any of the following comparison operators may be used to form the condition:

< less than

> greater than

!= not equal to

== equal to

<= less than or equal to

>= greater than or equal to

For example:

int age = 24;
if(age >= 18) {
  System.out.println("Welcome");
}

Remember that you need to use two equal signs (==) to test for equality, since a single equal sign is the assignment operator.
Помните, что вам нужно использовать два знака равенства (==) для проверки на равенство, поскольку один знак равенства является оператором присваивания.
  
int number = 8;
if(number == 8) {
  System.out.println("Bingo");
}

ELSE STATEMENT
An if statement can be followed by an optional else statement, which executes when the condition evaluates to false.

For example:

int age = 30;

if (age < 16) {
  System.out.println("Too Young");
} else {
  System.out.println("Welcome!");
}

Если age меньше 16 то Too Yong
если больше 16 то Welcome

int age = 25;
if(age > 0) {
  if(age > 16) {
    System.out.println("Welcome!");
  } else {
    System.out.println("Too Young");
  }
} else {
  System.out.println("Error");
}

else if Statements
Instead of using nested if-else statements, you can use the else if statement to check multiple conditions.

For example:

int age = 25;

if(age <= 0) {
   System.out.println("Error");
} else if(age <= 16) {
   System.out.println("Too Young");
} else if(age < 100) {
   System.out.println("Welcome!");
} else {
   System.out.println("Really?");
}

0 или -5 Error
14 или 16 Too Young
25 Welcome
101 и больше Really?
