for Loop. The for loop has 3 components:

for(int x=1; x<5; x++) {
  System.out.println(x);
}

The first part runs once when we enter the loop and initializes the variable.
The second part is the condition of the loop.
The third part runs every time the loop runs.
_______________
You can have any type of condition and any type of increment statements in the for loop. The example below prints only the even values between 0 and 10:

for(int x=0; x<=10; x+=2) {
  System.out.println(x);
}
_________________
Loop Control

Example:
int x = 1;

while(x < 10) {
 System.out.println(x);
  if(x == 4) {
    break;
  }
  x++;
}

break
It also works in the for loop:

for(int x=1; x<10; x++) {
  System.out.println(x);
  if(x == 4) {
    break;
  }
}

Here is one example use case of break:
For example, you are making a calculator and need to take numbers from the user to add together and stop when the user enters "stop".
In this case, the break statement can be used to end the loop when the user input equals "stop".
_________________________
continue
Another control statement is continue.
It makes the loop skip the current iteration and go to the next one.

Example:

for(int x=10; x<=40; x+=10) {
  if(x == 30) {
    continue;
  }
  System.out.println(x);
}

The above code skips the value of 30, as directed by the continue statement. 
  
An example use case of continue:
An airline ticketing system needs to calculate the total cost for all tickets purchased. Tickets for children under the age of 3 are free. 
We can use a while loop to iterate through the list of passengers and calculate the total cost of their tickets. 
Here, the continue statement can be used to skip the children.
______________
