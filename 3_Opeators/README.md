# Kotlin Operators Guide

This guide provides an overview of the different types of operators in Kotlin, including Arithmetic, Relational, Assignment, Unary, Logical, and Bitwise Operators.

## 1. Arithmetic Operators
Arithmetic operators are used to perform basic mathematical operations.

| Operator | Meaning        | Expression   | Translate to     |
|----------|----------------|--------------|------------------|
| `+`      | Addition       | `a + b`      | `a.plus(b)`      |
| `-`      | Subtraction    | `a - b`      | `a.minus(b)`     |
| `*`      | Multiplication | `a * b`      | `a.times(b)`     |
| `/`      | Division       | `a / b`      | `a.div(b)`       |
| `%`      | Modulus        | `a % b`      | `a.rem(b)`       |

---

## 2. Relational Operators
Relational operators compare values of two operands.

| Operator | Meaning                        | Expression   | Translate to               |
|----------|--------------------------------|--------------|----------------------------|
| `>`      | Greater than                   | `a > b`      | `a.compareTo(b) > 0`       |
| `<`      | Less than                      | `a < b`      | `a.compareTo(b) < 0`       |
| `>=`     | Greater than or equal to       | `a >= b`     | `a.compareTo(b) >= 0`      |
| `<=`     | Less than or equal to          | `a <= b`     | `a.compareTo(b) <= 0`      |
| `==`     | Equal to                       | `a == b`     | `a?.equals(b) ?: (b === null)` |
| `!=`     | Not equal to                   | `a != b`     | `!(a?.equals(b) ?: (b === null)) > 0` |

---

## 3. Assignment Operators
Assignment operators assign values to variables.

| Operator | Expression  | Translate to     |
|----------|-------------|------------------|
| `=`      | `a = 5`     | `a.equalto(5)`   |
| `+=`     | `a = a + b` | `a.plusAssign(b)`|
| `-=`     | `a = a - b` | `a.minusAssign(b)`|
| `*=`     | `a = a * b` | `a.timesAssign(b)`|
| `/=`     | `a = a / b` | `a.divAssign(b)`  |
| `%=`     | `a = a % b` | `a.remAssign(b)`  |

---

## 4. Unary Operators
Unary operators are used to increment or decrement a value.

| Operator | Expression  | Translate to     |
|----------|-------------|------------------|
| `++`     | `++a` or `a++` | `a.inc()`        |
| `--`     | `--a` or `a--` | `a.dec()`        |

---

## 5. Logical Operators
Logical operators combine multiple conditions.

| Operator | Meaning                        | Expression               |
|----------|--------------------------------|--------------------------|
| `&&`     | All expressions must be true   | `(a > b) && (a > c)`      |
| `||`     | Any expression can be true     | `(a > b) || (a > c)`      |
| `!`      | Complement of the expression   | `a.not()`                |

---

## 6. Bitwise Operators
Bitwise operators work at the bit level.

| Operator | Meaning                | Expression  |
|----------|------------------------|-------------|
| `shl`    | Signed shift left      | `a.shl(b)`  |
| `shr`    | Signed shift right     | `a.shr(b)`  |
| `ushr`   | Unsigned shift right   | `a.ushr()`  |
| `and`    | Bitwise AND            | `a.and(b)`  |
| `or`     | Bitwise OR             | `a.or()`    |
| `xor`    | Bitwise XOR            | `a.xor()`   |
| `inv`    | Bitwise inverse        | `a.inv()`   |

---
