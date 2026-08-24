class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int V = numCourses;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i < V ; i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[V];
        for(int[] edge : prerequisites){
            int u = edge[0];
            int v = edge[1];
            adj.get(v).add(u);
            indegree[u]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < V ; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        int[] ans = new int[V];
        int index = 0;
        while(!q.isEmpty()){
            int u = q.poll();
            ans[index++] = u;
            for(int v : adj.get(u)){
                indegree[v]--;
                if(indegree[v] == 0){
                    q.add(v);
                }
            }
        }
        if(index != V){
            return new int[0];
        }
        return ans;
    }
}