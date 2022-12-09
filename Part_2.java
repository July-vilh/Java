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
