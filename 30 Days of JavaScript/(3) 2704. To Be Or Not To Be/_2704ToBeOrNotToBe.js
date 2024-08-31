var expect = function (val) {
    let toBe = function (num) {
        if (val === num) return true;
        else throw new Error("Not Equal");
    }

    let notToBe = function (num) {
        if (val !== num) return true;
        else throw new Error("Equal");
    }

    return { toBe, notToBe };
};