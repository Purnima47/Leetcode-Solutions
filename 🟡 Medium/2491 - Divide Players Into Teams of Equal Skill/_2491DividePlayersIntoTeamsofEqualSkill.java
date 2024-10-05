class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);

        int l = 0, r = skill.length - 1;
        int start = skill[l] + skill[r];
        long res = 0;

        while (l < r) {
            if (skill[l] + skill[r] != start) {
                return -1;
            }

            res += (skill[l] * skill[r]);
            l++;
            r--;
        }

        return res;
    }
}