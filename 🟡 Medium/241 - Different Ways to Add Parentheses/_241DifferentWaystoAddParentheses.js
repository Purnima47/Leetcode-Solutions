/**
 * @param {string} expression
 * @return {number[]}
 */
var diffWaysToCompute = function (expression) {
    let res = [];

    for (let i = 0; i < expression.length; i++) {
        let ch = expression[i];
        if (ch == '+' || ch == '-' || ch == '*') {
            let left = diffWaysToCompute(expression.substring(0, i));
            let right = diffWaysToCompute(expression.substring(i + 1));

            for (let j of left) {
                for (let k of right) {
                    if (ch == '+') {
                        res.push(j + k);
                    } else if (ch == '-') {
                        res.push(j - k);
                    } else {
                        res.push(j * k);
                    }
                }
            }
        }
    }

    if (res.length == 0) {
        res.push(parseInt(expression));
    }

    return res;
};