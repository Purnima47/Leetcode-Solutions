class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch)) {
                continue;
            }

            List<Integer> left = new ArrayList<>();
            List<Integer> right = new ArrayList<>();

            left = diffWaysToCompute(expression.substring(0, i));
            right = diffWaysToCompute(expression.substring(i + 1));

            for (int j = 0; j < left.size(); j++) {
                for (int k = 0; k < right.size(); k++) {
                    if (ch == '+') {
                        res.add(left.get(j) + right.get(k));
                    } else if (ch == '-') {
                        res.add(left.get(j) - right.get(k));
                    } else {
                        res.add(left.get(j) * right.get(k));
                    }
                }
            }

        }

        if (res.isEmpty()) {
            res.add(Integer.parseInt(expression));
        }

        return res;
    }
}