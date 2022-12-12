Arrays
An array needs to be declared, just like a variable, with the type of the items it will hold.
To declare an array, you need to define the type of the elements with square brackets.

int[ ] ages;

The name of the array is ages. The type of elements it will hold is int.
  
1. Now, to create the array, we need to specify the number of items it will hold using the new keyword:

int[ ] ages;
ages = new int[5];
The code above creates an array of 5 integers.
  
2. We can combine the above code into one line:

int[] ages = new int[5];

3. The items in an array are accessed using their position, also called their index.
Here is an example, setting the item with the index 2 to the value 25:

ages[2] = 25;

The index is specified in square brackets, next to the array name.
  
4. The item with index 2 is actually the 3rd item of the array.
That is because array indexes start from 0, meaning that the first elements index is 0 rather than one. So, the maximum index of the array int[5] is 4.
Lets set the first items value:

ages[0] = 18;

5. Similar to setting values, we can also access values of the array, using square brackets and the index of the item we want to access:

System.out.println(ages[2]);

6. If you already know what values to store in the array, instead of assigning them one by one, you can use the following syntax:

String[ ] names = { "A", "B", "C", "D"};
System.out.println(names[2]);

Place the values in a comma-separated list, enclosed in curly braces.
The code above automatically creates an array containing 4 items, and stores the provided values.
  
Sometimes you might see the square brackets placed after the array name, which also works, but the preferred way is 
to place the brackets after the arrays data type.

7. To use a loop, we first need to find out how many items the array stores. 
For that, the array has a length property, which is accessed like this:

int[] ages = {18, 33, 24, 64, 45};
System.out.println(ages.length); 

8. ow, when we know the number of items, we can use a for loop and output all the items of the array:

int[] ages = {18, 33, 24, 64, 45};

for(int x=0; x<ages.length; x++) {
  System.out.println(ages[x]);
}

We used the x variable of the loop as the index for our array. During each iteration of the loop, the next item of the array is accessed.
  
9. We can also use a for loop to make calculations using array values. For example, lets calculate the sum of all values in an array:

int[] ages = {18, 33, 24, 64, 45};
int sum = 0;
for(int x=0;x<ages.length;x++) {
  sum += ages[x];
  System.out.println(sum);
}

In the code above, we declared a variable sum to store the result and assigned it 0. 
Then we used a for loop to iterate through the array, and added each items value to the variable.
  
10. Java provides another version of the for loop, called the for-each loop, to loop over arrays, making the code shorter and easier to read.
Here it is:

int[] nums = {2, 3, 5, 7};

for (int x: nums) {
  System.out.println(x);
}

The loop creates a variable, which automatically is assigned to each value of the array during the loop.
You can call the variable anything you want: we called it x in our example.
  
11. Lets use a for-each loop to calculate the sum of all values of an array:

int[] ages = {18, 33, 24, 64, 45};
int sum = 0;
for(int x: ages) {
  sum += x;
}
System.out.println(sum);
