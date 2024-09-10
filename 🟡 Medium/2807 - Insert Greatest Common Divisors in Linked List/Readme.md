# 2807. Insert Greatest Common Divisors in Linked List

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/description/?envType=daily-question&envId=2024-09-10"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Given the `head` of a linked list `head`, in which each node contains an integer value.

#### Between every pair of adjacent nodes, insert a new node with a value equal to the `greatest common divisor` of them.

#### Return the linked list after insertion.

#### The `greatest common divisor` of two numbers is the largest positive integer that evenly divides both numbers.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

![ex1_copy](https://github.com/user-attachments/assets/1b2194ae-c324-4c78-a9a2-d63978071523)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `head = [18,6,10,3]` | `[18,6,6,2,10,1,3]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The 1st diagram denotes the initial linked list and the 2nd diagram denotes the linked list after inserting the new nodes (nodes in blue are the inserted nodes).

- We insert the greatest common divisor of 18 and 6 = 6 between the 1st and the 2nd nodes.

- We insert the greatest common divisor of 6 and 10 = 2 between the 2nd and the 3rd nodes.

- We insert the greatest common divisor of 10 and 3 = 1 between the 3rd and the 4th nodes.

There are no more adjacent nodes, so we return the linked list.

____
<h3>

<ins>**Example 2**:</ins> </br>

![ex2_copy1](https://github.com/user-attachments/assets/315490aa-e42b-4d4b-bdc8-d98729d2e66e)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `head = [7]` | `[7]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The 1st diagram denotes the initial linked list and the 2nd diagram denotes the linked list after inserting the new nodes. <br>

There are no pairs of adjacent nodes, so we return the initial linked list.


___

## Constraints 🔍

> The number of nodes in the list is in the range `[1, 5000]`.</br>

> `1 <= Node.val <= 1000` 

___

## Topics 📝

1. Linked List
2. Math
3. Number Theory


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2807%20-%20Insert%20Greatest%20Common%20Divisors%20in%20Linked%20List/_2807InsertGreatestCommonDivisorsinLinkedList.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2807%20-%20Insert%20Greatest%20Common%20Divisors%20in%20Linked%20List/_2807InsertGreatestCommonDivisorsinLinkedList.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2807%20-%20Insert%20Greatest%20Common%20Divisors%20in%20Linked%20List/_2807InsertGreatestCommonDivisorsinLinkedList.js) |
