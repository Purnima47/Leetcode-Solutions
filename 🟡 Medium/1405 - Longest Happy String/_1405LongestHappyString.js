/**
 * @param {number} a
 * @param {number} b
 * @param {number} c
 * @return {string}
 */
var longestDiverseString = function (a, b, c) {
    let currA = 0, currB = 0, currC = 0;
    let maxLen = a + b + c;
    let i = 0;
    let sb = "";
    while (i < (maxLen)) {
        if (currA != 2 && a >= b && a >= c ||
            a > 0 && (currB == 2 || currC == 2)) {
            sb += 'a';
            currA++;
            currB = 0;
            currC = 0;
            a--;
        }

        else if (currB != 2 && b >= a && b >= c ||
            b > 0 && (currA == 2 || currC == 2)) {
            sb += 'b';
            currB++;
            currA = 0;
            currC = 0;
            b--;
        }

        else if (currC != 2 && c >= a && c >= b ||
            c > 0 && (currA == 2 || currB == 2)) {
            sb += 'c';
            currC++;
            currA = 0;
            currB = 0;
            c--;
        }
        i++;
    }
    return sb;
};