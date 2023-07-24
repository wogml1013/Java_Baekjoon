import java.util.*;
import java.io.*;

public class J_9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T;
        int N;
        ArrayList<Long> arr = new ArrayList<Long>();
        arr.add(1L);
        arr.add(1L);
        arr.add(1L);
        T = Integer.parseInt(br.readLine());
        int j = 3;
        for (int i = 0; i < T; i++){
            N = Integer.parseInt(br.readLine());
            if (N > 3){
                for (; j < N ; j++){
                    arr.add(arr.get(j-3) + arr.get(j-2));
                }
                System.out.println(arr.get(N-1));
            }
            else {
                System.out.println(arr.get(N-1));
            }
        }
    }
}
