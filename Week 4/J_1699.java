import java.io.*;
import java.util.*;
public class J_1669 {
    public static void main(String[] args) throws IOException{
        int N;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        
        for (int i = 1; i <= N; i++) {
            arr[i] = i;
            for (int j = 1; j * j <= i; j++) {
                if (arr[i] > arr[i - j * j] + 1) {
                    arr[i] = arr[i - j * j] + 1;
                }
            }
            
        }
        System.out.println(arr[N]);
    }
}
