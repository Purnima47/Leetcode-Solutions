/**
 * @param {string} word
 * @return {string}
 */
var compressedString = function (word) {
    let res = "";
    let i = 0;
    let curr = word[0];

    while (i < word.length) {
        let count = 0;

        while (i < word.length && word[i] == curr && count < 9) {
            i++;
            count++;
        }

        res += count + curr;

        if (i != word.length) {
            curr = word[i];
        }
    }

    return res;
};