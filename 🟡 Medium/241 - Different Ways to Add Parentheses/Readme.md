# 241. Different Ways to Add Parentheses

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/different-ways-to-add-parentheses/description/?envType=daily-question&envId=2024-09-19"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Given a string `expression` of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators. You may return the answer in any order.

#### The test cases are generated such that the output values fit in a 32-bit integer and the number of different results does not exceed `10^4`.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `expression = "2-1-1"` | `[0,2]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

((2-1)-1) = 0  <br>
(2-(1-1)) = 2

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `expression = "2*3-4*5"` | `[-34,-14,-10,-10,10]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

(2*(3-(4*5))) = -34 <br>
((2*3)-(4*5)) = -14 <br>
((2*(3-4))*5) = -10 <br>
(2*((3-4)*5)) = -10 <br>
(((2*3)-4)*5) = 10

___


## Constraints 🔍

> `1 <= expression.length <= 20`</br>

> `expression` consists of digits and the operator `'+'`, `'-'`, and `'*'`. <br>

> All the integer values in the input expression are in the range `[0, 99]`. <br>

> The integer values in the input expression do not have a leading `'-'` or `'+'` denoting the sign.

___

## Topics 📝

1. Math
2. String
3. Dynamic Programming
4. Recursion
5. Memoization


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/241%20-%20Different%20Ways%20to%20Add%20Parentheses/_241DifferentWaystoAddParentheses.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/241%20-%20Different%20Ways%20to%20Add%20Parentheses/_241DifferentWaystoAddParentheses.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/241%20-%20Different%20Ways%20to%20Add%20Parentheses/_241DifferentWaystoAddParentheses.js) |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/241%20-%20Different%20Ways%20to%20Add%20Parentheses/_241DifferentWaystoAddParentheses.py) |
