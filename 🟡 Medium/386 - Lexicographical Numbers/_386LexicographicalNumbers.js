/**
 * @param {number} n
 * @return {number[]}
 */
var dfs = function (i, n, res) {
    if (i > n) {
        return;
    }

    res.push(i);

    for (let j = 0; j < 10; j++) {
        dfs(10 * i + j, n, res);
    }
}

var lexicalOrder = function (n) {
    let res = [];
    for (let i = 1; i <= 9; i++) {
        dfs(i, n, res);
    }

    return res;
};