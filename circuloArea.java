import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        double v1, R;
        Scanner ent = new Scanner(System.in);
        
        v1 = ent.nextDouble();  
        R = (3.14159*v1*v1);

        System.out.printf("A=%.4f\n", R);
    }
}
