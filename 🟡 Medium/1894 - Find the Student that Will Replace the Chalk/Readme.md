# 1894. Find the Student that Will Replace the Chalk

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/find-the-student-that-will-replace-the-chalk/description/?envType=daily-question&envId=2024-09-02"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### There are `n` students in a class numbered from `0` to `n - 1`. The teacher will give each student a problem starting with the student number `0`, then the student number `1`, and so on until the teacher reaches the student number `n - 1`. After that, the teacher will restart the process, starting with the student number `0` again.

#### You are given a `0-indexed integer` array `chalk` and an integer `k`. There are initially k pieces of chalk. When the student number `i` is given a problem to solve, they will use `chalk[i]` pieces of chalk to solve that problem. However, if the current number of chalk pieces is strictly less than `chalk[i]`, then the student number `i` will be asked to replace the chalk.

#### Return the index of the student that will replace the chalk pieces.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `chalk = [5,1,5]`, `k = 22` | `0` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The students go in turns as follows:

- Student number 0 uses 5 chalk, so k = 17.

- Student number 1 uses 1 chalk, so k = 16.

- Student number 2 uses 5 chalk, so k = 11.

- Student number 0 uses 5 chalk, so k = 6.

- Student number 1 uses 1 chalk, so k = 5.

- Student number 2 uses 5 chalk, so k = 0.

Student number 0 does not have enough chalk, so they will have to replace it.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `chalk = [3,4,1,2]`, `k = 25` | `1` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The students go in turns as follows:

- Student number 0 uses 3 chalk so k = 22.

- Student number 1 uses 4 chalk so k = 18.

- Student number 2 uses 1 chalk so k = 17.

- Student number 3 uses 2 chalk so k = 15.

- Student number 0 uses 3 chalk so k = 12.

- Student number 1 uses 4 chalk so k = 8.

- Student number 2 uses 1 chalk so k = 7.

- Student number 3 uses 2 chalk so k = 5.

- Student number 0 uses 3 chalk so k = 2.

Student number 1 does not have enough chalk, so they will have to replace it.
___


## Constraints 🔍

> `chalk.length == n`</br>

> `1 <= n <= 10^5`. <br>

> `1 <= chalk[i] <= 10^5` <br>

> `1 <= k <= 10^9`

___

## Topics 📝

1. Array
2. Binary Search
3. Simulation
4. Prefix Sum


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1894%20-%20Find%20the%20Student%20that%20Will%20Replace%20the%20Chalk/_1894FindtheStudentthatWillReplacetheChalk.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1894%20-%20Find%20the%20Student%20that%20Will%20Replace%20the%20Chalk/_1894FindtheStudentthatWillReplacetheChalk.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  |   [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1894%20-%20Find%20the%20Student%20that%20Will%20Replace%20the%20Chalk/_1894FindtheStudentthatWillReplacetheChalk.js) |
|  ![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1894%20-%20Find%20the%20Student%20that%20Will%20Replace%20the%20Chalk/_1894FindtheStudentthatWillReplacetheChalk.py) |
|  ![C](https://img.shields.io/badge/c-%2300599C.svg?style=plastic&logo=c&logoColor=white)| [C](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1894%20-%20Find%20the%20Student%20that%20Will%20Replace%20the%20Chalk/_1894FindtheStudentthatWillReplacetheChalk.c) |
