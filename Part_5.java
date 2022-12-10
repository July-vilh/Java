Loops
1. Loops allow you to repeat a block of code multiple times.

For example, a banking app can loop over all bank transactions and check for some conditions.
 
2. while Loops
A while loop statement repeatedly executes a target statement as long as a given condition is true.

Example:

int x = 3;

while(x > 0) {
  System.out.println(x);
  x = x-1;
}

RESULT: 3
        2
        1

The while loops check for the condition x > 0. If it evaluates to true, it executes the statements within its body. Then it checks for the statement again and repeats.
The code above will output the numbers 3 to 1, and then stop, as the condition will become false, after x reaches 0.

3. 
  
int x = 3;

while(x > 0) {
  System.out.println(x);
  x = x-1;
}

The line x = x-1; is important, as without it the condition would never become false and the loop would run forever. 
Each time the loop runs, 1 is subtracted from x.
 
4. As it is common to decrease or increase a variable by 1 during loops, Java provides increment and decrement operators.

These are a shorter way to increase or decrease the value of a variable by one.

For example, the statement x=x-1; can be simplified to x--;

while(x > 0) {
  System.out.println(x);
  x--;
}

RESULT: 3
        2
        1
 
5. INCREMENTS

Similarly, the increment operator ++ is used to increase the value of a variable by one.
Here is a loop that outputs the numbers 1 to 10:

int x = 1;

while(x <= 10) {
  System.out.println(x);
  x++;
}
JAVA

RESULT: 1
        2
        3
        4
        5
        6
        7
        8
        9
       10
