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
5. 
