/**
 * @param {string} allowed
 * @param {string[]} words
 * @return {number}
 */
var countConsistentStrings = function (allowed, words) {
    let contains = new Array(26).fill(false);
    let count = 0;

    for (let i = 0; i < allowed.length; i++) {
        contains[allowed.charCodeAt(i) - '97'] = true;
    }

    let notAllowed = false;

    for (let word of words) {
        notAllowed = false;

        for (let i = 0; i < word.length; i++) {
            if (contains[word.charCodeAt(i) - '97'] == false) {
                notAllowed = true;
                break;
            }
        }

        if (!notAllowed) {
            count++;
        }
    }

    return count;
};