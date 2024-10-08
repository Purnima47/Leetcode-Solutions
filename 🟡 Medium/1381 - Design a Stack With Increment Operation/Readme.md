# 1381. Design a Stack With Increment Operation

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/design-a-stack-with-increment-operation/description/?envType=daily-question&envId=2024-09-30"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Design a stack that supports increment operations on its elements.

#### Implement the `CustomStack` class:

- `CustomStack(int maxSize)` Initializes the object with `maxSize` which is the maximum number of elements in the stack.

- `void push(int x)` Adds `x` to the top of the stack if the stack has not reached the `maxSize`.

- `int pop()` Pops and returns the top of the stack or `-1` if the stack is empty.

- `void inc(int k, int val)` Increments the bottom `k` elements of the stack by `val`. If there are less than `k` elements in the stack, increment all the elements in the stack.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `["CustomStack","push","push","pop","push","push","push","increment","increment","pop","pop","pop","pop"]
[[3],[1],[2],[],[2],[3],[4],[5,100],[2,100],[],[],[],[]]` | `[null,null,null,2,null,null,null,null,null,103,202,201,-1]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>


- CustomStack stk = new CustomStack(3); // Stack is Empty []

- stk.push(1);                          // stack becomes [1]

- stk.push(2);                          // stack becomes [1, 2]

- stk.pop();                            // return 2 --> Return top of the stack 2, stack becomes [1]

- stk.push(2);                          // stack becomes [1, 2]

- stk.push(3);                          // stack becomes [1, 2, 3]

- stk.push(4);                          // stack still [1, 2, 3], Do not add another elements as size is 4

- stk.increment(5, 100);                // stack becomes [101, 102, 103]

- stk.increment(2, 100);                // stack becomes [201, 202, 103]

- stk.pop();                            // return 103 --> Return top of the stack 103, stack becomes [201, 202]

- stk.pop();                            // return 202 --> Return top of the stack 202, stack becomes [201]

- stk.pop();                            // return 201 --> Return top of the stack 201, stack becomes []

- stk.pop();                            // return -1 --> Stack is empty return -1.



___

## Constraints 🔍

> `1 <= maxSize, x, k <= 1000`</br>

> `0 <= val <= 100` <br>

> At most `1000` calls will be made to each method of `increment`, `push` and `pop` each separately.

___

## Topics 📝

1. Array
2. Stack
3. Design


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1381%20-%20Design%20a%20Stack%20With%20Increment%20Operation/_1381DesignaStackWithIncrementOperation.java) |
