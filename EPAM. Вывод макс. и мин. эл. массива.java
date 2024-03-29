__________________________________________________________________________________________________________________________

-------------------------------------------  Код на вывод максимального и минимального значения в массиве ----------------------------------------------------

----------------------------------------------------- НА ОСНОВЕ МАЛЕНЬКОГО МАССИВА ---------------------------------------------------------------
    
public class Main {
    public static void main(String[] args) {
        int [] arraySmall = {20, 91, 64, 75, 19, 26, 48, 55, 89};
        int [] arrayRandom = {70, 79, 98, 13, 75, 96, 24, 36, 88, 85, 47, 85, 56, 32, 5, 69, 86, 45, 82};
        printMaximumElement(arraySmall);

    }
    static void printMaximumElement(int[] array) {
        int max = array[0];
        int maxIndex = 0;
        int comparisons = 0;
        int replacements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
                replacements++;
            }
            comparisons++;
        }
        System.out.println("Max element: " + max);
        System.out.println("Max element index: " + maxIndex);
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Replacements: " + replacements);
    }
}

___________________________________________________________________________________________________
-------------------------------------------------  ПО КУСКАМ: ------------------------------------------------------

1. int max = array[0];

Тут мы задем максимальному значению первый порядковый номер массива (то есть число 20 будет)
___________________

2. int comparisons = 0;

Это количество сравнений, которые будет делать алгоритм
__________________

3. int replacements = 0;

Это количество замен минимума и максимума соответственно
____________

4. for (int i = 0; i < array.length; i++) {

Это счетчик, в котором мы значению i присваиваем 0 и пока i меньше длины массива (array.length) то есть чем 9 мы будем увеличивать i на 1 и проходить эту операцию циклично
_____________

5.  if (array[i] > max) {
                max = array[i];
                maxIndex = i;
                replacements++;
                
если порядковый элемент массива [i] будет больше чем максимум то максимум будет равен этому элементу
* максимальный индекс будет равен i (то есть порядковый номер массива)
* количество замен будет увеличиваться на 1

_____________________

6. comparisons++;

Тут мы выйдем из цикла и посчитаем сколько было сравнений и сколько замен

______________________________________________

--------------------------------------------------  ИТОГ: ----------------------------------------------------------

Max element: 91
Max element index: 1
Comparisons: 9
Replacements: 1

_____________________________________________________________________________________________________________________________________________________

----------------------------------------- НА ОСНОВЕ ДЛИННОГО МАССИВА ------------------------------------------------------------------------------

public class Main {
    public static void main(String[] args) {
        int [] arraySmall = {20, 91, 64, 75, 19, 26, 48, 55, 89};
        int [] arrayRandom = {70, 79, 98, 13, 75, 96, 24, 36, 88, 85, 47, 85, 56, 32, 5, 69, 86, 45, 82};
        printMaximumElement(arrayRandom);

    }
    static void printMaximumElement(int[] array) {
        int max = array[0];
        int maxIndex = 0;
        int comparisons = 0;
        int replacements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
                replacements++;
            }
            comparisons++;
        }
        System.out.println("Max element: " + max);
        System.out.println("Max element index: " + maxIndex);
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Replacements: " + replacements);
    }
}

_________________________________

ИТОГ:

Max element: 98
Max element index: 2
Comparisons: 19
Replacements: 2
