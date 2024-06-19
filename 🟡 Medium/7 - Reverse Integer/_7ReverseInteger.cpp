class Solution
{
public:
    int reverse(int x)
    {
        long rev = 0;
        int n = abs(x);
        while (n > 0)
        {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        if (rev > INT_MAX || rev < INT_MIN)
        {
            return 0;
        }

        return x > 0 ? (int)rev : -(int)rev;
    }
};