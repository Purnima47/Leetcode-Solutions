# 1605. Find Valid Matrix Given Row and Column Sums

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/description/"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given two arrays `rowSum` and `colSum` of non-negative integers where `rowSum[i]` is the sum of the elements in the `ith` row and `colSum[j]` is the sum of the elements of the `jth` column of a 2D matrix. In other words, you do not know the elements of the matrix, but you do know the sums of each row and column.

#### Find any matrix of non-negative integers of size `rowSum.length x colSum.length` that satisfies the `rowSum` and `colSum` requirements.

#### Return a 2D array representing any matrix that fulfills the requirements. It's guaranteed that at least one matrix that fulfills the requirements exists.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `rowSum = [3,8]`, `colSum = [4,7]` | `[[3,0], [1,7]]` |

</h3>


<h3>
<ins>Explanation:</ins>
</h3>

- 0th row: 3 + 0 = 3 == rowSum[0]
- 1st row: 1 + 7 = 8 == rowSum[1]
- 0th column: 3 + 1 = 4 == colSum[0]
- 1st column: 0 + 7 = 7 == colSum[1]

The row and column sums match, and all matrix elements are non-negative.
Another possible matrix is: [[1,2], [3,5]]

___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `rowSum = [5,7,10]`, `colSum = [8,6,8]` | `[[0,5,0], [6,1,0], [2,0,8]]` |

</h3>

___

## Constraints 🔍

> `1 <= rowSum.length, colSum.length <= 500` </br>

> `0 <= rowSum[i], colSum[i] <= 10^8` </br>

> `sum(rowSum) == sum(colSum)` 

___

## Topics 📝

1. Array
2. Greedy
3. Matrix

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1605%20-%20Find%20Valid%20Matrix%20Given%20Row%20and%20Column%20Sums/_1605FindValidMatrixGivenRowAndColumnSums.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1605%20-%20Find%20Valid%20Matrix%20Given%20Row%20and%20Column%20Sums/_1605FindValidMatrixGivenRowAndColumnSums.cpp)  |
