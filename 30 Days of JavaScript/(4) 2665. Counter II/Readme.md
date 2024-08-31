# 2665. Counter II

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/counter-ii/description/?envType=study-plan-v2&envId=30-days-of-javascript"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Write a function `createCounter`. It should accept an initial integer `init`. It should return an object with three functions.

#### The three functions are:

- `increment()` increases the current value by 1 and then returns it.

- `decrement()` reduces the current value by 1 and then returns it.

- `reset()` sets the current value to `init` and then returns it.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `init = 5`, `calls = ["increment","reset","decrement"]`| `[6,5,4]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

- const counter = createCounter(5); <br>
- counter.increment();    // 6   <br>
- counter.reset();        // 5   <br>
- counter.decrement();    // 4   <br>

___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `init = 0`, `calls = ["increment","increment","decrement","reset","reset"]` | `[1,2,1,0,0]` |

</h3>


<h3>
<ins>Explanation:</ins>
</h3>

- const counter = createCounter(0);       <br> 
- counter.increment(); // 1       <br>
- counter.increment(); // 2       <br>
- counter.decrement(); // 1       <br>
- counter.reset(); // 0       <br>
- counter.reset(); // 0       <br>


___

## Constraints 🔍

> `-1000 <= n <= 1000` <br>
> `0 <= calls.length <= 1000` <br>
> `calls[i]` is one of "increment", "decrement" and "reset"
___


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/30%20Days%20of%20JavaScript/(4)%202665.%20Counter%20II/_2665CounterII.js) |
