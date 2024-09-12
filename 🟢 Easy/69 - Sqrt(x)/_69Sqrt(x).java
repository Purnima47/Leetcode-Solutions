class Solution {
    public int mySqrt(int x) {
        int num = 1;
        while (x / num > num) {
            num++;
        }
        if (x / num == num)
            return num;
        else
            return num - 1;
    }
}