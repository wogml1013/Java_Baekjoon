import java.io.*;
import java.util.*;

public class J_18230 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N, A, B;
        N = Integer.parseInt(st.nextToken());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        
        Integer[] arrA = new Integer[A];
        Integer[] arrB = new Integer[B];

        st = new StringTokenizer(br.readLine());
        for (int a = 0; a < A; a++){
            arrA[a] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int b = 0; b < B; b++){
            arrB[b] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arrA, Collections.reverseOrder());
        Arrays.sort(arrB, Collections.reverseOrder());
        int res = 0;
        int a = 0; 
        int b = 0;
        if (N % 2 == 1){ // 짝수면
            res += arrA[a++];
            N -= 1;
        }
        while (N > 0){             
            if (a < A-1 && b < B){
                if (arrA[a] + arrA[a+1] >= arrB[b]){
                    res += arrA[a++];
                    res += arrA[a++];
                    N -= 2; 
                }
                else{
                    res += arrB[b++];
                    N -= 2;
                }
            }
            else if (b == B){
                res += arrA[a++];
                res += arrA[a++];
                N -= 2;
            }
            else{
                res += arrB[b++];
                N -= 2;
            }
        } 
        System.out.println(res);
    }
}
