# 2704. To Be Or Not To Be

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/to-be-or-not-to-be/description/?envType=study-plan-v2&envId=30-days-of-javascript"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Write a function expect that helps developers test their code. It should take in any value val and return an object with the following two functions.

- toBe(val) accepts another value and returns true if the two values === each other. If they are not equal, it should throw an error "Not Equal".

- notToBe(val) accepts another value and returns true if the two values !== each other. If they are equal, it should throw an error "Equal".


---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `func = () => expect(5).toBe(5)`| `{"value": true}` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

5 === 5 so this expression returns true.

___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `func = () => expect(5).toBe(null)` |`{"error": "Not Equal"}` |

</h3>


<h3>
<ins>Explanation:</ins>
</h3>

5 !== null so this expression throw the error "Not Equal".

___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `func = () => expect(5).notToBe(null)` |`{"value": true}` |

</h3>


<h3>
<ins>Explanation:</ins>
</h3>

5 !== null so this expression returns true.
___

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/30%20Days%20of%20JavaScript/(3)%202704.%20To%20Be%20Or%20Not%20To%20Be/_2704ToBeOrNotToBe.js) |
