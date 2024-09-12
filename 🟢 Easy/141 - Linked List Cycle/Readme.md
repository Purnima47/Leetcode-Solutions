# 141. Linked List Cycle

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/linked-list-cycle/description/"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Given `head`, the head of a linked list, determine if the linked list has a cycle in it.

#### There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the `next` pointer. Internally, `pos` is used to denote the index of the node that tail's `next` pointer is connected to. Note that `pos` is not passed as a parameter.

#### Return `true` if there is a cycle in the linked list. Otherwise, return `false`.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

![circularlinkedlist](https://github.com/user-attachments/assets/734774e6-2f91-411e-aae9-d92ee0210a97)

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `head = [3,2,0,-4]`, `pos = 1` | `true` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

____
<h3>

<ins>**Example 2**:</ins> </br>

![circularlinkedlist_test2](https://github.com/user-attachments/assets/62c789b9-9910-4f6a-93e3-118c8566aa43)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `head = [1,2]`, `pos = 0` | `true` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

There is a cycle in the linked list, where the tail connects to the 0th node.

___

<h3>

<ins>**Example 3**:</ins> </br>

![circularlinkedlist_test3](https://github.com/user-attachments/assets/282473da-9121-4d1f-bab3-fbfbecf6567c)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `head = [1]`, `pos = -1` | `false` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

There is no cycle in the linked list.

___

## Constraints 🔍

> The number of the nodes in the list is in the range [0, 10^4].</br>

> `-10^5 <= Node.val <= 10^5` <br>

> `pos` is `-1` or a valid index in the linked-list.

___

## Topics 📝

1. Hash Table
2. Linked List
3. Two Pointers


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA]() |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++]()  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript]() |
