import java.io.*;

public class J_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[1000001];

        arr[2] = 1;
        arr[3] = 1;
        for (int i = 4; i <= N; i++){
            count = arr[i-1] + 1;
            if (i % 3 == 0){
                count = Math.min(count, arr[i/3] + 1);
            }
            if (i % 2 == 0){
                count = Math.min(count, arr[i/2] + 1);
            }
            arr[i] = count;
        }
        System.out.println(arr[N]);
    }
}
