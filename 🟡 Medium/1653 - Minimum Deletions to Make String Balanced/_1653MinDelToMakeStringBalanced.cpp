class Solution {
public:
    int minimumDeletions(string s) {
        int n = s.length();

        vector<int> ACountArr(n);
        vector<int> BCountArr(n);

        int noOfA = 0;
        int noOfB = 0;
        
        int minDel = n;

        for (int i = 0; i < n; i++) {
            BCountArr[i] = noOfB;
            if (s.at(i) == 'b') {
                noOfB++;
            }

            ACountArr[n - i - 1] = noOfA;
            if (s.at(n - i - 1) == 'a') {
                noOfA++;
            }
        }

        for (int i = 0; i < n; i++) {
            minDel = min(minDel, ACountArr[i] + BCountArr[i]);
        }

        return minDel;
    }
};