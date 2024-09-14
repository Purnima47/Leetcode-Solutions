/**
 * @param {string} s
 * @return {string}
 */
var reverseVowels = function (s) {
    let i = 0;
    let j = s.length - 1;
    let vowels = "AEIOUaeiou";

    let word = s.split("");

    while (i < j) {
        while (i < j && vowels.indexOf(word[i]) == -1) {
            i++;
        }

        while (i < j && vowels.indexOf(word[j]) == -1) {
            j--;
        }

        let temp = word[i];
        word[i] = word[j];
        word[j] = temp;

        i++;
        j--;
    }

    return word.join("");
};