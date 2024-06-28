var maximumImportance = function (n, roads) {
    let freq = [];
    for (let i = 0; i < n; i++) {
        freq[i] = 0;
    }

    for (const edge of roads) {
        freq[edge[0]]++;
        freq[edge[1]]++;
    }

    freq.sort((a, b) => a - b);

    let imp = 0;
    let k = 1;

    for (const f of freq) {
        imp += (k * f);
        k++;
    }

    return imp;
};