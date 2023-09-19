import java.io.InputStream;
import java.util.Scanner;
import java.util.Vector;

public class Main{
    public static void main(String[] args) {       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame el valor maximo");
        int m= scanner.nextInt(); 

        System.out.println("Tu serie es: ");
        int n = 0;
        while(n < m - (m%6)){
            System.out.println(n);
            n = n+6;
        }

        System.out.println(n);

    }
}