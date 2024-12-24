# 2415. Reverse Odd Levels of Binary Tree

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/reverse-odd-levels-of-binary-tree/description/?envType=daily-question&envId=2024-12-20"><strong>Question Link</strong></a>
</h2>



## Description 📑

#### Given the root of a perfect binary tree, reverse the node values at each odd level of the tree.

- For example, suppose the node values at level 3 are `[2,1,3,4,7,11,29,18]`, then it should become `[18,29,11,7,4,3,1,2]`.

#### Return the root of the reversed tree.

#### A binary tree is perfect if all parent nodes have two children and all leaves are on the same level.

#### The level of a node is the number of edges along the path between it and the root node.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

![first_case1](https://github.com/user-attachments/assets/324d553a-35bb-408a-854e-4a07f724c269)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `root = [2,3,5,8,13,21,34]` | `[2,5,3,8,13,21,34]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The tree has only one odd level. <br>
The nodes at level 1 are 3, 5 respectively, which are reversed and become 5, 3.

____
<h3>

<ins>**Example 2**:</ins> </br>

![second_case3](https://github.com/user-attachments/assets/bf1f7696-53ee-457b-9545-62022a6b7e65)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `root = [7,13,11]` | `[7,11,13]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The nodes at level 1 are 13, 11, which are reversed and become 11, 13.

___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `root = [0,1,2,0,0,0,0,1,1,1,1,2,2,2,2]` | `[0,2,1,0,0,0,0,2,2,2,2,1,1,1,1]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The odd levels have non-zero values. <br>
The nodes at level 1 were 1, 2, and are 2, 1 after the reversal. <br>
The nodes at level 3 were 1, 1, 1, 1, 2, 2, 2, 2, and are 2, 2, 2, 2, 1, 1, 1, 1 after the reversal.

___

## Constraints 🔍

> The number of nodes in the tree is in the range `[1, 214].`</br>

> `0 <= Node.val <= 10^5` <br>

> `root` is a perfect binary tree.

___

## Topics 📝

1. Tree
2. Depth - First Search
3. Breadth - First Search
4. Binary Tree


## Solution 📃


|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2415%20-%20Reverse%20Odd%20Levels%20of%20Binary%20Tree/_2415ReverseOddLevelsOfBinaryTree.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2415%20-%20Reverse%20Odd%20Levels%20of%20Binary%20Tree/_2415ReverseOddLevelsOfBinaryTree.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2415%20-%20Reverse%20Odd%20Levels%20of%20Binary%20Tree/_2415ReverseOddLevelsOfBinaryTree.js) |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2415%20-%20Reverse%20Odd%20Levels%20of%20Binary%20Tree/_2415ReverseOddLevelsOfBinaryTree.py) |
