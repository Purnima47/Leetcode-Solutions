# 1310. XOR Queries of a Subarray

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/xor-queries-of-a-subarray/description/?envType=daily-question&envId=2024-09-13"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given an array `arr` of positive integers. You are also given the array `queries` where `queries[i] = [lefti, righti]`.

#### For each query `i` compute the XOR of elements from `lefti` to `righti` (that is, `arr[lefti] XOR arr[lefti + 1] XOR ... XOR arr[righti]` ).

#### Return an array `answer` where `answer[i]` is the answer to the `ith` query.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]` | `[2,7,14,8]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The binary representation of the elements in the array are:

- 1 = 0001 

- 3 = 0011 

- 4 = 0100 

- 8 = 1000 

The XOR values for queries are:

- [0,1] = 1 xor 3 = 2 

- [1,2] = 3 xor 4 = 7 

- [0,3] = 1 xor 3 xor 4 xor 8 = 14 

- [3,3] = 8

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `arr = [4,8,2,10], queries = [[2,3],[1,3],[0,0],[0,3]]` | `[8,0,4,4]` |

</h3>


___

## Constraints 🔍

> `1 <= arr.length, queries.length <= 3 * 10^4`</br>

> `1 <= arr[i] <= 10^9` <br>

> `queries[i].length == 2` <br>

> `0 <= lefti <= righti < arr.length`


___

## Topics 📝

1. Array
2. Bit Manipulation
3. Prefix Sum


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA]() |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++]()  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript]() |
|![C](https://img.shields.io/badge/c-%2300599C.svg?style=plastic&logo=c&logoColor=white)| [C]() |
