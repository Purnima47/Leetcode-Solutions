# 2181. Merge Nodes in Between Zeros

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/merge-nodes-in-between-zeros/description/?envType=daily-question&envId=2024-07-04"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given the `head` of a linked list, which contains a series of integers separated by `0`'s. The beginning and end of the linked list will have `Node.val == 0`.

#### For every two consecutive `0`'s, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes. The modified list should not contain any `0`'s.

#### Return the `head` of the _modified linked list_.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

![2181ex1-1](https://github.com/Purnima47/Leetcode-Solutions/assets/111565835/36871fbb-b765-46e8-ac13-afe23ee4bf38)

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
|  `head = [0,3,1,0,4,5,2,0]` | `[4,11]` |
</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The above figure represents the given linked list. The modified list contains
- The sum of the nodes marked in green: 3 + 1 = 4.
- The sum of the nodes marked in red: 4 + 5 + 2 = 11.
___
<h3>

<ins>**Example 2**:</ins> </br>

![2181ex2-1](https://github.com/Purnima47/Leetcode-Solutions/assets/111565835/c1a45a76-f51a-4a91-b9ff-da9bad114660)

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `head = [0,1,0,3,0,2,2,0]` |  `[1,3,4]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The above figure represents the given linked list. The modified list contains
- The sum of the nodes marked in green: 1 = 1.
- The sum of the nodes marked in red: 3 = 3.
- The sum of the nodes marked in yellow: 2 + 2 = 4.

___

## Constraints 🔍

> The number of nodes in the list is in the range `[3, 2 * 105]`. </br>
> `0 <= Node.val <= 1000` </br>
> There are no two consecutive nodes with `Node.val == 0`. </br>
> The beginning and end of the linked list have `Node.val == 0`.
___

## Topics 📝

1. Linked List
2. Simulation

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2181%20-%20Merge%20Nodes%20in%20Between%20Zeros/_2181MergeNodeInBetweenZeros.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2181%20-%20Merge%20Nodes%20in%20Between%20Zeros/_2181MergeNodesInBetweenZeros.cpp)  |
