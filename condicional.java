import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int gotas;
        
        System.out.println("Qual o tipo de Paciente: ");
        System.out.println("1- Bebê\n2- Adolescente\n3- Adulto\n4- Idoso");
        int paciente = scan.nextInt();
        
        switch(paciente){
            case 1: gotas = (int) (600/400.0 * 14);
            System.out.printf("Dosagem para um Bebê é:%d ml\n", gotas);
            break;
            
            case 2: gotas = (int) (1600/400.0 * 14);
            System.out.printf("Dosagem para um Adolescente é:%d ml\n", gotas);
            break;
            
            case 3: gotas = (int) (4600/400.0 * 14);
            System.out.printf("Dosagem para um Adulto é:%d ml\n", gotas);
            break;
            
            case 4: gotas = (int) (2450/400.0 * 14);
            System.out.printf("Dosagem para um Idoso é:%d ml\n", gotas);
            break;
        }
    }
}
