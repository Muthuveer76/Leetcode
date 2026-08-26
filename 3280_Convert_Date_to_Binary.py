class Solution:
    def convertDateToBinary(self, date: str) -> str:
        lst = date.split("-")
        res = []

        for i in range(len(lst)):
            res.append(bin(int(lst[i]))[2:])

        return "-".join(res)