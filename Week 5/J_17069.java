import java.io.*;
import java.util.*;

public class J_17069 {
    static long[][][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] home = new int[N+1][N+1];
        dp = new long [N+1][N+1][3];
    
        StringTokenizer st;
            
        for (int z = 1; z < N+1; z++){
            st = new StringTokenizer(br.readLine());
            for (int y = 1; y < N+1; y++){
                home[z][y] = Integer.parseInt(st.nextToken());
            }
        }
        
        dp[1][2][0] = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 3; j <= N; j++) {
                if(home[i][j]==1) continue;

                dp[i][j][0] = dp[i][j - 1][0] + dp[i][j - 1][2];

                if(i==1) continue; 

                dp[i][j][1] = dp[i - 1][j][1] + dp[i - 1][j][2];

                if(home[i-1][j]==1 || home[i][j-1]==1) continue;

                dp[i][j][2] = dp[i-1][j-1][0] + dp[i-1][j-1][1] + dp[i-1][j-1][2];
            }
        }
        // for (int i = 1; i < N+1; i++){
        //     for (int j = 2; j < N+1; j++){
        //         if (dp[i][j][0] != 0 && j != N){
        //             for (int a = 0; a < dp[i][j][0]; a++){
        //                 if (home[i][j+1] == 0){
        //                     dp[i][j+1][0]++;
        //                     if (i != N && home[i+1][j+1] == 0 && home[i+1][j] == 0){
        //                         dp[i+1][j+1][2]++;
        //                     }
        //                 }
        //             }
        //         }
        //         if (dp[i][j][1] != 0 && i != N){
        //             for (int b = 0; b < dp[i][j][1]; b++){
        //                 if (home[i+1][j] == 0){
        //                     dp[i+1][j][1]++;
        //                     if (j != N && home[i+1][j+1] == 0 && home[i][j+1] == 0){
        //                         dp[i+1][j+1][2]++;
        //                     }
        //                 }
        //             }
        //         }
        //         if (dp[i][j][2] != 0){
        //             for (int c = 0; c < dp[i][j][2]; c++){
        //                 boolean z = true;
        //                 if (j != N && home[i][j+1] == 0){
        //                     dp[i][j+1][0]++;
        //                 }
        //                 else{
        //                     z = false;
        //                 }
        //                 if (i != N && home[i+1][j] == 0){
        //                     dp[i+1][j][1]++;
        //                 } 
        //                 else {
        //                     z = false;
        //                 }
        //                 if (z){
        //                     dp[i+1][j+1][2]++;
        //                 }          
        //             }          
        //         }
        //     }
        // }
        long q = dp[N][N][0] + dp[N][N][1] + dp[N][N][2];
        System.out.println(q);
    }
}
