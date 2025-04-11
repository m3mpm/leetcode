# Remove Element from Array

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in `nums` in-place. The order of the elements may be changed. Then return the number of elements in `nums` which are not equal to `val`.

Consider the number of elements in `nums` which are not equal to `val` be `k`. To get accepted, you need to do the following things:

1. Change the array `nums` such that the first `k` elements of `nums` contain the elements which are not equal to `val`.
2. The remaining elements of `nums` are not important as well as the size of `nums`.
3. Return `k`.

### Custom Judge

The judge will test your solution with the following code:

```java
int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
// It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
```

If all assertions pass, then your solution will be accepted.

### Example 1

```plaintext
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).

It does not matter what you leave beyond the returned k (hence they are underscores).
```

### Example 2

```plaintext
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).

Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
```

### Constraints:

* `0 <= nums.length <= 100`
* `0 <= nums[i] <= 50`
* `0 <= val <= 100`

---

# Удаление элемента из массива

Дан целочисленный массив `nums` и целое число `val`, удалите все вхождения `val` в `nums` на месте. Порядок элементов может быть изменен. Затем верните количество элементов в `nums`, которые не равны `val`.

Рассматривайте количество элементов в `nums`, которые не равны `val`, как `k`. Чтобы получить одобрение, вам нужно сделать следующее:

1. Измените массив `nums` так, чтобы первые `k` элементов `nums` содержали элементы, которые не равны `val`.
2. Оставшиеся элементы `nums` не важны, как и размер `nums`.
3. Верните `k`.

### Способ оценки

Судья протестирует ваше решение с помощью следующего кода:

```java
int[] nums = [...]; // Входной массив
int val = ...; // Значение для удаления
int[] expectedNums = [...]; // Ожидаемый ответ с правильной длиной.
// Он отсортирован и не содержит значений, равных val.

int k = removeElement(nums, val); // Вызов вашей реализации

assert k == expectedNums.length;
sort(nums, 0, k); // Отсортируйте первые k элементов nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
```

Если все утверждения пройдут, ваше решение будет принято.

### Примеры

**Пример 1:**

```
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).

It does not matter what you leave beyond the returned k (hence they are underscores).
```

**Пример 2:**

```
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).

Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
```

### Ограничения

* `0 <= nums.length <= 100`
* `0 <= nums[i] <= 50`
* `0 <= val <= 100`