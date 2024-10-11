/**
 * @param {string} s
 * @return {number}
 */
var minAddToMakeValid = function (s) {
    let stack = [];

    for (let i = 0; i < s.length; i++) {
        if (stack.length != 0 && stack.slice(-1) == '(' && s[i] == ')') {
            stack.pop();
        } else {
            stack.push(s[i]);
        }
    }

    return stack.length;
};