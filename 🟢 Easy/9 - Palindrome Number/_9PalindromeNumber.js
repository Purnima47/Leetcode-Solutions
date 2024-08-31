var isPalindrome = function (x) {
    let num = x;
    let rev = 0;
    while (x > 0) {
        let r = x % 10;
        rev = rev * 10 + r;
        x = Math.floor(x / 10);
    }

    return num == rev;
};