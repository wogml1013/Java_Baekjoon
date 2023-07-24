import java.util.*;
import java.io.*;

public class J_9440 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = -1;
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            if (N == 0) return;
            int[] arr = new int[N];
            int zero = 0;
            for (int i = 0; i < N; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                if (arr[i] == 0){
                    zero++;
                }
            }
            Arrays.sort(arr);
            ArrayList<Integer> a1 = new ArrayList<>();
            ArrayList<Integer> a2 = new ArrayList<>();
            
            if (zero != 0){
                arr[0] = arr[zero];
                arr[zero] = 0;
                arr[1] = arr[zero+1];
                arr[zero+1] = 0;
            }
            
            for(int j = 0; j < N; j++){
                if (j % 2 == 0){
                    a1.add(arr[j]);
                }
                else {
                    a2.add(arr[j]);
                }
            }
            int Num1 = 0, Num2 = 0;
            for (int a = 0; a < a1.size(); a++){
                Num1 += Math.pow(10, a1.size() - 1 - a) * a1.get(a);
            }
            for (int b = 0; b < a2.size(); b++){
                Num2 += Math.pow(10, a2.size() - 1 - b) * a2.get(b);
            }
            System.out.println(Num1 + Num2);
        }
    }   
}
