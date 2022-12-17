1. Return Values
The methods we have seen so far output their result.
In some cases we do not need to output the result, but need to assign it to a variable, to work with it in our program.
In these cases, we need our method to return the result value.
  
Consider a method from our previous lesson, that was used to output a percentage of the given value:

static void perc(double num, int percentage) {
  double res = num*percentage/100;
  System.out.println(res);
}
_____
2. The void keyword in the definition specifies that the method does not return any value.
____
  
3. Here is the same function definition, specifying the return type to be a double:

static double perc(double num, int percentage) {
  ...
}

This means that our perc method will return a value of type double.
______
4. Now, we can return our result using the return keyword:

static double perc(double num, int percentage) {
  double res = num*percentage/100;
  return res;
}

The return keyword stops the method from executing. If there are any statements after return, they won't run.
  
____
5. After we have created our method that returns a value, we can call it in our code and assign the result to a variable:

class Demo {
    static double perc(double num, int percentage) {
        double res = num*percentage/100;
        return res;
    }
    public static void main(String[] args) {
        double x = perc(530, 23);
        System.out.println("Result is: "+x);
    }
}
Result is: 121.9
  

Returning is useful when you dont need to print the result of the method, but need to use it in your code. 
For example, a bank accounts withdraw() method could return the remaining balance of the account.
______
6. Lets create a method that takes two parameters, a String name and a grade of type integer, checks if the grade is over 70 and returns a boolean result.
Then, lets use it in main:

class Demo {
    static boolean check(int grade) {
        if(grade >=70) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int x = 89;
        if(check(x) == true) {
            System.out.println("Congrats!");
        } 
    }
}
результат: Congrats!
_________
7. As you can see, we can use the method in an if statement, because it returns a boolean value.
The method can be used anywhere in our program to check if the grade is passing or not. 
In case anything changes in the logic of the check, we will need to modify the method only, without touching the rest of the program.
