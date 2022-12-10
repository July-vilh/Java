DO-WHILE LOOP

class Demo {
    public static void main(String[ ] args) {
        int x = 1;
        do {
            System.out.println(x);
            x++;
        } while(x < 5);
    }
}

RESULT: 1
        2
        3
        4
  
Notice that the condition appears at the end of the loop, so the statements in the loop execute once before it is tested.
Обратите внимание, что условие появляется в конце цикла, поэтому инструкции в цикле выполняются один раз перед его проверкой.
Даже при ложном условии код будет запущен один раз.
  
The difference between while and do-while is that do-while is guaranteed to run at least once, even with a false condition.
Разница между while и do-while заключается в том, что do-while гарантированно выполняется хотя бы один раз, даже при ложном условии. 
  

ЗАДАЧА:
Your math teacher asked you to calculate the sum of the numbers 1 to N, where N is a given number.

Task: Take an integer N from input and output the sum of the numbers 1 to N, inclusive.

Sample Input:

10

Sample Output:

55

РЕШЕНИЕ:
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += i;
    }

    System.out.println(sum);
  }
}

