import java.io.*;
import java.util.*;

public class J_24498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        long[] tower = new long[N];
        for (int p = 0; p < N; p++){
            tower[p] = Long.parseLong(st.nextToken());
        }
        long adj_min;
        long max = -1;
        for (int i = 1; i < N-1; i++){
            adj_min = tower[i-1] < tower[i+1] ? tower[i-1] : tower[i+1];
            if (max < adj_min + tower[i]){
                max = adj_min + tower[i];
            }
        }
        max = Math.max(max, tower[0]);
        max = Math.max(max, tower[N-1]);
        System.out.println(max);
    }
}
