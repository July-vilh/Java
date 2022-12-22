Multiple Conditions

1.In some cases we need to combine multiple conditions, for example, lets say we want to check if the age value is greater than 18 and less than 50.

This can be done using the && operator.

if (age > 18 && age < 50) {
  System.out.println("Welcome!");
}


The && operator is also referred to as the logical AND operator.
  
2. The OR Operator
The OR operator (||) checks if any one of the conditions is true.

For example:

int age = 25;
int height = 100;

if (age > 18 || height > 150) {
  System.out.println("Welcome!");
}

The code above will print Welcome! if age is greater than 18 or if height is greater than 150.

3. NOT
The NOT (!) logical operator is used to reverse the condition.
If a condition is true, the NOT logical operator will make it false, and vice versa.

Example:

int age = 25;
if(!(age > 18)) {
  System.out.println("Too Young");
} else {
  System.out.println("Welcome");

  !(age > 18) reads as "if age is NOT greater than 18".
    
4. Multiple Conditions
You can chain multiple conditions using parentheses and the logical operators.

For example:

String country = "US";
int age = 42;

if((country == "US" || country == "GB") && (age > 0 && age < 100)) {
  System.out.println("Allowed");
}
  
