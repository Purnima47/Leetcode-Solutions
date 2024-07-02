class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        
        List<Integer> resList = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                resList.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int k = 0;
        int[] res = new int[resList.size()];
        for(int result:resList){
            res[k++] = result;
        }

        return res;
    }
}