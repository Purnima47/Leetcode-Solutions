# 2634. Filter Elements from Array

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/filter-elements-from-array/description/?envType=study-plan-v2&envId=30-days-of-javascript"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Given an integer array `arr` and a filtering function `fn`, return a filtered array `filteredArr`.

#### The fn function takes one or two arguments:

- arr[i] - number from the arr

- i - index of arr[i]

#### `filteredArr` should only contain the elements from the `arr` for which the expression `fn(arr[i], i)` evaluates to a truthy value. A truthy value is a value where `Boolean(value)` returns `true`.

#### Please solve it without the built-in `Array.filter` method.


---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| ` arr = [0,10,20,30]`, `fn = function greaterThan10(n) { return n > 10; }`| `[20,30]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

const newArray = filter(arr, fn); // [20, 30] <br>
The function filters out values that are not greater than 10
___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `arr = [1,2,3]`, fn = function firstIndex(n, i) { return i === 0; }` |`[1]` |

</h3>


<h3>
<ins>Explanation:</ins>
</h3>

fn can also accept the index of each element
In this case, the function removes elements not at index 0
___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `arr = [-2,-1,0,1,2]`, `fn = function plusOne(n) { return n + 1 }` |`[-2,0,1,2]` |

</h3>


<h3>
<ins>Explanation:</ins>
</h3>

Falsey values such as 0 should be filtered out

___

## Constraints 🔍

> `0 <= arr.length <= 1000` <br>

> `-10^9 <= arr[i] <= 10^9` <br>

___

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/30%20Days%20of%20JavaScript/(6)%202634.%20Filter%20Elements%20from%20Array/_2634FilterElementsFromArray.js) |
