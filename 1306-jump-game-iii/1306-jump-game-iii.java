class Solution {
    public boolean canReach(int[] arr, int start) {

        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        visited[start] = true;
        q.offer(start);
        while(!q.isEmpty())
        {
            int i = q.poll();
            if(arr[i]==0)
            return true;
            int forward = i+arr[i];
            int backward = i-arr[i];
            if(forward < n && !visited[forward])
            {
                visited[forward] = true;
                q.add(forward);
            }
            if(backward>=0 && !visited[backward])
            {
                visited[backward] = true;
                q.add(backward);
            }
        }
        return false;
    }
}