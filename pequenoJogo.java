import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int ac1, ac2, barba;
        
        System.out.print("Um heroi acorda em sua cama, espreme os olhos e pensa no que pode fazer.\n (1)- Olhar ao redor\n (2)- Sair do quarto");
        ac1 = scan.nextInt();
        
        switch(ac1){
            case 1:
                if(ac1 == 1){
                    System.out.print("Você olha ao redor no seu quarto, reconhecendo as suas roupas sujas jogadas no chão, e, com o seu olhar capturado pelo espelho, você observa o seu rosto, com uma barba mal feita e com fiapos maiores que outros.\n Desanimado com a visão que você tem, você pensa se deferia fazer a barba antes de sair do quarto. \n (1)- Sim \n (2)- Não");
                    barba = scan.nextInt();
                    switch(barba){
                        case 1:
                            if(barba == 1){
                                System.out.print("Incomodado com o seu visual, você pensa que seria bom estar um pouco mais apresentavel para as pessoas, então vai em direção ao banheiro para raspar o pouco de barba que você tem\n");
                                System.out.print("Você sai do seu quarto, se deparando com o corredor da sua casa repleto de sacos de lixo, com um odor que irrita o seu nariz");
                            }
                            break;
                        case 2:
                            if(barba == 2){
                                System.out.print("Não se importando com como as pessoas vão olhar para você, então decide continuar do geito como está\n");
                                System.out.print("Você sai do seu quarto, se deparando com o corredor da sua casa repleto de sacos de lixo, com um odor que irrita o seu nariz");
                            }
                            break;
                    }
                }
                break;
                
            case 2:
                if(ac1 ==2){
                    System.out.print("Você sai do seu quarto, se deparando com o corredor da sua casa repleto de sacos de lixo, com um odor que irrita o seu nariz");
                }
                break;
        }
        System.out.println("Ao atravessas todos os comodos, você se depara com a porta da frente da sua casa, mas, com uma sensação estranha, você exita se deve ou não sair de casa para o trabalho \n O que vocÊ faz? \n (1)- Sair de casa \n (2)- Ficar em casa \n (3)- Trocar de roupa\n");
        ac2 = scan.nextInt();
        
        switch(ac2){
            case 1:
                if(ac2 == 1){
                    System.out.println("Abrindo a porta, você é momentaneamente cegado pela forte luz do Sol, e, recuperando a visão, se direciona para a porta de casa, pensando que esse sentimento ruim deveria ter sido só uma forma que do seu cérebro de te fazer matar trabalho\nMas, antes que podesse se encaminhar para o ponto de ônibus ao lado da sua casa, uma alta buzina foi ouvida, e, olhando para o lado, a última coisa vista foi a frente de um caminhão vindo na sua direção!");
                }
                break;
            case 2:
                if(ac2 == 2){
                    System.out.println("Sem vontade de ir trabalhar, e com um mal presentimento, você resolve continuar em casa, pensando em inventar uma desculpa caso o seu chefe lique para você");
                }
                break;
            case 3:
                if(ac2 == 3){
                    System.out.println("Quase abrindo a porta da frente, você se lembra que não trocou de roupa, então decide voltar e se trocar para algo melhor\n Entretanto, no caminho para o seu quarto, você escorrega em plásticos que estavam jogados no chão, fazendo a sua cabeça bater com força no solo\n E, enquanto a sua vsão vai esvaindo, a última coisa que você ouve é um telefone tocando, provavelmente sendo o seu chefe, querendo saber o porque do atraso");
                }
        }
    }
}
