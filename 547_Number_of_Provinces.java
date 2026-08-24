class Solution {
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        int count = 0;
        boolean[] visited = new boolean[V]; 
        for(int i = 0 ; i < V ; i++){
            if(!visited[i]){
                count++;
                dfs(i , isConnected , visited);
            }
        } 
        return count;
    }
    public void dfs(int u, int[][] isConnected, boolean[] visited) {
        visited[u] = true;
        for(int v = 0 ; v < isConnected.length ; v++){
            if(isConnected[u][v] == 1 && !visited[v]){
                dfs(v, isConnected, visited);
            }
        }
    }
    
}