int max(int a, int b) {
    if (a > b) {
        return a;
    } 

    return b;
}

double averageWaitingTime(int** customers, int customersSize,
                          int* customersColSize) {
    double ans = 0;
    int arrivalTime = 0;

    for (int i = 0; i < customersSize; i++) {
        arrivalTime = max(customers[i][0], arrivalTime) + customers[i][1];
        ans += arrivalTime - customers[i][0];
    }

    return ans / customersSize;
}