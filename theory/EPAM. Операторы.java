1) -- ++ 
Это операторы Декремента и Инкремента. Они позволяют уменьшить (декремент) или увелисить (инкремент) число на 1
//1.1. Инкремент (++) = +1:

public class Main {
    public static void main(String[] args) {
        int number = 7;
        number++;

        System.out.println(number);
    }
}

// РЕЗУЛЬТАТ: 8
//______

//1.2. декремент (--) = -1:

public class Main {
    public static void main(String[] args) {
        int number = 7;
        number--;

        System.out.println(number);
    }
}

//РЕЗУЛЬТАТ: 6
____________________________________________________________________________________

2) +-*/% (операции: СЛОЖЕНИЯ, ВЫЧИТАНИЯ, УМНОЖЕНИЯ, ДЕЛЕНИЯ, % = ДЕЛЕНИЕ С ОСТАТКОМ)

//2.1. КЛАССИЧЕСКОЕ ЦЕЛОЧИСЛЕННОЕ ДЕЛЕНИЕ:
  
public class Main {
    public static void main(String[] args) {
        int number = 7;
        int divide = 3;

        System.out.println(number/divide);
    }
}

// РЕЗУЛЬТАТОМ БУДЕТ 2

______________

//2.2. !!!! ЧТО БЫ ВЫВЕЛСЯ РЕЗУЛЬТАТ ПОЛНЫЙ (НЕ ЦЕЛОЕ ЧИСЛО, А КАК В КАЛЬКУЛЯТОРЕ, ДЛЯ ЭТОГО ВСЕ ПЕРЕМЕННЫЕ НАДО ОБЪЯВИТЬ КАК double) !!!!!

public class Main {
    public static void main(String[] args) {
        double number = 7;
        double divide = 3;
        double result = number/divide;

        System.out.println(result);
    }
}

// ТУТ РЕЗУЛЬТАТОМ БУДЕТ: 2.3333333333333335
________________

// 2.3. ОСТАТОК ОТ ДЕЛЕНИЯ (%):

public class Main {
    public static void main(String[] args) {
        int number = 7;
        int divide = 3;
        int result = number%divide;

        System.out.println(result);
    }
}

// РЕЗУЛЬТАТ: 1
_____________________________________________________________________________________

3) == и != (двойное равно/ СТРОГО РАВНО и НЕРАВНО)

// 3.1. СТРОГО РАВНО
    
public class Main {
    public static void main(String[] args) {
        int number = 7;
        int divide = 3;
        boolean equals = number==divide;

        System.out.println(equals);
    }
}

// РЕЗУЛЬТАТ: false
_____________

public class Main {
    public static void main(String[] args) {
        int number = 3;
        int divide = 3;
        boolean equals = number==divide;

        System.out.println(equals);
    }
}

// РЕЗУЛЬТАТ: true
_________________________________

//3.2. НЕРАВНО (!=):

public class Main {
    public static void main(String[] args) {
        int number = 3;
        int divide = 3;
        boolean equals = number!=divide;

        System.out.println(equals);
    }
}

// РЕЗУЛЬТАТ: false

______________________________________________________________________________________________

//4) ОПЕРАТОР AND (&&) и ОПЕРАТОР OR (||)
    
//4.1. OR (ИЛИ): тут мы платим зарплату при условии что хотя бы одно из условий истино

public class Main {
    public static void main(String[] args) {
        boolean hasSalary = true;
        boolean hasBonus = false;
        boolean hasSomethingToPay = hasSalary || hasBonus;

        System.out.println(hasSomethingToPay);
    }
}

//РЕЗУЛЬТАТ: true

___________

// 4.2. AND (И): тут мы платип зп только если 2 условия истины (если хотя бы 1 из условий не истино то результат будет фолс и зп не будет оплачиваться):

public class Main {
    public static void main(String[] args) {
        boolean hasSalary = true;
        boolean hasBonus = false;
        boolean hasSomethingToPay = hasSalary && hasBonus;

        System.out.println(hasSomethingToPay);
    }
}

//РЕЗУЛЬТАТ: false

>< >= <=
