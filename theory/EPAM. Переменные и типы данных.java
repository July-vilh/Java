// ----------------------------------------   VARIABLES  ---------------------------------------------------

BOOLEAN = False/ True
INTEGER = whole number (целые числа)
FLOAT / DOUBLE = floating point
CHAR, STRING = symbol/string
ARRAY (МАССИВ)
MAP/ DICTIONARY = associate array, (key, value) pair
QUEUE/ STACK 

int number = 7
System.out.println(number);

ARRAY = МАССИВ = Набор однотипных инструментов 

int [] array = {2, 9, 9, 7, 9, 2, 4, 5, 8}

//квадратные скобки использую для того чтобы показать языку что это МАССИВ

array[3] = 7
  

//__________________________________________________  
  
public class Main {
    public static void main(String[] args) {
        int [] array = {2, 9, 9, 7, 9, 2, 4, 5, 8};
        System.out.println(array[0]);
    }
}

// ВЫВЕДЕТСЯ 2

//_____________________________________________________

public class Main {
    public static void main(String[] args) {
        int [] array = {2, 9, 9, 7, 9, 2, 4, 5, 8};
        array[0] = 56;
        System.out.println(array[0]);
    }
}

// ТУТ ТЕПЕРЬ ВЫВЕДЕТСЯ 56 ТАК КАК МЫ ПРИСВОИЛИ НУЛЕВОЙ ПЕРЕМЕННОЙ В МАССИВЕ ЗНАЧЕНИЕ 56
// ЦЕЛЫЙ МАССИВ НЕ ВЫВОДИТСЯ ЦЕЛИКОМ (т.е. если я спринтую на вывод массив без конкретного значения он НЕ ВЫВЕДЕТСЯ, выведется только через запятую куски массива если принтануть!!!)


//___________________________

Char используется для хранения символа (т.е. если мы хотим определенную букву/ символ сохрвнить то для этого надо воспользоваться типом данных char)
  
char firstSymbol = 'h' (ОДИНАРНЫЕ КАВЫЧКИ)!!!!
String text = "hello Java" (ДВОЙНЫЕ КАВЫЧКИ + ЗАГЛАВНАЯ S)!!!!!!

// ТАКИМ ОБРАЗОМ В char можно поместить только 1 значение (примитивный тип данных) в то время как String (в него помещается от 1 и больше значений)!!!
  

String это строка, которую можно представить как массив char (ов)
  

public class Main {
    public static void main(String[] args) {
        char letter = 'h';
        String text = "hello java";

        System.out.println(letter);
        System.out.println(text);
    }
}

// ВЫВОД: 
h
hello java

//____________________________________________

+ Map (Dictionary) = ассоциативный массив то есть это массив в котором есть некая ассоциация между ключом и значением (можно представить в виде карты или как СЛОВАРЬ)
Данный тип удобен для хранения конкретных связей 
 
+ Queue это очередь в которой действует принцип first in / first up это значит что если ты первый встал в очередь то ты первый из этой очереди и выйдешь
То есть элементы которые мы будем добавлять в очередь, будут дописываться в конец очереди. А элементы которые мы будем забирать из очереди (методом GET) они будут находиться
в начале очереди


