public class ReverseLetterMethod1 {
    public static void main(String[] args) {
        //Объявляем строку
        String input = "J@va the be$t!123";

        //Выполняем преобразование строки в массив
        char[] inputArray = input.toCharArray();

        //Объявляем 2 счетчика: идём с краёв к центру
        int start = 0;
        int end = input.length() -1;

        while (start < end)
        {
            // Слева не буква — пропускаем, она остаётся на месте
            if (!Character.isLetter(inputArray[start]))
            {
                start++;
                continue;
            }

            // Справа не буква — пропускаем
            else if (!Character.isLetter(inputArray[end]))
            {
                end --;
                continue;
            }

            //Обе позиции — буквы: меняем местами
            char leftLetter  = inputArray[start];
            inputArray[start] = inputArray[end];
            inputArray[end] = leftLetter;

            start++;
            end--;
        }

        //Выводим массив на экран
        System.out.println(new String(inputArray));
    }
}