_________________________________________________________________________________________________________________________________

-----------------------------------------        1. double getAverageValue(int[] array) ---------------------------------------
  
Данная функция возвращает double и показывает среднее значение в массиве интов 
То есть если у нас есть массив целых чисел, то данная функция в этом массиве считает среднее и возвращает как double


______________________

----------------------------------------         2. void printArrayToConsole(int[] array)  -------------------------------------
  
Слово void означает что функция ничего не возвращает, то есть мы ничего не можем из этой функции получить 
!!!!!!!!!!!!!!! Данная функция может использоваться для вывода целого массива в консоль !!!!!!!!!!!!!!!
! То есть вызывается метод, в него печататется массив и далее этот массив выводится в консоль ! При этом не ожидается что вернется обратно какой-то результат например в виде подсчета чего-то

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 9, 9, 7};
        printArrayToConsole(array);
    }
        static void printArrayToConsole(int[] arrayToPrint){
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println(arrayToPrint[i]);
        }

    }
}

* ТУТ arrayToPrint.length ЭТО ДЛИНА МАССИВА

_______________________

----------------------------------------         3. void printCurrentTimeToConsole()    -----------------------------------------
  
Напечатать текущее время в консоль. Данная функция ничего не прнимает (никаких значений) и просто выводит текушее время в консоли

________________________________________________
  
----------------------------------------         4. double sum(double a, double b)     -------------------------------------------
  
Данная функция принимает несколько параметров и как итог выводит подсчет (значение) в консоль


public class Main {
    public static void main(String[] args) {
        int [] array = {0, 9, 9, 7};
        printArrayToConsole(array);
        double sum = 0.0;
        sum = sumDouble(a: 1.0, b: 2.0);
        System.out.println(sum);
    }
    static double sumDouble(double a, double b) {
        double sum = a + b;
        return sum;
    }
        
        
        
___________________________________________________ --- КОМБИ ---- ______________________________________________

public class Main {
    public static void main(String[] args) {
        int [] array = {0, 9, 9, 7};
        printArrayToConsole(array);
        double sum = 0.0;
        sum = sumDouble(a: 1.0, b: 2.0);
        System.out.println(sum);
    }
    static double sumDouble(double a, double b) {
        double sum = a + b;
        return sum;
    }
    static void printArrayToConsole(int[] arrayToPrint){
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println(arrayToPrint[i]);
        }

    }
}

ФУНКЦИИ МОГУТ БЫТЬ ОБЪЕДИНЕНЫ В НАБОР ФУНКЦИЙ (БИБЛИОТЕКУ) ПО ТЕМАТИКЕ 



  
