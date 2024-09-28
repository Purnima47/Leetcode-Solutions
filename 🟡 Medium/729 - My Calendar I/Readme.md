# 729. My Calendar I

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/my-calendar-i/description/?envType=daily-question&envId=2024-09-26"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are implementing a program to use as your calendar. We can add a new event if adding the event will not cause a double booking.

#### A double booking happens when two events have some non-empty intersection (i.e., some moment is common to both events.).

#### The event can be represented as a pair of integers `start` and `end` that represents a booking on the half-open interval `[start, end)`, the range of real numbers `x` such that `start <= x < end`.

#### Implement the `MyCalendar` class:

- `MyCalendar()` Initializes the calendar object.

- `boolean book(int start, int end)` Returns `true` if the event can be added to the calendar successfully without causing a double booking. Otherwise, return `false` and do not add the event to the calendar.


---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `["MyCalendar", "book", "book", "book"]
[[], [10, 20], [15, 25], [20, 30]]` | `[null, true, false, true]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

MyCalendar myCalendar = new MyCalendar(); <br>
myCalendar.book(10, 20); // return True <br>
myCalendar.book(15, 25); // return False, It can not be booked because time 15 is already booked by another event. <br>
myCalendar.book(20, 30); // return True, The event can be booked, as the first event takes every time less than 20, but not including 20.


___

## Constraints 🔍

> `0 <= start < end <= 10^9`</br>

> At most `1000` calls will be made to `book`.

___

## Topics 📝

1. Array
2. Binary Search
3. Design
4. Segment Tree
5. Ordered Set


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA]() |