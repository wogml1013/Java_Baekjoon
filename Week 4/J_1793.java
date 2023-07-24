import java.io.*;
import java.math.BigInteger;

 
public class J_1793 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        // 1 ~ 250
        BigInteger[] arr = new BigInteger[251];
         
        arr[0] = new BigInteger("1"); 
        arr[1] = new BigInteger("1");
        arr[2] = new BigInteger("3");
        for(int i=3; i<=250; i++) {
            arr[i] = arr[i-2].multiply(new BigInteger("2"));
            arr[i] = arr[i].add(arr[i-1]);
        }
        String input;
        while((input = br.readLine()) != null){
           int n = Integer.parseInt(input);
           System.out.println(arr[n]);
        }
    }
}