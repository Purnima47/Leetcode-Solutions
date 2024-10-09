# 921. Minimum Add to Make Parentheses Valid

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/?envType=daily-question&envId=2024-10-09"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### A parentheses string is valid if and only if:

- It is the empty string,

- It can be written as `AB` (`A` concatenated with `B`), where `A` and `B` are valid strings, or

- It can be written as `(A)`, where `A` is a valid string.

#### You are given a parentheses string `s`. In one move, you can insert a parenthesis at any position of the string.

- For example, if `s = "()))"`, you can insert an opening parenthesis to be `"(()))"` or a closing parenthesis to be `"())))"`.

#### Return the minimum number of moves required to make `s` valid.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "())"` | `1` |

</h3>

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "((("` | `3` |

</h3>


___


## Constraints 🔍

> `1 <= s.length <= 1000`</br>

>  `s[i]` is either `'('` or `')'`.

___

## Topics 📝

1. String
2. Stack
3. Greedy


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA]() |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++]()  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript]() |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python]() |
