# 2058. Find the Minimum and Maximum Number of Nodes Between Critical Points

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/description/"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### A _critical point_ in a linked list is defined as _either_ a _local maxima_ or a _local minima_.

#### A node is a `local maxima` if the current node has a value `strictly greater` than the previous node and the next node.

#### A node is a `local minima` if the current node has a value `strictly smaller` than the previous node and the next node.

#### Note that a node can only be a local maxima/minima if there exists both a previous node and a next node.

#### Given a linked list `head`, return an array of length 2 containing `[minDistance, maxDistance]` where `minDistance` is the minimum distance between any two distinct critical points and `maxDistance` is the maximum distance between any two distinct critical points. If there are fewer than two critical points, return `[-1, -1]`.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

![2058_a1](https://github.com/user-attachments/assets/afe219d5-79a4-4d7a-b295-b0050dfb9f28)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `head = [3,1]` |`[-1,-1]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

There are no critical points in [3,1].
___
<h3>

<ins>**Example 2**:</ins> </br>

![2058_a2](https://github.com/user-attachments/assets/27611b14-cdaa-4b9e-86c3-42675aa4dbb5)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `head = [5,3,1,2,5,1,2]` | `[1,3]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

There are three critical points:

- [5,3,1,2,5,1,2]: The third node is a local minima because 1 is less than 3 and 2.
- [5,3,1,2,5,1,2]: The fifth node is a local maxima because 5 is greater than 2 and 1.
- [5,3,1,2,5,1,2]: The sixth node is a local minima because 1 is less than 5 and 2.

The minimum distance is between the fifth and the sixth node. minDistance = 6 - 5 = 1.
The maximum distance is between the third and the sixth node. maxDistance = 6 - 3 = 3.

___
<h3>

<ins>**Example 3**:</ins> </br>

![2058_a5](https://github.com/user-attachments/assets/2cef618d-517b-4de9-bb26-9d63200977d6)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `head = [1,3,2,2,3,2,2,2,7]` | `[3,3]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

There are three critical points:

- [1,3,2,2,3,2,2,2,7]: The second node is a local maxima because 3 is greater than 1 and 2.
- [1,3,2,2,3,2,2,2,7]: The fifth node is a local maxima because 3 is greater than 2 and 2.

Both the minimum and maximum distances are between the second and the fifth node.
Thus, minDistance and maxDistance is 5 - 2 = 3.
Note that the last node is not considered a local maxima because it does not have a next node.

___

## Constraints 🔍

> The number of nodes in the list is in the range `[2, 10^5]`. </br>
> `1 <= Node.val <= 10^5`

___

## Topics 📝

1. Linked List

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2058%20-%20Find%20the%20Minimum%20and%20Maximum%20Number%20of%20Nodes%20Between%20Critical%20Points/_2058FindTheMinAndMaxNoOfNodesBetweenCriticalPoints.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2058%20-%20Find%20the%20Minimum%20and%20Maximum%20Number%20of%20Nodes%20Between%20Critical%20Points/_2058FindTheMinAndMaxNoOfNodesBetweenCriticalPoints.cpp)  |
