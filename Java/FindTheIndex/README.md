# Find the First Occurrence in a String (needle in haystack)

This project implements a function that finds the index of the first occurrence of a needle string within a haystack string. If the needle is not found, the function returns -1.

### Problem Description

Given two strings, `needle` and `haystack`, the goal is to find the starting index of the first occurrence of `needle` within `haystack`.  If `needle` is not a substring of `haystack`, return -1.

### Examples

**Example 1:**

```
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
```

**Example 2:**

```
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
```

### Constraints

*   `1 <= haystack.length, needle.length <= 10^4`
*   `haystack` and `needle` consist of only lowercase English characters.

---

# Поиск Первого Вхождения в Строке (needle в haystack)

Этот проект реализует функцию, которая находит индекс первого вхождения строки `needle` в строку `haystack`. Если строка `needle` не найдена, функция возвращает -1.

### Описание Задачи

Даны две строки, `needle` и `haystack`. Необходимо найти индекс начала первого вхождения строки `needle` в строку `haystack`. Если `needle` не является подстрокой `haystack`, вернуть -1.

### Примеры

**Пример 1:**

```
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
```

**Пример 2:**

```
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
```

### Ограничения

*   `1 <= haystack.length, needle.length <= 10^4`
*   `haystack` и `needle` состоят только из строчных английских букв.