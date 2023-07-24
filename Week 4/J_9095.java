import java.util.*;
import java.io.*;

public class J_9095 {
    public static void main(String[] args) throws IOException {
        int T, n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        ArrayList<Long> arr;
        for (; T > 0; T--){
            arr = new ArrayList<>();
            arr.add(1L);
            arr.add(2L);
            arr.add(4L);
            n = Integer.parseInt(br.readLine());
            for (int i = 3; i < n; i++){
                arr.add((arr.get(i-1)%1000000009) + (arr.get(i-2)%1000000009) + (arr.get(i-3)%1000000009));
            }
            System.out.println(arr.get(n-1));
        }
    }
}
