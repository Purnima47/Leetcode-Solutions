# 3217. Delete Nodes From Linked List Present in Array

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/description/?envType=daily-question&envId=2024-09-06"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given an array of integers `nums` and the `head` of a linked list. Return the `head` of the modified linked list after removing all nodes from the linked list that have a value that exists in `nums`.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [1,2,3]`, `head = [1,2,3,4,5]` | `[4, 5]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

![linkedlistexample0](https://github.com/user-attachments/assets/62285afa-0f73-4b5b-90ae-8f53c857061e)

Remove the nodes with values 1, 2, and 3.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [1]`, `head = [1,2,1,2,1,2]` | `[2,2,2]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

![linkedlistexample1](https://github.com/user-attachments/assets/31e55c4f-be0c-4498-8947-750461b4126b)

Remove the nodes with value 1.

___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [5]`, `head = [1,2,3,4]` | `[1,2,3,4]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

![linkedlistexample2](https://github.com/user-attachments/assets/9d268409-6401-42ed-85cf-444295be7e7c)

No node has value 5.

___

## Constraints 🔍

> `1 <= nums.length <= 10^5`</br>

> `1 <= nums[i] <= 10^5`. <br>

> All elements in `nums` are unique. <br>

> The number of nodes in the given list is in the range `[1, 10^5]`. <br>

> `1 <= Node.val <= 10^5` <br>

> The input is generated such that there is at least one node in the linked list that has a value not present in `nums`. 
___

## Topics 📝

1. Array
2. Hash Table
3. Linked List

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/3217%20-%20Delete%20Nodes%20From%20Linked%20List%20Present%20in%20Array/_3217DeleteNodesFromLinkedListPresentinArray.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/3217%20-%20Delete%20Nodes%20From%20Linked%20List%20Present%20in%20Array/_3217DeleteNodesFromLinkedListPresentinArray.cpp)  |
