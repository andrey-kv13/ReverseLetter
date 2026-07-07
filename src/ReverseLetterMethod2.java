public class ReverseLetterMethod2 {

    public static void main(String[] args) {
        String input = "J@va the be$t!123";
        System.out.println(reverseLetters(input));
    }

    /**
     * Разворачивает только буквы в строке; остальные символы остаются на месте.
     */
    static String reverseLetters(String input) {
        StringBuilder reversedLetters = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int letterIndex = 0;

        // Шаг 1: собираем буквы справа налево (уже в обратном порядке)
        for (int i = input.length() - 1; i >= 0; i--) {
            if (Character.isLetter(input.charAt(i))) {
                reversedLetters.append(input.charAt(i));
            }
        }

        // Шаг 2: собираем результат слева направо
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetter(input.charAt(i))) {
                // Не буква — копируем как есть
                result.append(input.charAt(i));
            } else {
                // Буква — подставляем следующую из развёрнутого списка
                result.append(reversedLetters.charAt(letterIndex++));
            }
        }

        return result.toString();
    }
}