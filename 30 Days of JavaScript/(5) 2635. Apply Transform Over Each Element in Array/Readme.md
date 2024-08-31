# 2635. Apply Transform Over Each Element in Array

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/apply-transform-over-each-element-in-array/description/?envType=study-plan-v2&envId=30-days-of-javascript"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Given an integer array arr and a mapping function fn, return a new array with a transformation applied to each element.

#### The returned array should be created such that returnedArray[i] = fn(arr[i], i).

#### Please solve it without the built-in Array.map method.


---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| ` arr = [1,2,3]`, `fn = function plusone(n) { return n + 1; }`| `[2,3,4]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

const newArray = map(arr, plusone); // [2,3,4] <br>
The function increases each value in the array by one. 
___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `arr = [1,2,3]`, `fn = function plusI(n, i) { return n + i; }` |`[1,3,5]` |

</h3>


<h3>
<ins>Explanation:</ins>
</h3>

The function increases each value by the index it resides in.
___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `arr = [10,20,30]`, `fn = function constant() { return 42; }` |`[42,42,42]` |

</h3>


<h3>
<ins>Explanation:</ins>
</h3>

The function always returns 42.

___

## Constraints 🔍

> `0 <= arr.length <= 1000` <br>

> `-10^9 <= arr[i] <= 10^9` <br>

> `fn` returns a number

___

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/30%20Days%20of%20JavaScript/(5)%202635.%20Apply%20Transform%20Over%20Each%20Element%20in%20Array/_2653ApplyTransformOverEachElementInArray.js) |
