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


