# Plus One

This problem asks you to increment a large integer represented as an array of digits by one and return the resulting array.

## Problem Description

You are given a large integer represented as an integer array `digits`, where each `digits[i]` is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

### Examples

**Example 1:**

```
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
```

**Example 2:**

```
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
```

**Example 3:**

```
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
```

### Constraints

*   `1 <= digits.length <= 100`
*   `0 <= digits[i] <= 9`
*   `digits` does not contain any leading 0's.

---

# Плюс Один

Эта задача требует увеличить большое целое число, представленное в виде массива цифр, на единицу и вернуть полученный массив.

## Описание задачи

Вам дано большое целое число, представленное в виде массива целых чисел `digits`, где каждый элемент `digits[i]` является i-ой цифрой целого числа. Цифры упорядочены от наиболее значащей к наименее значащей в порядке слева направо. Большое целое число не содержит ведущих нулей.

Увеличьте большое целое число на единицу и верните полученный массив цифр.

### Примеры

**Пример 1:**

```
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
```

**Пример 2:**

```
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
```

**Пример 3:**

```
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
```

### Ограничения

*   `1 <= digits.length <= 100`
*   `0 <= digits[i] <= 9`
*   `digits` не содержит ведущих нулей.