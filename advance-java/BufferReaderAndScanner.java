import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;

/**
 * BufferReaderAndScanner
 */
public class BufferReaderAndScanner {

    public static void main(String[] args) throws IOException {
        System.out.println("hyyy");

        // int n = System.in.read();
        // System.out.println(n-48);

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(in);

        // String str = br.readLine();
        // System.out.println(str);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);

    }

}