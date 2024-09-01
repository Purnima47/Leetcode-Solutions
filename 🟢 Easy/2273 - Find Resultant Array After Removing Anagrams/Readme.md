# 2273. Find Resultant Array After Removing Anagrams

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/description/"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given a 0-indexed string array `words`, where `words[i]` consists of lowercase English letters.

#### In one operation, select any index `i` such that `0 < i < words.length` and `words[i - 1]` and `words[i]` are anagrams, and delete `words[i]` from `words`. Keep performing this operation as long as you can select an index that satisfies the conditions.

#### Return `words` after performing all operations. It can be shown that selecting the indices for each operation in any arbitrary order will lead to the same result.

#### An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase using all the original letters exactly once. For example, `"dacb"` is an anagram of `"abdc"`.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `words = ["abba","baba","bbaa","cd","cd"]` | `["abba","cd"]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

One of the ways we can obtain the resultant array is by using the following operations:

- Since words[2] = "bbaa" and words[1] = "baba" are anagrams, we choose index 2 and delete words[2]. <br>
  Now words = ["abba","baba","cd","cd"]. 

- Since words[1] = "baba" and words[0] = "abba" are anagrams, we choose index 1 and delete words[1]. <br>
  Now words = ["abba","cd","cd"].

- Since words[2] = "cd" and words[1] = "cd" are anagrams, we choose index 2 and delete words[2]. <br>
  Now words = ["abba","cd"].

We can no longer perform any operations, so ["abba","cd"] is the final answer.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `words = ["a","b","c","d","e"]` | `["a","b","c","d","e"]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

No two adjacent strings in words are anagrams of each other, so no operations are performed.
___


## Constraints 🔍

> `1 <= words.length <= 100`</br>

> `1 <= words[i].length <= 10`. <br>

> `words[i]` consists of lowercase English letters.

___

## Topics 📝

1. Array
2. Hash Table
3. String 
4. Sorting


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA]() |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++]()  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript]() |
