import java.io.*;
import java.util.*;

public class J_13305 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        long min = 1000000001;
        long answer = 0;

        int[] distance = new int[num - 1];
        int[] cost = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int x = 0; x < num - 1; x++) {
            distance[x] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int x = 0; x < num; x++) {
            cost[x] = Integer.parseInt(st.nextToken());
        }

        for (int x = 0; x < num - 1; x++) {
            min = Math.min(min, cost[x]);

            answer += min * distance[x];
        }
        System.out.println(answer);
    }
}