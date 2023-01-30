
------------------------- BUBBLE SORT -------------------------------------------------
  
Работает через сравнивание соседних элементов. И если например элемент слева больше чем элемент справа, он меняет их местами.
ДАННЫЙ АЛГОРИТМ ОБЕСПЕЧИВАЕТ СОРТИРОВКУ ЦЕЛЫХ ЧИСЕЛ

public class Main {
    public static void main(String[] args) {
        int[] arraySimple = {3, 2, 1};
        int[] SortedArray = {19, 20, 26, 48, 55, 64, 75, 89, 91};
        int[] arrayRandom = {70, 79, 98, 13, 75, 96, 24, 36, 88, 85, 47, 85, 56, 32, 5, 69, 86, 45, 82};
        bubbleSort(arraySimple);

    }

    static void bubbleSort(int[] array) {
        int comparisonsDone = 0;
        int swapsDone = 0;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0, i <array.length - 1, i++){
                printArray(array);
                if (array[i] > array[i + 1]) {
                    System.out.println("Swap " + array[i] + " and " + array[i + 1]);
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapsDone++;
                    sorted = false;
                } else {
                    System.out.println("No need to change elements  " + i + " and " + (i + 1));
                }
                comparisonsDone++;
            }
            System.out.println("Array sixe  " + array.length);
            System.out.println("comparisons done  " + comparisonsDone);
            System.out.println("Swaps done  " + swapsDone);
        }
        
  ------------------------------------------------- ПО КУСКАМ: -----------------------------------------------
  
  1. int comparisonsDone = 0;
  
  для подсчета количества переменных
  
 _______________________
 
 2. int swapsDone = 0;
 
 для подсчета количества замен
 
 ______________________
 
 3.  boolean sorted = false;
 
 Данная переменнная сообщает о том, отсортировался массив или нет
 
 ___________________
 
 4.  sorted = true;
            for (int i = 0, i <array.length - 1, i++){
                printArray(array);
                
Тут мы считаем что алгоритм отсортирован и начинаем проход по всем элементам массива

_____________________

5. if (array[i] > array[i + 1]) {

Тут мы проверяем текущий элемент больше ли он чем следующий
 
 if (array[i] > array[i + 1]) {
                    System.out.println("Swap " + array[i] + " and " + array[i + 1]);
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapsDone++;
                    sorted = false;
                    
Если текущий элемент больше чем следующий, то мы их меняем местами 
*  int temp = array[i] тут элемент массива помещаем в переменную temp
* array[i] = array[i + 1]; в него записываем с индексом +1
* то есть если у нас первые цифры массива 20 и 91 то мы в temp записываем 20, затем значение 20 записываем в 91
а 91 записываем в то что сохранили в temp
* swapsDone++; увеличиваем на 1 количество замен 
* sorted = false; означает что массив наш не был отсортирован


___________

6.   } else {
                    System.out.println("No need to change elements  " + i + " and " + (i + 1));
                }
                
Иначе же (если текущий элемент НЕ больше следующего), то выводим в консоль сообщение ...
  
