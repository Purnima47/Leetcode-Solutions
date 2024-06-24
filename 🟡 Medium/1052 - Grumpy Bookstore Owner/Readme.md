# 1052. Grumpy Bookstore Owner

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/grumpy-bookstore-owner/description/"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### There is a bookstore owner that has a store open for `n` minutes. Every minute, some number of customers enter the store. You are given an integer array `customers` of length `n` where `customers[i]` is the number of the customer that enters the store at the start of the `ith` minute and all those customers leave after the end of that minute

#### On some minutes, the bookstore owner is grumpy. You are given a binary array grumpy where `grumpy[i]` is `1` if the bookstore owner is grumpy during the `ith` minute, and is `0` otherwise

#### When the bookstore owner is grumpy, the customers of that minute are not satisfied, otherwise, they are satisfied

#### The bookstore owner knows a secret technique to keep themselves not grumpy for `minutes` consecutive minutes, but can only use it once

#### _Return the maximum number of customers that can be satisfied throughout the day._

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUT_ |
| :-----------: |
| customers = [1,0,1,2,1,1,7,5] |
| grumpy = [0,1,0,1,0,1,0,1] |
| minutes = 3 |

| _OUTPUT_ |
| :----: |
| 16 |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The bookstore owner keeps themselves not grumpy for the last 3 minutes.
The maximum number of customers that can be </br> `satisfied = 1 + 1 + 1 + 1 + 7 + 5 = 16.`
___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUT_ |
| :-----------: |
| customers  = [1] |
| grumpy = [0] |
| minutes = 1 |

| _OUTPUT_ |
| :----: |
| 1 |

</h3>

___

## Constraints 🔍

> `n == customers.length == grumpy.length`</br>
> `1 <= minutes <= n <= 2 * 104` </br>
> `0 <= customers[i] <= 1000` </br>
> `grumpy[i]` is either `0` or `1`.

___

## Topics 📝

1. Array
2. Sliding Window

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1052%20-%20Grumpy%20Bookstore%20Owner/_1052GrumpyBookstoreOwner.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1052%20-%20Grumpy%20Bookstore%20Owner/_1052GrumpyBookstoreOwner.cpp)  |
