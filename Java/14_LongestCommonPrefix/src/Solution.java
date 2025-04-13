public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // Если массив пустой, возвращаем пустую строку
        }

        // Начинаем с первого слова в массиве как базового префикса
        String prefix = strs[0];

        // Сравниваем префикс с каждым словом в массиве
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                // Уменьшаем префикс, пока он не совпадает с началом текущей строки
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return ""; // Если префикс стал пустым, возвращаем пустую строку
                }
            }
        }

        return prefix; // Возвращаем найденный общий префикс
    }
}
