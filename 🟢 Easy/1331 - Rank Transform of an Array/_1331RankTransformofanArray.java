class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> set = new TreeSet<>();

        for (int el : arr) {
            set.add(el);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int r = 1;
        for (int s : set) {
            map.put(s, r);
            r++;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}