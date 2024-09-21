class Solution:
    def dfs(self, i: int, n: int, res: List[int]):
        if i > n:
            return

        res.append(i)

        for j in range(0, 10):
            self.dfs(i * 10 + j, n, res)

    def lexicalOrder(self, n: int) -> List[int]:
        res = []
        for i in range(1, 10):
            self.dfs(i, n, res)
        
        return res
