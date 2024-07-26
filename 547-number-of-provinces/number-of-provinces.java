class Solution {
    private void dfs(int node,int[] vis,ArrayList<ArrayList<Integer>>adjList)
    {
        vis[node]=1;
        for(Integer it:adjList.get(node))
        {
            if(vis[it]!=1)
                dfs(it,vis,adjList);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int V= isConnected.length;
        ArrayList<ArrayList<Integer>>adjList= new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++)
        {
            adjList.add(new ArrayList<Integer>());
        }
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++)
            {
                if(isConnected[i][j]==1)
                {
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }
        int count=0;
        int [] vis= new int[V];
        for(int i=0;i<V;i++)
        {
            if(vis[i]!=1)
            {
                count++;
                dfs(i,vis,adjList);
            }
        }
        return count;   
    }
}