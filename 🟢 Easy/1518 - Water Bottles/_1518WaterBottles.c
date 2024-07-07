int numWaterBottles(int numBottles, int numExchange) {
    int maxUsedBottles = 0;

    while (numBottles >= numExchange) {
        int newFullBottles = numBottles / numExchange;
        maxUsedBottles += newFullBottles * numExchange;
        numBottles -= newFullBottles * numExchange;
        numBottles += newFullBottles;
    }

    maxUsedBottles += numBottles;
    return maxUsedBottles;
}