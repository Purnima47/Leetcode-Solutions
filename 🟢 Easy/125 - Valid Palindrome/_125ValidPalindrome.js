/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function (s) {
    let str = s.toLowerCase();
    let sb = "";

    for (let i = 0; i < str.length; i++) {
        let ch = str.charCodeAt(i);
        if (ch >= 48 && ch <= 57) {
            sb += String.fromCharCode(ch);
        }
        if (ch >= 97 && ch <= 122) {
            sb += String.fromCharCode(ch);
        }
    }

    let rev = sb.split("").reverse().join("");

    if (sb === rev) {
        return true;
    }
    return false;
};