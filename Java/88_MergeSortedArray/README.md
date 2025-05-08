# Merge Sorted Array

This problem asks you to merge two sorted integer arrays into a single sorted array. The merged array should be stored in `nums1`.

## Problem Description

You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively.

Merge `nums1` and `nums2` into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array `nums1`. To accommodate this, `nums1` has a length of `m + n`, where the first `m` elements denote the elements that should be merged, and the last `n` elements are set to 0 and should be ignored. `nums2` has a length of `n`.

## Examples

**Example 1:**

```
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
```

**Example 2:**

```
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
```

**Example 3:**

```
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
```

## Constraints

*   `nums1.length == m + n`
*   `nums2.length == n`
*   `0 <= m, n <= 200`
*   `1 <= m + n <= 200`
*   `-10^9 <= nums1[i], nums2[j] <= 10^9`

## Follow Up

Can you come up with an algorithm that runs in O(m + n) time?

---

## Объединение Отсортированных Массивов

Эта задача требует объединить два отсортированных массива целых чисел в один отсортированный массив. Объединенный массив должен быть сохранен в `nums1`.

## Описание задачи

Вам даны два массива целых чисел `nums1` и `nums2`, отсортированные в неубывающем порядке, и два целых числа `m` и `n`, представляющие количество элементов в `nums1` и `nums2` соответственно.

Объедините `nums1` и `nums2` в один массив, отсортированный в неубывающем порядке.

Финальный отсортированный массив не должен быть возвращен функцией, а должен быть сохранен внутри массива `nums1`. Для этого `nums1` имеет длину `m + n`, где первые `m` элементов обозначают элементы, которые нужно объединить, а последние `n` элементов установлены в 0 и должны быть проигнорированы. `nums2` имеет длину `n`.

## Примеры

**Пример 1:**

```
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
```

**Пример 2:**

```
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
```

**Пример 3:**

```
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
```

## Ограничения

*   `nums1.length == m + n`
*   `nums2.length == n`
*   `0 <= m, n <= 200`
*   `1 <= m + n <= 200`
*   `-10^9 <= nums1[i], nums2[j] <= 10^9`

## Дополнительно

Можете ли вы придумать алгоритм, который работает за время O(m + n)?