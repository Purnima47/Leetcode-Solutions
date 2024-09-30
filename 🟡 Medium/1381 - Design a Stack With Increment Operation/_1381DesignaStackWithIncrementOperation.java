class CustomStack {
    int[] arr;
    int top;
    int size;

    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        top = -1;
        size = maxSize;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int x) {
        if (isFull()) {
            return;
        }
        top++;
        arr[top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int val = arr[top];
        top--;
        return val;
    }

    public void increment(int k, int val) {
        if (isEmpty()) {
            return;
        }
        if ((top + 1) < k) {
            for (int i = 0; i < (top + 1); i++) {
                arr[i] = arr[i] + val;
            }
        } else {
            for (int i = 0; i < k; i++) {
                arr[i] = arr[i] + val;
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */