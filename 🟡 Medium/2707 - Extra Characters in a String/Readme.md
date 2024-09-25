# 2707. Extra Characters in a String

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/extra-characters-in-a-string/description/?envType=daily-question&envId=2024-09-23"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given a 0-indexed string `s` and a dictionary of words `dictionary`. You have to break `s` into one or more non-overlapping substrings such that each substring is present in `dictionary`. There may be some extra characters in `s` which are not present in any of the substrings.

#### Return the minimum number of extra characters left over if you break up `s` optimally.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "leetscode", dictionary = ["leet","code","leetcode"]` | `1` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

We can break s in two substrings: "leet" from index 0 to 3 and "code" from index 5 to 8. There is only 1 unused character (at index 4), so we return 1.


____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "sayhelloworld", dictionary = ["hello","world"]` | `3` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

We can break s in two substrings: "hello" from index 3 to 7 and "world" from index 8 to 12. The characters at indices 0, 1, 2 are not used in any substring and thus are considered as extra characters. Hence, we return 3.


___

## Constraints 🔍

> `1 <= s.length <= 50`</br>

> `1 <= dictionary.length <= 50` <br>

> `1 <= dictionary[i].length <= 50` <br>

> `dictionary[i]` and `s` consists of only lowercase English letters <br>

> `dictionary` contains distinct words

___

## Topics 📝

1. Array
2. Hash Table
3. String
4. Dynamic Programming
5. Trie


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2707%20-%20Extra%20Characters%20in%20a%20String/_2707ExtraCharactersInAString.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2707%20-%20Extra%20Characters%20in%20a%20String/_2707ExtraCharactersInAString.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2707%20-%20Extra%20Characters%20in%20a%20String/_2707ExtraCharactersInAString.js) |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2707%20-%20Extra%20Characters%20in%20a%20String/_2707ExtraCharactersInAString.py) |
