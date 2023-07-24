import java.io.*;
import java.util.*;
public class J_2217 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] w = new int[N];
        for (int i = 0; i < N; i++){
            w[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(w);

        int maxweight = -1;
        int weight;
        
        for (int n = 1; n < N+1; n++){
            weight = w[N-n] * n; 
            if (maxweight < weight){
                maxweight = weight;
            }
        }   
        System.out.println(maxweight);
    }
}
