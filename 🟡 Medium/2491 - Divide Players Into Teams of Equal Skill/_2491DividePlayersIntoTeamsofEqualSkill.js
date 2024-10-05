/**
 * @param {number[]} skill
 * @return {number}
 */
var dividePlayers = function (skill) {
    skill.sort((a, b) => a - b);

    let l = 0, r = skill.length - 1;
    let start = skill[l] + skill[r];
    let res = 0;

    while (l < r) {
        if (skill[l] + skill[r] != start) {
            return -1;
        }

        res += (skill[l] * skill[r]);
        l++;
        r--;
    }

    return res;
};