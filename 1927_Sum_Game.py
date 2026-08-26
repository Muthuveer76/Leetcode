class Solution:
    def sumGame(self, num: str) -> bool:
        mid = len(num) // 2

        ls = sum(int(c) for c in num[:mid] if c != '?')
        rs = sum(int(c) for c in num[mid:] if c != '?')

        lq = num[:mid].count('?')
        rq = num[mid:].count('?')

        if (lq + rq) % 2:
            return True

        return ls - rs != 9 * (rq - lq) // 2