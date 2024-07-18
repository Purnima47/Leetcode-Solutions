var averageWaitingTime = function (customers) {
    let ans = 0;
    let n = customers.length;
    let arrivalTime = 0;

    for (let i = 0; i < n; i++) {
        arrivalTime = Math.max(customers[i][0], arrivalTime) + customers[i][1];
        ans += arrivalTime - customers[i][0];
    }

    return ans / n;
};