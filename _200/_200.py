class Solution(object):
    def numIslands(self, grid):
        """
        :type grid: List[List[str]]
        :rtype: int
        """
        count = 0
        col = len(grid)
        if col == 0:
            return count
        row = len(grid[0])
        for i in range(col):
            for j in range(row):
                if (grid[i][j] == '1'):
                    self.search(grid,i,j)
                    count += 1
        return count

    def search(self, grid, x, y):
        """
        :type grid:List[List[str]]
        :param grid:
        :param x:
        :param y:
        """
        col = len(grid)
        row = len(grid[0])
        if x < 0 or x >= col or y < 0 or y >= row or grid[x][y] != '1':
            return
        grid[x][y] = '0'
        self.search(grid,x + 1,y)
        self.search(grid,x - 1,y)
        self.search(grid,x,y + 1)
        self.search(grid,x,y - 1)

