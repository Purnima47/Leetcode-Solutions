# 2416. Sum of Prefix Scores of Strings

### `Hard`


<h2 align="center">
<a href="https://leetcode.com/problems/sum-of-prefix-scores-of-strings/description/?envType=daily-question&envId=2024-09-25"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given an array `words` of size `n` consisting of non-empty strings.

#### We define the score of a string `term` as the number of strings `words[i]` such that `term` is a prefix of `words[i]`.

- For example, if `words = ["a", "ab", "abc", "cab"]`, then the score of `"ab"` is 2, since `"ab"` is a prefix of both `"ab"` and `"abc"`.

#### Return an array `answer` of size `n` where `answer[i]` is the sum of scores of every non-empty prefix of `words[i]`.

#### Note that a string is considered as a prefix of itself.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `words = ["abc","ab","bc","b"]` | `[5,4,3,2]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The answer for each string is the following:

- "abc" has 3 prefixes: "a", "ab", and "abc".

- There are 2 strings with the prefix "a", 2 strings with the prefix "ab", and 1 string with the prefix "abc".
The total is answer[0] = 2 + 2 + 1 = 5.

- "ab" has 2 prefixes: "a" and "ab".

- There are 2 strings with the prefix "a", and 2 strings with the prefix "ab".
The total is answer[1] = 2 + 2 = 4.

- "bc" has 2 prefixes: "b" and "bc".

- There are 2 strings with the prefix "b", and 1 string with the prefix "bc".
The total is answer[2] = 2 + 1 = 3.

- "b" has 1 prefix: "b".

- There are 2 strings with the prefix "b".

The total is answer[3] = 2.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `words = ["abcd"]` | `[4]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>


"abcd" has 4 prefixes: "a", "ab", "abc", and "abcd". <br>
Each prefix has a score of one, so the total is answer[0] = 1 + 1 + 1 + 1 = 4.


___

## Constraints 🔍

> `1 <= words.length <= 1000`</br>

> `1 <= words[i].length <= 1000` <br>

> `words[i]` consists of lowercase English letters.

___

## Topics 📝

1. Array
2. String
3. Trie
4. Counting


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA]() |
