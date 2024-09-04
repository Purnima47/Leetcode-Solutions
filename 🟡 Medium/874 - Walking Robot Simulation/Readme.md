# 874. Walking Robot Simulation

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/walking-robot-simulation/description/?envType=daily-question&envId=2024-09-04"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### A robot on an infinite XY-plane starts at point `(0, 0)` facing north. The robot can receive a sequence of these three possible types of `commands`:

- `-2`: Turn left `90` degrees.

- `-1`: Turn right `90` degrees.

- `1 <= k <= 9`: Move forward `k` units, one unit at a time.

#### Some of the grid squares are `obstacles`. The `ith` obstacle is at grid point `obstacles[i] = (xi, yi)`. If the robot runs into an obstacle, then it will instead stay in its current location and move on to the next command.

#### Return the maximum Euclidean distance that the robot ever gets from the origin squared (i.e. if the distance is `5`, return `25`)

#### Note:

- North means +Y direction.

- East means +X direction.

- South means -Y direction.

- West means -X direction.

- There can be obstacle in [0,0].


---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `commands = [4,-1,3]`, `obstacles = []` | `25` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The robot starts at (0, 0):

1. Move north 4 units to (0, 4).

2. Turn right.

3. Move east 3 units to (3, 4).

The furthest point the robot ever gets from the origin is (3, 4), which squared is 32 + 42 = 25 units away.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `commands = [4,-1,4,-2,4]`, `obstacles = [[2,4]]` | `65` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The robot starts at (0, 0):

1. Move north 4 units to (0, 4).

2. Turn right.

3. Move east 1 unit and get blocked by the obstacle at (2, 4), robot is at (1, 4).

4. Turn left.

5. Move north 4 units to (1, 8).

The furthest point the robot ever gets from the origin is (1, 8), which squared is 12 + 82 = 65 units away.

___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `commands = [6,-1,-1,6]`, `obstacles = []` | `36` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The robot starts at (0, 0):

1. Move north 6 units to (0, 6).

2. Turn right.

3. Turn right.

4. Move south 6 units to (0, 0).

The furthest point the robot ever gets from the origin is (0, 6), which squared is 62 = 36 units away.

___

## Constraints 🔍

> `1 <= commands.length <= 10^4`</br>

> `commands[i]` is either `-2`, `-1`, or an integer in the range `[1, 9]`. <br>

> `0 <= obstacles.length <= 10^4` <br>

> `-3 * 10^4 <= xi, yi <= 3 * 10^4` <br>

> `The answer is guaranteed to be less than 2^31.`

___

## Topics 📝

1. Array
2. Hash Table
3. Simulation


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA]() |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++]()  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript]() |
