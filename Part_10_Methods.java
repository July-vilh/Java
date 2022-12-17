Methods

1. You can define your own methods to perform your desired tasks.
Here is an example:

static void welcome() {
  System.out.println("Welcome");
  System.out.println("I am a method");
  System.out.println("End of method");
}
_________
The code above declares a method called welcome, which prints 3 lines of text.
Note that the name of the method is followed by parentheses (). The statements of the method are inside curly braces.
_________ 
2. Let's look at the code again:

static void welcome() {
  System.out.println("Welcome");
  System.out.println("I am a method");
  System.out.println("End of method");
}

- static is needed to be able to use the method in main. You will learn about the static keyword in more advanced lessons.
- void means that this method does not have a return value. You will learn more about return values later in this module.
- welcome is the name of the method.
_____________ 
3. After defining the method, we can use it in our program by "calling" it.
To call a method, type its name followed by a set of parentheses.
For example:

public static void main(String[] args) {
  welcome();
}
____
4. You can call a method as many times as necessary.

Example:

class Demo {
  static void welcome() { 
    System.out.println("Welcome"); 
    System.out.println("I am a method"); 
    System.out.println("End of method"); 
  }
  public static void main(String[] args) {
    welcome();
    //some code
    welcome();
    welcome();
  }
}

Как результат: 
Welcome
I am a method
End of method
Welcome
I am a method
End of method
Welcome
I am a method
End of method

9 строк, т.к. 3 переменных, каждая из которых содержит 3 строки
_____
5. Methods can have parameters, which they can use in their code.
The parameters are defined in the parentheses, and can be used like variables in the method.

For example, lets add a name String parameter to our welcome() function:

static void welcome(String name) {
  System.out.println("Welcome, " + name);
}

The method above takes a String called name as its parameter, which is used in the method.
Now, when calling the method, we need to pass it a value for the name parameter inside the parentheses:

class Demo {
  static void welcome(String name) { 
    System.out.println("Welcome, "+name);
  }
  public static void main(String[] args) {
    welcome("James");
    welcome("Amy");
  }
}

Результат: Welcome, James Welcome, Amy
_______
6. Methods can take multiple parameters. For that, we simply need to separate them using commas, for example:

static void welcome(String name, int age) {
  System.out.println("Welcome, "+name);
  System.out.println("Your age: "+age);
}

Now, our welcome() method takes a String and an integer as its parameters.
________
7. Now, when calling the function, we need to provide all the parameters:

class Demo {
  static void welcome(String name, int age) {
    System.out.println("Welcome, "+name);
    System.out.println("Your age: "+age);
  }
  public static void main(String[] args) {
    welcome("James", 42);
    welcome("Amy", 25);
  }
}

Результат:

Welcome, James
Your age: 42
Welcome, Amy
Your age: 25
 ______
8. Method parameters are really handy! They allow our method to work with different values and produce results.

For example, we can create a method to calculate a given percentage of a number and output it:

static void perc(double num, int percentage) {
  double res = num*percentage/100;
  System.out.println(res);
}
