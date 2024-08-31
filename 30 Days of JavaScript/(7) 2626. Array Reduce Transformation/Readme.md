# 2626. Array Reduce Transformation

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/array-reduce-transformation/description/?envType=study-plan-v2&envId=30-days-of-javascript"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Given an integer array `nums`, a reducer function `fn`, and an initial value `init`, return the final result obtained by executing the `fn` function on each element of the array, sequentially, passing in the return value from the calculation on the preceding element..

#### This result is achieved through the following operations: `val = fn(init, nums[0]), val = fn(val, nums[1]), val = fn(val, nums[2]), ...` until every element in the array has been processed. The ultimate value of `val` is then returned.

#### If the length of the array is 0, the function should return `init`.

#### Please solve it without using the built-in `Array.reduce` method.


---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| ` nums = [1,2,3,4]`,
`fn = function sum(accum, curr) { return accum + curr; }`,
`init = 0`| `10` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

initially, the value is init=0.

- (0) + nums[0] = 1
- (1) + nums[1] = 3
- (3) + nums[2] = 6
- (6) + nums[3] = 10 <br>

The final answer is 10.
___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [1,2,3,4]`, `fn = function sum(accum, curr) { return accum + curr * curr; }, `init = 100` |`130` |

</h3>


<h3>
<ins>Explanation:</ins>
</h3>

initially, the value is init=100.

- (100) + nums[0] * nums[0] = 101
- (101) + nums[1] * nums[1] = 105
- (105) + nums[2] * nums[2] = 114
- (114) + nums[3] * nums[3] = 130

The final answer is 130.
___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = []`,
`fn = function sum(accum, curr) { return 0; }`,
`init = 25` |`25` |

</h3>


<h3>
<ins>Explanation:</ins>
</h3>

For empty arrays, the answer is always init.
___

## Constraints 🔍

> `0 <= nums.length <= 1000` <br>

> `0 <= nums[i] <= 1000` <br>

> `0 <= init <= 1000`

___

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/30%20Days%20of%20JavaScript/(7)%202626.%20Array%20Reduce%20Transformation/_2626ArrayReduceTransformation.js) |
