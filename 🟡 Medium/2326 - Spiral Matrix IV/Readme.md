# 2326. Spiral Matrix IV

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/spiral-matrix-iv/description/?envType=daily-question&envId=2024-09-09"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given two integers `m` and `n`, which represent the dimensions of a matrix.

#### You are also given the `head` of a linked list of integers.

#### Generate an `m x n` matrix that contains the integers in the linked list presented in spiral order (clockwise), starting from the top-left of the matrix. If there are remaining empty spaces, fill them with `-1`.

#### Return the generated matrix.


---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

![ex1new](https://github.com/user-attachments/assets/d574bca9-cd68-4500-9b14-9e4a65101397)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `m = 3`, `n = 5`, `head = [3,0,2,6,8,1,7,9,4,2,5,5,0]` | `[[3,0,2,6,8],[5,0,-1,-1,1],[5,2,4,9,7]]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The diagram above shows how the values are printed in the matrix.
Note that the remaining spaces in the matrix are filled with -1.

____
<h3>

<ins>**Example 2**:</ins> </br>

![ex2](https://github.com/user-attachments/assets/265b6068-b6aa-43b2-ad1d-69f623a17368)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `m = 1`, `n = 4`, `head = [0,1,2]` | `[[0,1,2,-1]]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>


The diagram above shows how the values are printed from left to right in the matrix.
The last space in the matrix is set to -1.


___


## Constraints 🔍

> `1 <= m, n <= 10^5`</br>

> `1 <= m*n <= 10^5`</br>

> The number of nodes in the list is in the range `[1, m * n]`. <br>

> `0 <= Node.val <= 1000`

___

## Topics 📝

1. Array
2. Linked List
3. Matrix
4. Simulation


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA]() |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++]()  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript]() |
