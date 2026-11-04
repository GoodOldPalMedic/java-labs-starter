package edu.course.lab01;

/*
## Обязательное задание

Дополните существующий класс `CourseToolkit`, не удаляя метод `isEven`:

```java
public final class CourseToolkit {
    public static boolean isEven(int number);
    public static boolean isPrime(int number);
    public static boolean isPalindrome(String text);
    public static double average(int[] values);
}
```

### Контракт

1. `isPrime` возвращает `false` для числа меньше 2.
2. `isPrime` корректно обрабатывает 2, составные числа и квадраты простых чисел.
3. `isPalindrome` сравнивает строку в точности: регистр и пробелы значимы.
4. Для `null` метод `isPalindrome` выбрасывает `IllegalArgumentException`.
5. `average` возвращает дробный результат и не изменяет массив.
6. Для `null` или пустого массива `average` выбрасывает `IllegalArgumentException`.
7. Методы ничего не печатают в консоль.

*/

/**
 * Небольшие методы для первой лабораторной работы.
 */
public final class CourseToolkit {

    private CourseToolkit() {
        // Утилитарный класс не должен иметь экземпляров.
    }

    /**
     * Возвращает true, если число четное.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number ; i++) 
            if (number % i == 0) 
                return false;
            
        
        return true;
    }

    public static boolean isPalindrome(String text) {
        if (text == null)
            throw new IllegalArgumentException("not null");
        int length = text.length();
        int rightIndex = length - 1;
        for (int leftIndex = 0; leftIndex < length/2; leftIndex++, rightIndex--) {
            if (text.charAt(leftIndex) != text.charAt(rightIndex)){
                return false;
            }
        }
        return true;
    }

    public static double average(int[] values) {
        if (values == null || values.length == 0)
            throw new IllegalArgumentException("not null");
        double sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum / values.length;
    }
}
