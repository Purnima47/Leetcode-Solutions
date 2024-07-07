class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        // to store the required answer
        int maxUsedBottles = 0;

        // when there is leftEmptyBottles i.e. numBottles >= numExchange till then only
        // we can exchange it to buy new ones.
        while (numBottles >= numExchange) {

            // new Bottles we can get from empty ones would be numBottles / numExchange
            int newFullBottles = numBottles / numExchange;

            // Now add your new Bottles to used ones.
            maxUsedBottles += newFullBottles * numExchange;
            // Decrease it from numBottles.
            numBottles -= newFullBottles * numExchange;

            // Now add your fullBottles to your numBottles since it has also become empty
            numBottles += newFullBottles;
        }

        // if there is left numBottles then add it to maxUsedBottles since at last we
        // have added new ones to it.
        maxUsedBottles += numBottles;
        return maxUsedBottles;
    }
}