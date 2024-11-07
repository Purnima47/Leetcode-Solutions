bool isCircularSentence(char* sentence) {
    int n = strlen(sentence);

    if (sentence[0] != sentence[n - 1]) {
        return false;
    }

    for (int i = 1; i < n - 1; i++) {
        if (sentence[i] == ' ') {
            if (sentence[i - 1] != sentence[i + 1]) {
                return false;
            }
        }
    }

    return true;
}