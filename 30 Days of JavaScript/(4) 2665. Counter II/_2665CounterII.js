var createCounter = function (init) {
    let val = init;

    let increment = function () {
        return ++val;
    }

    let decrement = function () {
        return --val;
    }

    let reset = function () {
        val = init;
        return val;
    }

    return { increment, decrement, reset };
};