package org.reverseletter;

public class TwoPointerReverse {

    static String reverse(String input){

        //Выполняем преобразование строки в массив
        char[] inputArray = input.toCharArray();

        //Объявляем 2 счетчика: идём с краёв к центру
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            // Слева не буква — пропускаем, она остаётся на месте
            if (!Character.isLetter(inputArray[start])) {
                start++;
                continue;
            }

            // Справа не буква — пропускаем
            else if (!Character.isLetter(inputArray[end])) {
                end--;
                continue;
            }

            //Обе позиции — буквы: меняем местами
            char leftLetter = inputArray[start];
            inputArray[start] = inputArray[end];
            inputArray[end] = leftLetter;

            start++;
            end--;
        }

        return new String(inputArray);
    }
}
