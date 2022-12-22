Комби массив
1.
public class Demo {
    public static void main(String[] args) {
        int[][] sample = { {1, 2, 3}, {4, 5, 6} };
        int x = sample[1][0];
        System.out.println(x);
    }
}

Тут выведет первый массив и нулевое значение в нем. Как результат: 4
______________
2. The array's two indexes are called row index and column index.

Here is how we can visualize it:

int[][] sample = {
{1, 2, 3},
{4, 5, 6}
};

Each row is an item, which is an array. So, to access a value, we provide the row index, then the column index. 
__________
3. To loop over a 2-dimensional array, we need nested for loops:

int[][] sample = {
{1, 2, 3},
{4, 5, 6}
};
for(int x=0; x<sample.length; x++) {
  for(int y=0; y<sample[x].length; y++) {
    System.out.println(sample[x][y]);
  }
}
The first loop iterates over the rows, which the second one over their items. Результат: 1 2 3 4 5 6
______________
