# 725. Split Linked List in Parts

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/split-linked-list-in-parts/description/?envType=daily-question&envId=2024-09-08"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Given the `head` of a singly linked list and an integer `k`, split the linked list into `k` consecutive linked list parts.

#### The length of each part should be as equal as possible: no two parts should have a size differing by more than one. This may lead to some parts being null.

#### The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal to parts occurring later.

#### Return an array of the `k` parts.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

![split1-lc](https://github.com/user-attachments/assets/ad828f21-aa43-4b38-8ca3-8361c18c7218)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `head = [1,2,3]`, `k = 5` | `[[1],[2],[3],[],[]]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The first element output[0] has output[0].val = 1, output[0].next = null. <br>

The last element output[4] is null, but its string representation as a ListNode is [].

____
<h3>

<ins>**Example 2**:</ins> </br>

![split2-lc](https://github.com/user-attachments/assets/ed91f0a4-8bdb-497c-b1eb-bd2ddae3f4ef)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `head = [1,2,3,4,5,6,7,8,9,10]`, `k = 3` | `[[1,2,3,4],[5,6,7],[8,9,10]]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The input has been split into consecutive parts with size difference at most 1, and earlier parts are a larger size than the later parts.


___


## Constraints 🔍

> The number of nodes in the list is in the range `[0, 1000]`.</br>

> `0 <= Node.val <= 1000`. <br>

> `1 <= k <= 50`

___

## Topics 📝

1. Linked List


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/725%20-%20Split%20Linked%20List%20in%20Parts/_725SplitLinkedListinParts.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/725%20-%20Split%20Linked%20List%20in%20Parts/_725SplitLinkedListinParts.cpp)  |
