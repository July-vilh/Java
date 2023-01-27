Control Flow Statements (Управялющие конструкции). LOOPS (ЦИКЛЫ)
  
1) if-then-else
2) switch
3) while, do-while
4) for
5) break, continue, return
  
____________________________________________________________________________________
  
// 1) IF (if - then - else):

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        if (a <= b) {
            System.out.println("a <= b");
        } else {
            System.out.println("a > b");
        }
    }

}

// РЕЗУЛЬТАТ: a <= b
// ДОПОЛНИТЕЛЬНО МОЖНО В КОД ДОБАВЛЯТЬ ДОПОЛНИТЕЛЬНЫЕ УСЛОВИЯ (НАПРИМЕР else if) или просто не добавлять else и оставлять чисто if только 

_________________________________________________________________________________

// 2) SWITCH может использоваться при перебирании кучи условий для поиска подходящего, например у нас есть номер месяца 4 и нам нужно определить название этого 
// месяца в строковом варианте. С помощью if это может выглядеть так:

public class Main {
    public static void main(String[] args) {
        int month_Number = 4;

        if (month_Number == 1) {
            System.out.println("January");
        } else if (month_Number == 2) {
            System.out.println("February");
        } else if (month_Number == 3) {
            System.out.println("March");
        } else if (month_Number == 4) {
            System.out.println("April");
        }
    }
}

! ОГРОМНЫЙ МИНУС ТАКОГО СПОСОБА В ОГРОМНОМ КОЛИЧЕСВЕ СТРОК, ПОЭТОМУ ДЛЯ ПЕРЕБОРА И УПРОЩЕНИЯ МОЖНО ИСПОЛЬЗОВАТЬ SWITCH!!!!
  
public class Main {
    public static void main(String[] args) {
        int month_Number = 4;

        switch (month_Number) {
            case 1:
                System.out.println ("Jan");
            case 2:
                System.out.println ("Feb");
            case 3:
                System.out.println ("Mar");
            case 4:
                System.out.println ("Apr");
        }
    }
}

// РЕЗУЛЬТАТ Apr

!!!!!!!!!!!! Также в операторе Switch можно использовать default (в случае если ни один кейс НЕ ОТРАБОТАЕТ) !!!!!!!!!!!!!!!!
  
public class Main {
    public static void main(String[] args) {
        int month_Number = 9;

        switch (month_Number) {
            case 1:
                System.out.println ("Jan");
            case 2:
                System.out.println ("Feb");
            case 3:
                System.out.println ("Mar");
            case 4:
                System.out.println ("Apr");
            default:
                System.out.println ("Can't find the month");

        }
    }
}

// РЕЗУЛЬТАТ: Can't find the month

!!!!!!!!!!!!!!!!! ТАКЖЕ В ДАННОМ ЦИКЛЕ МОЖНО ИСПОЛЬЗОВАТЬ КОНСТРУКЦИЮ break ДАБЫ ПОСЛЕ НАХОЖДЕНИЯ ОПРЕДЕЛЕННОГО КЕЙСА НЕ ИДТИ ДАЛЬШЕ И НЕ ПЕРЕБИРАТЬ ОСТАЛЬНЫЕ КЕЙСЫ 
ДЛЯ ЭКОНОМИИ ВРЕМЕНИ !!!!!!!!!!!!!!!
  
public class Main {
    public static void main(String[] args) {
        int month_Number = 1;

        switch (month_Number) {
            case 1:
                System.out.println ("Jan");
                break;
            case 2:
                System.out.println ("Feb");
            case 3:
                System.out.println ("Mar");
            case 4:
                System.out.println ("Apr");
            default:
                System.out.println ("Can't find the month");

        }
    }
}

// РЕЗУЛЬТАТ: Jan

__________________________________________________________________________________________________________________

// 3) WHILE, FOR
// НАПРИМЕР ЗАДАНИЕ ВЫВЕСТИ ВСЕ ЦЕЛЫЕ ЧИСЛА ОТ 0 И ЗАКАНЧИВАЯ ОПРЕДЕЛЕННЫМ ЛИМИТОМ: 

3.1. WHILE (ПОКА)

т.е. пока в круглых скобках (условие) является истинным у нас выполняется операция внутри. СЧЕТЧИК ОТ 0 ДО 10:

public class Main {
    public static void main(String[] args) {
      
        int limit = 10;
        int current_Number = 0;

        while (current_Number < limit) {
                System.out.println (current_Number);
                current_Number = current_Number + 1;

        }
    }
}

// РЕЗУЛЬТАТ: 0 1 2 3 4 5 6 7 8 9
 // !!!!!!!!!!! ОПТИМИЗАЦИЯ ДАННОГО КОДА (ДОБАВЛЕНИЕ ДЕКРЕМЕНТА):

public class Main {
    public static void main(String[] args) {
        int limit = 10;
        int current_Number = 0;

        while (current_Number < limit) {
                System.out.println (current_Number);
                current_Number ++;

        }
    }
}

_______________________________________________________________________________________________

4) FOR (ОБЫЧНО В ФОРЕ ИСПОЛЬЗУЕТСЯ 3 УПРАВЛЯЮЩИХ ЭЛЕМЕНТА) Т.Е. В КРУГЛЫХ СКОБКАХ НАХОДЯТСЯ 3 УСЛОВИЯ, КОТОРЫЕ РАЗДЕЛЕНЫ С ПОМОЩЬЮ ;

