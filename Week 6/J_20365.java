import java.util.*;
import java.io.*;

public class J_20365 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String color = br.readLine();
        int B_count = 0;
        int R_count = 0;
        int B_group = 0;
        int R_group = 0;
        for (int i = 0; i < N; i++){
            if (color.charAt(i) == 'B'){
                B_count++;
                if (R_count >0){
                    R_group++;
                    R_count = 0;
                }
            }
            else {
                R_count++;
                if (B_count > 0){
                    B_group++;
                    B_count = 0;
                }

            }
        }
        if (color.charAt(N-1) == 'B'){
            if (R_count > 0){
                R_group++;
            }
            B_group++;
        }
        else {
            if (B_count > 0){
                B_group++;
            }
            R_group++; 
        }

        int min = Math.min(B_group, R_group);
        System.out.println(min + 1);
    }
}
