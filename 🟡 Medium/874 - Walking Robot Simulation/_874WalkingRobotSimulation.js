/**
 * @param {number[]} commands
 * @param {number[][]} obstacles
 * @return {number}
 */
var robotSim = function (commands, obstacles) {
    let x = 0;
    let y = 0;
    let set = new Set();
    for (let obstacle of obstacles) {
        set.add(obstacle[0] + " " + obstacle[1]);
    }

    let maxDist = 0;
    let currDist = 0;
    let directions = [[0, 1], [1, 0], [0, -1], [-1, 0]];

    for (let command of commands) {
        if (command === -1) {
            currDist = (currDist + 1) % 4;
        } else if (command === -2) {
            currDist = (currDist - 1 + 4) % 4;
        } else {
            for (let i = 1; i <= command; i++) {

                if (!set.has((x + directions[currDist][0]) + " " +
                    (y + directions[currDist][1]))) {

                    x += directions[currDist][0];
                    y += directions[currDist][1];

                } else {
                    break;
                }
            }
            maxDist = Math.max(maxDist, x * x + y * y);

        }
    }

    return maxDist;
};