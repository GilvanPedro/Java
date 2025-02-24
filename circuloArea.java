import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        var n = 3.14159;
        var v1 = 2.00;
        var v2 = 100.64;
        var v3 = 150.00;

        System.out.println("A = "+ (n*v1*v1));
        System.out.println("B = "+ (n*v2*v2));
        System.out.println("C = "+ (n*v3*v3));
    }
 
}
