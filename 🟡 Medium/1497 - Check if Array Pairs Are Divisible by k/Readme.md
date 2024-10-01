# 1497. Check If Array Pairs Are Divisible by k

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/check-if-array-pairs-are-divisible-by-k/description/?envType=daily-question&envId=2024-10-01"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Given an array of integers `arr` of even length `n` and an integer `k`.

#### We want to divide the array into exactly `n / 2` pairs such that the sum of each pair is divisible by `k`.

#### Return `true` If you can find a way to do that or `false` otherwise.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `arr = [1,2,3,4,5,10,6,7,8,9], k = 5` | `true` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Pairs are (1,9),(2,8),(3,7),(4,6) and (5,10).

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `arr = [1,2,3,4,5,6], k = 7` | `true` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Pairs are (1,6),(2,5) and(3,4).

___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `arr = [1,2,3,4,5,6], k = 10` | `false` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

You can try all possible pairs to see that there is no way to divide arr into 3 pairs each with sum divisible by 10.

___

## Constraints 🔍

> `arr.length == n`</br>

> `1 <= n <= 10^5` <br>

> `n` is even. <br>

> `-10^9 <= arr[i] <= 10^9` <br>

> `1 <= k <= 10^5`

___

## Topics 📝

1. Array
2. Hash Table
3. Counting


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1497%20-%20Check%20if%20Array%20Pairs%20Are%20Divisible%20by%20k/_1497CheckIfArrayPairsAreDivisiblebyk.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1497%20-%20Check%20if%20Array%20Pairs%20Are%20Divisible%20by%20k/_1497CheckIfArrayPairsAreDivisiblebyk.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1497%20-%20Check%20if%20Array%20Pairs%20Are%20Divisible%20by%20k/_1497CheckIfArrayPairsAreDivisiblebyk.js) |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1497%20-%20Check%20if%20Array%20Pairs%20Are%20Divisible%20by%20k/_1497CheckIfArrayPairsAreDivisiblebyk.py) |
