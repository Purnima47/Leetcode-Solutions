class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        int count = 0;
        for (String str : words1) {
            if (map1.containsKey(str)) {
                map1.put(str, map1.get(str) + 1);
            } else {
                map1.put(str, 1);
            }
        }
        for (String str : words2) {
            if (map2.containsKey(str)) {
                map2.put(str, map2.get(str) + 1);
            } else {
                map2.put(str, 1);
            }
        }
        for (String str : words1) {
            if (map1.get(str) == 1 && map2.containsKey(str)) {
                if (map2.get(str) == 1) {
                    count++;
                }
            }
        }

        return count;
    }
}