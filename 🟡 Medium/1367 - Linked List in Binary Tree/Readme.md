# 1367. Linked List in Binary Tree

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/linked-list-in-binary-tree/description/?envType=daily-question&envId=2024-09-07"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Given a binary tree `root` and a linked list with `head` as the first node. 

#### Return True if all the elements in the linked list starting from the `head` correspond to some downward path connected in the binary tree otherwise return False.

#### In this context downward path means a path that starts at some node and goes downwards.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

![sample_1_1720](https://github.com/user-attachments/assets/4dc33f79-5cbe-40e9-89ba-cb6ad3e09233)

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `head = [4,2,8]`, `root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]` | `true` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Nodes in blue form a subpath in the binary Tree.

____
<h3>

<ins>**Example 2**:</ins> </br>

![sample_2_1720](https://github.com/user-attachments/assets/2d9bcc5e-7b99-4227-9229-6300065fec8f)

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `head = [1,4,2,6]`, `root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]` | `true` |

</h3>

___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `head = [1,4,2,6,8]`, `root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]` | `false` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

There is no path in the binary tree that contains all the elements of the linked list from head.

___

## Constraints 🔍

> The number of nodes in the tree will be in the range `[1, 2500]`.</br>

> The number of nodes in the list will be in the range `[1, 100]`. <br>

> `1 <= Node.val <= 100` for each node in the linked list and binary tree.

___

## Topics 📝

1. Linked List
2. Tree
3. Depth - First Search
4. Breadth - First Search
5. Binary Tree


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA]() |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++]()  |
