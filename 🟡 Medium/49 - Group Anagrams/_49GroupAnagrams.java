class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        // add the anargram words of the curr word to the map.
        // and also add that word.
        // we will have the values as our result.

        for (int i = 0; i < strs.length; i++) {
            char charArr[] = strs[i].toCharArray();
            Arrays.sort(charArr);
            String curr = String.valueOf(charArr);

            if (!hm.containsKey(curr)) {
                hm.put(curr, new ArrayList<>());
            }

            hm.get(curr).add(strs[i]);
        }

        for (String key : hm.keySet()) {
            res.add(hm.get(key));
        }

        return res;
    }
}