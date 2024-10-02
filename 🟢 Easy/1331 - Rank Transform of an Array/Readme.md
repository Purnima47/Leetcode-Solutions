# 1331. Rank Transform of an Array

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/rank-transform-of-an-array/description/?envType=daily-question&envId=2024-10-02"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Given an array of integers `arr`, replace each element with its rank.

#### The rank represents how large the element is. The rank has the following rules:

- Rank is an integer starting from 1.

- The larger the element, the larger the rank. If two elements are equal, their rank must be the same.

- Rank should be as small as possible.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `arr = [40,10,20,30]` | `[4,1,2,3]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `arr = [100,100,100]` | `[1,1,1]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Same elements share the same rank.

___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `arr = [37,12,28,9,100,56,80,5,12]` | `[5,3,4,2,8,6,7,1,3]` |

</h3>


___

## Constraints 🔍

> `0 <= arr.length <= 10^5`</br>

> `-10^9 <= arr[i] <= 10^9` 

___

## Topics 📝

1. Array
2. Hash Table
3. Sorting

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA]() |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++]()  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript]() |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python]() |
