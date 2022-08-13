class Solution:

    def climbStairs(self, n: int) -> int:
        array = [0] * (n + 1)
        r=3
        array[1] = 1 
        array[2] = 2
        while r <= n:
            array[r] = array[r-1] + array[r-2]
            r = r + 1
        return array[n]

    def __init__(self) -> None:
        # Memoization
        self.cache = {}

    def climbStairsR(self, n: int) -> int:
        if n in self.cache:
          return self.cache[n]
        # Base case
        if n == 1:
            return 1
        if n == 2:
            return 2
        # Recursion
        new_value = self.climbStairsR(n-1) + self.climbStairsR(n-2)
        self.cache[n] = new_value
        return new_value
