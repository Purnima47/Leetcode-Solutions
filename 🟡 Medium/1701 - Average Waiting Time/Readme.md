# 1701. Average Waiting Time

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/average-waiting-time/description/?envType=daily-question&envId=2024-07-09"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### There is a restaurant with a single chef. You are given an array `customers`, where `customers[i] = [arrivali, timei]`:

- `arrivali` is the arrival time of the `ith` customer. The arrival times are sorted in non-decreasing order.
- `timei` is the time needed to prepare the order of the `ith` customer.

#### When a customer arrives, he gives the chef his order, and the chef starts preparing it once he is idle. The customer waits till the chef finishes preparing his order. The chef does not prepare food for more than one customer at a time. The chef prepares food for customers in the order they were given in the input.

#### Return the _average waiting time of all customers_. Solutions within `10^(-5)` from the actual answer are considered accepted.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
|  `customers = [[1,2],[2,5],[4,3]]` | `5.00000` |
</h3>

<h3>
<ins>Explanation:</ins>
</h3>

1) The first customer arrives at time 1, the chef takes his order and starts preparing it immediately at time 1, and finishes at time 3, so the waiting time of the first customer is 3 - 1 = 2.
2) The second customer arrives at time 2, the chef takes his order and starts preparing it at time 3, and finishes at time 8, so the waiting time of the second customer is 8 - 2 = 6.
3) The third customer arrives at time 4, the chef takes his order and starts preparing it at time 8, and finishes at time 11, so the waiting time of the third customer is 11 - 4 = 7.
So the average waiting time = (2 + 6 + 7) / 3 = 5.
___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `customers = [[5,2],[5,4],[10,3],[20,1]]` |  `3.25000` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

1) The first customer arrives at time 5, the chef takes his order and starts preparing it immediately at time 5, and finishes at time 7, so the waiting time of the first customer is 7 - 5 = 2.
2) The second customer arrives at time 5, the chef takes his order and starts preparing it at time 7, and finishes at time 11, so the waiting time of the second customer is 11 - 5 = 6.
3) The third customer arrives at time 10, the chef takes his order and starts preparing it at time 11, and finishes at time 14, so the waiting time of the third customer is 14 - 10 = 4.
4) The fourth customer arrives at time 20, the chef takes his order and starts preparing it immediately at time 20, and finishes at time 21, so the waiting time of the fourth customer is 21 - 20 = 1.
So the average waiting time = (2 + 6 + 4 + 1) / 4 = 3.25.
___

## Constraints 🔍

> `1 <= customers.length <= 10^5`</br>
> `1 <= arrivali, timei <= 10^4` </br>
> `arrivali <= arrivali+1` 
___

## Topics 📝

1. Array
2. Simulation

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1701%20-%20Average%20Waiting%20Time/_1701AverageWaitingTime.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1701%20-%20Average%20Waiting%20Time/_1701AverageWaitingTime.cpp)  |
|![C](https://img.shields.io/badge/c-%2300599C.svg?style=plastic&logo=c&logoColor=white)| [C](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1701%20-%20Average%20Waiting%20Time/_1701AverageWaitingTime.c) |
|![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=plastic&logo=javascript&logoColor=%23F7DF1E)| [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1701%20-%20Average%20Waiting%20Time/_1701AverageWaitingTime.js) |
