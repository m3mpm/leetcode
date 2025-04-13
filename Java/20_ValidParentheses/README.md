# Valid Parentheses

Given a string `s` containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

*   Open brackets must be closed by the same type of brackets.
*   Open brackets must be closed in the correct order.
*   Every close bracket has a corresponding open bracket of the same type.

### Examples

**Example 1:**

```
Input: `s = "()"`
Output: `true`
```

**Example 2:**

```
Input: `s = "()[]{}"`
Output: `true`
```

**Example 3:**

```
Input: `s = "(]"`
Output: `false`
```

**Example 4:**

```
Input: `s = "([])"`
Output: `true`
```

### Constraints

*   `1 <= s.length <= 104`
*   `s` consists of parentheses only '()[]{}'.

---

# Валидные скобки

Дана строка `s`, содержащая только символы '(', ')', '{', '}', '[' и ']', определите, является ли входная строка валидной.

Входная строка является валидной, если:

*   Открывающие скобки должны быть закрыты скобками того же типа.
*   Открывающие скобки должны быть закрыты в правильном порядке.
*   У каждой закрывающей скобки должна быть соответствующая открывающая скобка того же типа.

### Примеры

**Пример 1:**

```
Вход: `s = "()"`
Выход: `true`
```

**Пример 2:**

```
Вход: `s = "()[]{}"`
Выход: `true`
```

**Пример 3:**

```
Вход: `s = "(]"`
Выход: `false`
```

**Пример 4:**

```
Вход: `s = "([])"`
Выход: `true`
```

### Ограничения

*   `1 <= s.length <= 104`
*   `s` состоит только из скобок '()[]{}'.