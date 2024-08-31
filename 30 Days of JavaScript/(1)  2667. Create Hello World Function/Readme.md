# 2667. Create Hello World Function

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/create-hello-world-function/description/?envType=study-plan-v2&envId=30-days-of-javascript"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Write a function `createHelloWorld`. It should return a new function that always returns `"Hello World"`.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| args = []`| `"Hello World"` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>
const f = createHelloWorld();
f(); // "Hello World"

The function returned by createHelloWorld should always return "Hello World".

___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `args = [{},null,42]` | `"Hello World"` |

</h3>


<h3>
<ins>Explanation:</ins>
</h3>

const f = createHelloWorld();
f({}, null, 42); // "Hello World"

Any arguments could be passed to the function but it should still always return "Hello World".


___

## Constraints 🔍

> `0 <= args.length <= 10`
___


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/30%20Days%20of%20JavaScript/(1)%20%202667.%20Create%20Hello%20World%20Function/_2667CreateHelloWorldFunction.js) |
