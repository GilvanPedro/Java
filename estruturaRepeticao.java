import java.util.Scanner;

public class Main {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int opcao = 0;
      double saldo = 1000.00;
     
      while(opcao != 4){
          System.out.println("----Meu Banco----");
          System.out.println("1- Ver Saldo");
          System.out.println("2- Fazer Depósito");
          System.out.println("3- Fazer um Saque");
          System.out.println("4- Sair");
          opcao = scan.nextInt();
         
          if(opcao == 1){
              System.out.println("O seu saldo é de: R$"+saldo);
          }else if(opcao ==2){
              System.out.print("Insira o valor que deseja depositar:");
              double deposito = scan.nextDouble();
             
              saldo+=deposito;
             
              System.out.println("Saldo atual: R$"+saldo);
          }else if(opcao ==3){
              System.out.println("Insira o valor que deseja sacar:");
              double sacar = scan.nextDouble();
             
              if(sacar <= saldo){
                  System.out.println("Valor sacado com sucesso!");
                 
                  saldo-=sacar;
                 
                  System.out.println("Saldo atual: "+saldo);
              }else{
                  System.out.println("Valor maior do que o saldo!");
              }
          }else if(opcao ==4){
              System.out.println("Obrigado por usar o nosso caixa!!\nSaindo.....");
          }
      }
  }
}
