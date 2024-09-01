/**
 * @param {string[]} words
 * @return {string[]}
 */
var removeAnagrams = function (words) {
    let res = [];
    let prev = "";
    for (let i = 0; i < words.length; i++) {
        let curr = words[i];
        curr = words[i].split("").sort().join("");

        if (prev !== curr) {
            res.push(words[i]);
        }

        prev = curr;
    }

    return res;
};