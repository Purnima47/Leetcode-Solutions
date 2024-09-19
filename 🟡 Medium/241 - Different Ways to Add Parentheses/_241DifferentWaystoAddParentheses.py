class Solution:
    def diffWaysToCompute(self, expression: str) -> List[int]:
        res = []
        for i, ch in enumerate(expression):
            if ch.isdigit():
                continue

            left = self.diffWaysToCompute(expression[0:i])
            right = self.diffWaysToCompute(expression[i + 1 :])

            for j in left:
                for k in right:

                    if ch == "+":
                        res.append(j + k)
                    elif ch == "-":
                        res.append(j - k)
                    else:
                        res.append(j * k)

        if len(res) == 0:
            res.append(int(expression))

        return res
