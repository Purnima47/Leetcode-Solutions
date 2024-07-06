var passThePillow = function (n, time) {
    let div = Math.floor(time / (n - 1));
    let rem = time % (n - 1);

    return div % 2 == 0 ? rem + 1 : n - rem;
};