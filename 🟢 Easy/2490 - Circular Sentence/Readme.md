# 2490. Circular Sentence

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/circular-sentence/description/?envType=daily-question&envId=2024-11-02"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

- For example, `"Hello World"`, `"HELLO"`, `"hello world hello world"` are all sentences.


#### Words consist of only uppercase and lowercase English letters. Uppercase and lowercase English letters are considered different.


#### A sentence is circular if:

- The last character of a word is equal to the first character of the next word.

- The last character of the last word is equal to the first character of the first word.


#### For example, `"leetcode exercises sound delightful"`, `"eetcode"`, `"leetcode eats soul"` are all circular sentences. However, `"Leetcode is cool"`, `"happy Leetcode"`, `"Leetcode"` and `"I like Leetcode"` are not circular sentences.

#### Given a string `sentence`, return `true` if it is circular. Otherwise, return `false`.


---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `sentence = "leetcode exercises sound delightful"` | `true` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>


The words in sentence are ["leetcode", "exercises", "sound", "delightful"].

- leetcode's last character is equal to exercises's first character.

- exercises's last character is equal to sound's first character.

- sound's last character is equal to delightful's first character.

- delightful's last character is equal to leetcode's first character.

The sentence is circular.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `sentence = "eetcode"` | `true` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>


The words in sentence are ["eetcode"].

- eetcode's last character is equal to eetcode's first character.

The sentence is circular.

___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `sentence = "Leetcode is cool"` | `false` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>


The words in sentence are ["Leetcode", "is", "cool"].

- Leetcode's last character is not equal to is's first character.

The sentence is not circular.

___

## Constraints 🔍

> `1 <= sentence.length <= 500`</br>

> `sentence` consist of only lowercase and uppercase English letters and spaces. <br>

> The words in `sentence` are separated by a single space. <br>

> There are no leading or trailing spaces.


___

## Topics 📝

1. String


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA]() |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++]()  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript]() |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python]() |
