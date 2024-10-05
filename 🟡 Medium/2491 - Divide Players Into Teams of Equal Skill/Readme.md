# 2491. Divide Players Into Teams of Equal Skill

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/divide-players-into-teams-of-equal-skill/description/?envType=daily-question&envId=2024-10-04"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given a positive integer array `skill` of even length n where `skill[i]` denotes the skill of the `ith` player. Divide the players into `n / 2` teams of size `2` such that the total skill of each team is equal.

#### The chemistry of a team is equal to the product of the skills of the players on that team.

#### Return the sum of the chemistry of all the teams, or return `-1` if there is no way to divide the players into teams such that the total skill of each team is equal.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `skill = [3,2,5,1,3,4]` | `22` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Divide the players into the following teams: (1, 5), (2, 4), (3, 3), where each team has a total skill of 6. <br>
The sum of the chemistry of all the teams is: 1 * 5 + 2 * 4 + 3 * 3 = 5 + 8 + 9 = 22.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `skill = [3,4]` | `12` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The two players form a team with a total skill of 7. <br>
The chemistry of the team is 3 * 4 = 12.

___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `skill = [1,1,2,3]` | `-1` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

There is no way to divide the players into teams such that the total skill of each team is equal.

___

## Constraints 🔍

> `2 <= skill.length <= 10^5`</br>

> `skill.length` is even. <br>

> `1 <= skill[i] <= 1000`

___

## Topics 📝

1. Array


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2491%20-%20Divide%20Players%20Into%20Teams%20of%20Equal%20Skill/_2491DividePlayersIntoTeamsofEqualSkill.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2491%20-%20Divide%20Players%20Into%20Teams%20of%20Equal%20Skill/_2491DividePlayersIntoTeamsofEqualSkill.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2491%20-%20Divide%20Players%20Into%20Teams%20of%20Equal%20Skill/_2491DividePlayersIntoTeamsofEqualSkill.js) |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2491%20-%20Divide%20Players%20Into%20Teams%20of%20Equal%20Skill/_2491DividePlayersIntoTeamsofEqualSkill.py) |
