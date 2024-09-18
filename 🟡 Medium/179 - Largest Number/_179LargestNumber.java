class Solution {
    public String largestNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int num : nums) {
            list.add(String.valueOf(num));
        }

        Collections.sort(list, (a, b) -> ((b + a).compareTo(a + b)));
        if (list.get(0).equals("0")) {
            return "0";
        }

        String res = "";

        for (String str : list) {
            res += str;
        }

        return res;
    }
}