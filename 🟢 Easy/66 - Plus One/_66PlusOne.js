/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function (digits) {
    let n = digits.length;
    if (digits[n - 1] != 9) {
        let ld = digits[n - 1];
        digits[n - 1] = ld + 1;
        return digits;
    } else if (digits[n - 1] == 9 && n == 1) {
        let arr = new Array(n + 1);
        arr[0] = 1;
        arr[1] = 0;
        return arr;
    } else if (digits[n - 1] == 9 && digits[n - 2] != 9) {
        digits[n - 1] = 0;
        digits[n - 2] = digits[n - 2] + 1;
        return digits;
    } else {
        let i = n - 1;
        while (digits[i] == 9 && i > 0) {
            digits[i] = 0;
            i--;
        }
        if (digits[i] != 9) {
            digits[i] = digits[i] + 1;
            return digits;
        } else {
            let arr = new Array(n + 1);
            arr[0] = 1;
            for (let j = 1; j < arr.length; j++) {
                arr[j] = 0;
            }
            return arr;
        }
    }
};