- ПЕРВОЕ УСЛОВИЕ: ИНИЦИАЛИЗАЦИЯ (Т.Е. ТУТ МОЖНО ИНИЦИАЛИЗИРОВАТЬ ОПРЕДЕЛЕННЫЙ СЧЕТЧИК, НАПРИМЕР МЫ ИНИЦИАЛИЗИРУЕМ ПЕРЕМЕННУЮ И И ПРИСВАИВАЕМ ЕЙ ЗАНЧЕНИЕ 
(ГОВОРИМ ЧТО СТАРТОВОЕ ЗНАЧЕНИЕ И = 0)
                                 
int i = 0 

                                 
- ВТОРОЕ УСЛОВИЕ: ПРИ КОТОРОМ ЦИКЛ ЗАКОНЧИТСЯ (ПРЕРВЕТСЯ)

- ТРЕТЬЕ УСЛОВИЕ: ЧТО ДЕЛАТЬ КОГДА ЦИКЛ ПРОЙДЕ КРУГ

ИТОГ: 
                                 
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
                System.out.println (i);

        }
    }
}
                                 
// РЕЗУЛЬТАТ: 0 1 2 3 4 5 6 7 8 9
             
// ПРОХОД ПО МАССИВУ (МАССИВ ПРОСТО ТАК НЕЛЬЗЯ ВЫВЕСТИ НА ПЕЧАТЬ ПОЭТОМУ МОЖНО ИСПОЛЬЗОВАТЬ FOR):
// ТАКЖЕ МОЖНО ПЕРЕБИРАТЬ МАССИВ И ВЫПОЛНЯТЬ КАКИЕ-ТО ОПЕРАЦИИ С НИМ:
   
public class Main {
    public static void main(String[] args) {
        int [] array = {0, 9, 9, 7};

        for (int i = 0; i <= 3; i++) {
                System.out.println (array[i]);

        }
    }
}
                                 
// РЕЗУЛЬТАТ: 0, 9, 9, 7
________________________________________________________________________________

5) break, continue, return
  
public class Main {
    public static void main(String[] args) {
        int [] array = {0, 9, 9, 7};

        for (int i = 0; i <= 3; i++) {
                System.out.println ("Cycle #" + i + "start");
                System.out.println (array[i]);
                System.out.println ("Cycle #" + i + "finish");

        }
    }
}

//РЕЗУЛЬТАТ:

Cycle #0start
0
Cycle #0finish
Cycle #1start
9
Cycle #1finish
Cycle #2start
9
Cycle #2finish
Cycle #3start
7
Cycle #3finish

//________________
//НО ЕСЛИ НАПРИМЕР Я НАШЛА УЖЕ 9 И НЕ ХОЧУ (НЕТ СМЫСЛА) ДВИГАТЬСЯ И ИСКАТЬ ДАЛЬШЕ (BREAK):

!!!!!!!!!!!!!!!!! array [i] это число массива на котром я сейчас нахожусь !!!!!!!!!!!!!!!!

public class Main {
    public static void main(String[] args) {
        int [] array = {0, 9, 9, 7};

        for (int i = 0; i <= 3; i++) {
                System.out.println ("Cycle #" + i + "start");
                System.out.println (array[i]);
                if (array[i] == 9) {
                    System.out.println ("Found 9!");
                    break;
                }
                System.out.println ("Cycle #" + i + "finish");
        }
    }
}

// РЕЗУЛЬТАТ: 

Cycle #0start
0
Cycle #0finish
Cycle #1start
9
Found 9!

  
!!!!!!!!!!!!!!!!!!!!! continue означает что мы проспускаем все что будет дальше в цикле и переходим на следующий круг!!!!!!!!!!!!!!!!!!!!
  
ТО ЕСТЬ:

public class Main {
    public static void main(String[] args) {
        int [] array = {0, 9, 9, 7};

        for (int i = 0; i <= 3; i++) {
                System.out.println ("Cycle #" + i + "start");
                System.out.println (array[i]);
                if (array[i] == 9) {
                    System.out.println ("Found 9!");
                    continue;
                }
                System.out.println ("Cycle #" + i + "finish");
        }
    }
}

// ЕСЛИ ПОСМОТРЕТЬ РЕЗУЛЬТАТ, ТО:

Cycle #0start
0
Cycle #0finish
Cycle #1start
9
Found 9!
Cycle #2start
9
Found 9!
Cycle #3start
7
Cycle #3finish

// !!!!!! ТУТ В РЕЗУЛЬТАТЕ ПОСЛЕ ПЕРВОЙ НАЙДЕННОЙ 9 НЕТ СЛОВО ОБ ОКОНЧАНИИ ЦИКЛА, Т.К. ПОСЛЕ НАХОЖДЕНИЯ НЕОБХОДИМОЙ ЦИФРЫ ЦИКЛ ПОВТОРЯЕТСЯ И ВСЕ ЧТО НИЖЕ СЛОВА CONTINUE УЖЕ НЕ КАТИРУЕТСЯ !!!!!!!!!!
  

_______________________________________________________________________________________________________________

return более жестко прервет цикл ( и все что после цикла вовсе не будет больше отрабатываться даже то что уже не входит в этот цмкл и написано просто ниже)
Поэтому для прерывания циклов лучше использовать break нежели return



  
  
