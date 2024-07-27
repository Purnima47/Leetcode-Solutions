# 2976. Minimum Cost to Convert String I

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/minimum-cost-to-convert-string-i/description/?envType=daily-question&envId=2024-07-27"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given two 0-indexed strings `source` and `target`, both of length n and consisting of lowercase English letters. You are also given two 0-indexed character arrays `original` and `changed`, and an integer array `cost`, where `cost[i]` represents the cost of changing the character `original[i]` to the character `changed[i]`.

#### You start with the string `source`. In one operation, you can pick a character `x` from the string and change it to the character `y` at a cost of `z` if there exists any index `j` such that `cost[j] == z`, `original[j] == x`, and `changed[j] == y`.

#### Return the minimum cost to convert the string `source` to the string `target` using any number of operations. If it is impossible to convert `source` to `target`, return `-1`.

#### Note that there may exist indices `i`, `j` such that `original[j] == original[i]` and `changed[j] == changed[i]`.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `source = "abcd", target = "acbe"`, `original = ["a","b","c","c","e","d"]`, `changed = ["b","c","b","e","b","e"]`, `cost = [2,5,5,1,2,20]` | `28` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

To convert the string "abcd" to string "acbe":

- Change value at index 1 from 'b' to 'c' at a cost of 5.
- Change value at index 2 from 'c' to 'e' at a cost of 1.
- Change value at index 2 from 'e' to 'b' at a cost of 2.
- Change value at index 3 from 'd' to 'e' at a cost of 20.

The total cost incurred is 5 + 1 + 2 + 20 = 28.
It can be shown that this is the minimum possible cost.

___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `source = "aaaa", target = "bbbb"`, `original = ["a","c"]`, `changed = ["c","b"]`, `cost = [1,2]` | `12` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

To change the character 'a' to 'b' change the character 'a' to 'c' at a cost of 1, followed by changing the character 'c' to 'b' at a cost of 2, for a total cost of 1 + 2 = 3. To change all occurrences of 'a' to 'b', a total cost of 3 * 4 = 12 is incurred.

___
<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `source = "abcd", target = "abce"`, `original = ["a"]`, `changed = ["e"]`, `cost = [10000]` | `-1` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

It is impossible to convert source to target because the value at index 3 cannot be changed from 'd' to 'e'

___

## Constraints 🔍

> `1 <= source.length == target.length <= 10^5`</br>
> `source`, `target` consist of lowercase English letters. </br>

> `1 <= cost.length == original.length == changed.length <= 2000` </br>

> `original[i]`, `changed[i]` are lowercase English letters. </br>

> `1 <= cost[i] <= 10^6` </br>

> `original[i] != changed[i]`

___

## Topics 📝

1. Array
2. String
3. Graph
4. Shortest Path

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2976%20-%20Minimum%20Cost%20to%20Covert%20String%20I/_2976MinCostToConvertStringI.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2976%20-%20Minimum%20Cost%20to%20Covert%20String%20I/_2976MinCostToConvertStringI.cpp)  |
