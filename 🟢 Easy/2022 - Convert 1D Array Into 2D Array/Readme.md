# 2022. Convert 1D Array Into 2D Array

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/convert-1d-array-into-2d-array/description/?envType=daily-question&envId=2024-09-01"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given a 0-indexed 1-dimensional (1D) integer array `original`, and two integers, `m` and `n`. You are tasked with creating a 2-dimensional (2D) array with  `m` rows and `n` columns using all the elements from `original`.

#### The elements from indices `0` to `n - 1` (inclusive) of `original` should form the first row of the constructed 2D array, the elements from indices `n` to `2 * n - 1` (inclusive) should form the second row of the constructed 2D array, and so on.

#### Return an `m x n` 2D array constructed according to the above procedure, or an empty 2D array if it is impossible.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

![image-20210826114243-1](https://github.com/user-attachments/assets/c0a497de-bb27-41c7-98bc-da9c0f7fbc12)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `original = [1,2,3,4]`, `m = 2`, `n = 2` | `[[1,2],[3,4]]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The constructed 2D array should contain 2 rows and 2 columns. <br>
The first group of n=2 elements in original, [1,2], becomes the first row in the constructed 2D array. <br>
The second group of n=2 elements in original, [3,4], becomes the second row in the constructed 2D array. <br>

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `original = [1,2,3]`, `m = 1`, `n = 3` | `[[1,2,3]]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The constructed 2D array should contain 1 row and 3 columns. <br>
Put all three elements in original into the first row of the constructed 2D array. <br>

___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `original = [1,2]`, `m = 1`, `n = 1` | `[]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

There are 2 elements in original. <br>
It is impossible to fit 2 elements in a 1x1 2D array, so return an empty 2D array. <br>

___

## Constraints 🔍

> `1 <= original.length <= 5 * 10^4`</br>

> `1 <= original[i] <= 10^5`. <br>

> `1 <= m, n <= 4 * 10^4`

___

## Topics 📝

1. Array
2. Matrix
3. Simulation

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/2022%20-%20Convert%201D%20Array%20Into%202D%20Array/_2022Convert1DArrayInto2DArray.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/2022%20-%20Convert%201D%20Array%20Into%202D%20Array/_2022Convert1DArrayInto2DArray.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/2022%20-%20Convert%201D%20Array%20Into%202D%20Array/_2022Convert1DArrayInto2DArray.js) |
