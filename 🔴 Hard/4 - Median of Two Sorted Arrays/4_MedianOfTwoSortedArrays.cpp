class Solution
{
public:
    double findMedianSortedArrays(vector<int> &nums1, vector<int> &nums2)
    {
        int n1 = nums1.size();
        int n2 = nums2.size();

        vector<int> nums(n1 + n2);
        int k = 0;
        for (int num1 : nums1)
        {
            nums[k++] = num1;
        }

        for (int num2 : nums2)
        {
            nums[k++] = num2;
        }

        sort(nums.begin(), nums.end());

        int mid = (n1 + n2) / 2;
        if ((n1 + n2) % 2 == 0)
        {
            return ((double)nums[mid] + (double)nums[mid - 1]) / 2.0;
        }
        else
        {
            return (double)nums[mid];
        }
    }
};