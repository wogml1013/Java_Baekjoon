import java.util.*;
import java.io.*;

public class J_20363 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long X, Y;
        long answer;
        X = Long.parseLong(st.nextToken());
        Y = Long.parseLong(st.nextToken());
        long max = X > Y ? X : Y;
        long min = X < Y ? X : Y;

        answer = max + min;
        
        min /= 10;
        answer += min;
        System.out.println(answer);
    }   
}
