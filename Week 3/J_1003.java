import java.util.*;
import java.io.*;

public class J_1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T; 
        int N;
        T = Integer.parseInt(br.readLine());
        ArrayList<Integer> fib_arr;
        

        for (int i = 0; i < T; i++){
            N = Integer.parseInt(br.readLine());
            int k = 0;
            fib_arr = new ArrayList<>();
            fib_arr.add(1);
            fib_arr.add(0);
            for (int j = 0; j < N; j++){
                fib_arr.add(fib_arr.get(j) + fib_arr.get(j+1));
                k++;
            }
            System.out.println(fib_arr.get(k)+" "+fib_arr.get(k+1));
        }
    }
}
