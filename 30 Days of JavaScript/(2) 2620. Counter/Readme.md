# 2620. Counter

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/counter/description/?envType=study-plan-v2&envId=30-days-of-javascript"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Given an integer `n`, return a `counter` function. This `counter` function initially returns `n` and then returns 1 more than the previous value every subsequent time it is called (`n`, `n + 1`, `n + 2`, etc).

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `n = 10`, `["call","call","call"]`| `[10,11,12]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

counter() = 10 // The first time counter() is called, it returns n. <br>
counter() = 11 // Returns 1 more than the previous time. <br>
counter() = 12 // Returns 1 more than the previous time.<br>

___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `n = -2`, `["call","call","call","call","call"]` |`[-2,-1,0,1,2]` |

</h3>


<h3>
<ins>Explanation:</ins>
</h3>

counter() initially returns -2. Then increases after each sebsequent call.


___

## Constraints 🔍

> `-1000 <= n <= 1000` <br>
> `0 <= calls.length <= 1000` <br>
> `calls[i] === "call"`
___


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/30%20Days%20of%20JavaScript/(2)%202620.%20Counter/_2620Counter.js) |
