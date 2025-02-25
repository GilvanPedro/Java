import java.util.Scanner;

public class Main {
 
    public static void main(String[] args){
        int A, B, Qc, X; 
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite o Primeiro Número:");
        A = ent.nextInt();

        System.out.println("Digite o Segundo Número:");
        B = ent.nextInt();
        
        System.out.println("Digite o número da conta que você quer fazer: (1)Adição, (2)Divisão, (3)Subtração ou (4)Multiplicação.");
        Qc = ent.nextInt();
        
        if(Qc >=1 & Qc <=4){
            if (Qc == 1){
            X = A+B;
            
            System.out.println("X = "+X);
        }else if(Qc == 2){
            X = A/3;
            
            System.out.println("X = "+X);
        }else if(Qc == 3){
            X = A-B;
            
            System.out.println("X = "+X);
        }else if(Qc == 4){
            X = A*B;
            
            System.out.println("X = "+X);
        }
    }else{
            System.out.println("Valor Incorreto!");
        }          
    }
 
}
