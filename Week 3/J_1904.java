import java.io.*;
import java.util.*;

public class J_1904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        
        if( n > 1) {
			for(int i = 2; i <= n; i++) {
				arr[i]=(arr[i-1] + arr[i-2])% 15746;
			}
		}
        System.out.println(arr[n]);
    }
}