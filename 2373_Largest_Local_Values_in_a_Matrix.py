class Solution:
    def largestLocal(self, grid: List[List[int]]) -> List[List[int]]:
        n=len(grid)
        arr=[]
        for i in range(n-2):
            lst=[]
            for j in range(n-2):
                ans=0
                for x in range(i,i+3):
                    for y in range(j,j+3):
                        ans=max(ans,grid[x][y])
                lst.append(ans)
            arr.append(lst)
        return arr