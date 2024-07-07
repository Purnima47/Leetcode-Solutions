var numWaterBottles = function (numBottles, numExchange) {
    let maxUsedBottles = 0;

    while (numBottles >= numExchange) {
        let newFullBottles = Math.floor(numBottles / numExchange);
        maxUsedBottles += newFullBottles * numExchange;
        numBottles -= newFullBottles * numExchange;
        numBottles += newFullBottles;
    }

    maxUsedBottles += numBottles;
    return maxUsedBottles;
};