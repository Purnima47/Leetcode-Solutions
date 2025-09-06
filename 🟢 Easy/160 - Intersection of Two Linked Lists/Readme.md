# LeetCode Problem 160: Intersection of Two Linked Lists

### Difficulty: Easy

## 🔗 [Problem Link](https://leetcode.com/problems/intersection-of-two-linked-lists/description/)

---

## 📝 Description

Given the heads of two singly linked-lists `headA` and `headB`, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return `null`.

### ⚠️ Constraints

* The linked lists must retain their original structure after the function returns.
* There are no cycles anywhere in the entire linked structure.

---

## 🧪 Custom Judge

The inputs to the judge are given as follows (not accessible in your program):

* `intersectVal`: The value of the node where the intersection occurs (0 if no intersection).
* `listA`: The first linked list.
* `listB`: The second linked list.
* `skipA`: The number of nodes to skip from the head of listA to reach the intersection.
* `skipB`: The number of nodes to skip from the head of listB to reach the intersection.

Your function receives only the `headA` and `headB` pointers.

---

## 📸 Examples

### Example 1

![Example 1](https://github.com/user-attachments/assets/0167638a-3afa-4a59-8341-e6d62f054245)

**Input:**

* `intersectVal = 8`
* `listA = [4,1,8,4,5]`
* `listB = [5,6,1,8,4,5]`
* `skipA = 2`, `skipB = 3`

**Output:** `Intersected at '8'`

**Explanation:** The node with value 8 is the intersection point, sharing the same memory address in both lists.

---

### Example 2

![Example 2](https://github.com/user-attachments/assets/aafbe567-e988-4542-8473-ab186d039d6b)

**Input:**

* `intersectVal = 2`
* `listA = [1,9,1,2,4]`
* `listB = [3,2,4]`
* `skipA = 3`, `skipB = 1`

**Output:** `Intersected at '2'`

**Explanation:** The node with value 2 is the first common node by reference.

---

### Example 3

![Example 3](https://github.com/user-attachments/assets/c1655ee4-9469-481c-8db7-ccea9c089bd5)

**Input:**

* `intersectVal = 0`
* `listA = [2,6,4]`
* `listB = [1,5]`
* `skipA = 3`, `skipB = 2`

**Output:** `No intersection`

**Explanation:** The two lists do not intersect.

---

## 📌 Constraints

* `0 <= Node.val <= 10^9`
* `1 <= listA.length, listB.length <= 5 * 10^4`

---

## 💡 Topics Covered

* Linked List
* Two Pointers
* Hash Table (alternative approach)

---

## ✅ Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA]() |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++]()  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript]() |
