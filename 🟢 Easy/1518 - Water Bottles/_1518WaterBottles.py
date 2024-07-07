class Solution:
    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:
        maxUsedBottles = 0

        while numBottles >= numExchange:
            newFullBottles = numBottles // numExchange
            maxUsedBottles += newFullBottles * numExchange
            numBottles -= newFullBottles * numExchange
            numBottles += newFullBottles

        maxUsedBottles += numBottles
        return maxUsedBottles
