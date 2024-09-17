# 2085. Count Common Words With One Occurrence

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/count-common-words-with-one-occurrence/"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Given two string arrays `words1` and `words2`, return the number of strings that appear exactly once in each of the two arrays.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `words1 = ["leetcode","is","amazing","as","is"]`, `words2 = ["amazing","leetcode","is"]` | `2` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

- "leetcode" appears exactly once in each of the two arrays. We count this string.

- "amazing" appears exactly once in each of the two arrays. We count this string.

- "is" appears in each of the two arrays, but there are 2 occurrences of it in words1. We do not count this string.

- "as" appears once in words1, but does not appear in words2. We do not count this string.

Thus, there are 2 strings that appear exactly once in each of the two arrays.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `words1 = ["b","bb","bbb"]`, `words2 = ["a","aa","aaa"]` | `0` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

There are no strings that appear in each of the two arrays.

___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `words1 = ["a","ab"]`, `words2 = ["a","a","a","ab"]` | `1` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The only string that appears exactly once in each of the two arrays is "ab".

___

## Constraints 🔍

> `1 <= words1.length, words2.length <= 1000`</br>

> `1 <= words1[i].length, words2[j].length <= 30` <br>

> `words1[i]` and `words2[j]` consists only of lowercase English letters.

___

## Topics 📝

1. Array
2. Hash Table
3. String
4. Counting


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/2085%20-%20Count%20Common%20Words%20With%20One%20Occurrence/_2085CountCommonWordsWithOneOccurrence.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/2085%20-%20Count%20Common%20Words%20With%20One%20Occurrence/_2085CountCommonWordsWithOneOccurrence.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/2085%20-%20Count%20Common%20Words%20With%20One%20Occurrence/_2085CountCommonWordsWithOneOccurrence.js) |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/2085%20-%20Count%20Common%20Words%20With%20One%20Occurrence/_2085CountCommonWordsWithOneOccurrence.py) |
