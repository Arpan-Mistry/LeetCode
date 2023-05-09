//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    
    public static void run(int[][] arr,int n,int i,int j,String move,ArrayList<String> out,int[][] vis){
        if(i==n-1 && j==n-1){
            out.add(move);
            return;
        }
        
        if(i+1<n && vis[i+1][j]==0 && arr[i+1][j]==1){
            vis[i][j]=1;
            run(arr,n,i+1,j,move+'D',out,vis);
            vis[i][j]=0;
        }
        
        if(j - 1 >= 0 && vis[i][j - 1] == 0 && arr[i][j - 1] == 1){
            vis[i][j]=1;
            run(arr,n,i,j-1,move+'L',out,vis);
            vis[i][j]=0;
        }
        
        if(j+1 < n && vis[i][j+1]==0 && arr[i][j+1]==1){
            vis[i][j]=1;
            run(arr,n,i,j+1,move+'R',out,vis);
            vis[i][j]=0;
        }
        
        
        if(i-1 >= 0 && vis[i-1][j] == 0 && arr[i-1][j]==1){
            vis[i][j]=1;
            run(arr,n,i-1,j,move+'U',out,vis);
            vis[i][j]=0;
        }
    }
    
    public static ArrayList<String> findPath(int[][] arr, int n) {
        ArrayList<String> out = new ArrayList<>();
        int[][] vis=new int[n][n];
        for(int x=0;x<vis.length;x++){
            for(int y=0;y<vis.length;y++){
                vis[x][y]=0;
            }
        }
        if (arr[0][0] == 1) run(arr,n,0,0,"",out,vis);
        return out;
    }
}