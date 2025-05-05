import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int vidaRei, opc, vidaHeroi, soco, chute;
        String nome;
        vidaRei = 100;
        vidaHeroi = 120;
        soco = 21;
        chute = 19;
        
        System.out.println("Era uma vez um grande heroi, que treinou durante toda a sua vida para derrotar o Rei Demônio\n Todos os seus anos de treinamento valeram a pena, fornecendo a ele uma batalha acirrada contra aquele que estava fazendo mal ao mundo!\n Entretanto, no final de sua luta, com o Demônio deitado sobre seus pés, o heroi começou a se questionar sobre o que faria agora, já que o seu único objetivo de vida foi cumprido.\n Perdido em seus pensamentos, começou a se mover de volta em direção à capital real, para informar a todos sobre a queda do Rei Demônio.\n Chegando na capital, todos os soldados o saudavam, juntamente de toda a população que vibrava de felicidade com a notícia.\nChegando no portão do castelo, o heroi se surpreendeu com o próprio Rei indo o saudar, para agradescer todo o seu trabalho duro, o convidando para um jantar inesquecível.\nIndo para os aposentos, o heroi foi vestido com roupas luxuosas, que exbaltavam beleza e poder.\nChegando na mesa de jantar, um esbelto banquete o estava esperando, com uma mesa que ia de uma ponta a outra do cômodo. Era impossível imaginar que só os dois conseguiriam comer tudo aquilo!\nAlegremente, o Rei dizia para o heroi se deliciar até que estivesse satisfeito.\nCom um silêncio meio desconcertante, o heroi iniciou a comer, mas estranhou o fato do Rei não ter tocado em nenhum dos pratos, quando, percebendo um malicioso sorriso surgindo em seu rosto, rapidamente jogou tudo ao seu alcance no chão, mas já era tarde de mais, o corpo do heroi já não respondia como deveria, ele estava aos poucos sentindo um grande formigamento\n O Rei aos poucos se aproximava, com um sorriso ainda mais malicioso do que antes, mostrando que, escondido em sua cintura, havia uma adaga curta, que, ao ser desembanhada, reluzia com os inúmeros detalhes em ouro\nSem conseguir se mover corretamente, o heroi cai no chão desolado, mas, apesar de tudo, ainda tenta descobrir o motivo de tudo isso estar acontecendo.\nContente, o Rei diz:\n '-Agora que o Rei Demônio foi morto, a única coisa que pode se tornar um problema para a humanidade é você, meu querido Heroi. Então trate de morrer por todos nós!!!!'\nO Rei disferiu um golpe em suas costas. A dor era tanta que você não conseguia suportar.\nEle parecia estar se divertindo com todo o seu sofrimento, mas, independente de tudo, você não queria que esse fose o seu fim.\nVocê não viveu nada ainda, toda a sua vida foi dedicada a treinar para salvar a humanidade, e agora você tem que morrer por ela?\nVAI SER FUDER TUDO ISSO!!! Eu ainda não vivenciei nada, não decidi o que fazer depois.\nAté parece que eu vou me deixar ser morto por esse Rei de MERDA! nem que eu mesmo tenha que destruir toda a humanidade, eu vou viver do geito que eu quiser!!!!\nCom essa motivação, você começa aos poucos a se levantar, decidido a matar todos que tentarem te prejudicar.\nO rei começa a ficar assustado com o que pode acontecer, e é ai então eue você aproveita a oportunidade para ataca-lo:");
        while(true){
            int max = 20;
            int randomNumber = rand.nextInt(max);
            int numeroRand = randomNumber +1;
        
            if(vidaRei > 0){
                if(vidaHeroi <= 0){
                System.out.println("Você morreu pelas mão do Rei de merda~!");
                System.exit(0);
                }
                System.out.println("|------Opções------|------Descrição------|");
                System.out.println("(1)- Soco----------|-Você disfere um soco que causa 21 de dano");
                System.out.println("(2)- Chute---------|-Você disfere um chute que causa 19 de dano\n");
                opc = scanner.nextInt();
                if(opc == 1){
                    System.out.println("Você disferiu um soco na cara de merda do Rei!");
                    vidaRei = vidaRei - soco;
                    System.out.println("\n");
                }else if(opc ==2){
                    System.out.println("Você disferiu um chute no estômago do Rei de merda!");
                    vidaRei = vidaRei - chute;
                    System.out.println("\n");
                }
                
                System.out.println("Com o seu último ataque sendo feito, o rei usa as ultimas forças para te ataca de volta!\nVocê acaba recebendo: "+numeroRand+" de dano, e o Rei cai sobre os seus pés!");
                vidaHeroi = vidaHeroi-numeroRand;
                System.out.println("Vida atual: "+vidaHeroi);
            }else{
                break;
            }
        }
            
            System.out.println("Com todas as suas forças, você vê o maldito rei caindo no chão, mas está satisfeito, depois de tudo que ele te fez ele vai simplesmente morrer dessa forma??? Você continua socando a cara dele até o desfigurar completamente!!\nRecuperando o fólego e a sanidade, você brevemente surta com o que acabou de acontecer, mas, diferente do que você imaginou, tudo o que consegue sentir é um prazer imensurável!\nDecidido a viver da forma como você quer, você pensa em usar um outro nome. Pensando bastante, você finalmente chega na conclusão de que vai se chamar:");
            nome = scanner.nextLine();
            System.out.println(nome+", sim, é assim que você vai se chamar agora!!\nRasgando as roupas luxuosas do Rei, você faz uma espécie de capuz improvisado, utilizando ele para fujir por sima dos enormes muros do castelo.\nPensando em aonde você pode tentar um recomeço, você acha que por enquanto seria melhor se esconder no reino demoníaco, já que a notícia de que o Rei morreu se espalharia rápido, e o Heroi estaria desaparecido, então as pessoas ligariam os pontos.\nPartindo em direção novamente ao reino dos demônios, a única coisa que passa pela sua mente é o que você pode comer para o jantar, já que você não conseguiu comer nada no banquete, e estava faminto depois de lutar..\nCom isso, você tenta decidir o que fazer:");
            System.out.println("|------Opções------|");
            System.out.println("(1)- Tentar caçar algo");
            System.out.println("(2)- Buscar abrigo e não comer");
            System.out.println("(3)- Proucurar por frutas");
            System.out.println("(5)- Seguir em frente");
            opc = scanner.nextInt();
            if(opc == 1){
                int max = 20;
                int randomNumber = rand.nextInt(max);
                int d20 = randomNumber +1;
                
                System.out.println("Sem conseguir resistir a barriga roncando, você tenta encontrar algum animal para saciar a sua fome. Buscando entre as árvores, você não consegue ver nada por conta da escuridão, mas, se concentrando, tem certeza que ouviu um barulho entre as árvores.\nUtilizando um galho como arma improvisada, você decide tentar acertar o que quer que seja que se moveu.\n\nVocê rolou um dado e o resultado foi de: "+d20);
                if(d20 >= 10){
                    System.out.println("Se consentrando muito, você começa a ouvir bem baixo um barulho que parece com algo se rastejando, pretarando a madeira, você se joga em direção ao barulho e tenta acertar o animal.\nOuvindo um sibilar, você descobre que conseguir capturar uma cobra, e, rapidamente, corta a sua cabeça para não correr o risco de ser picado");
                }else if(d20 < 10){
                    System.out.println("Você pula para cima de onde você ouviu um barulho, conseguindo encontrar um animal, pelo formato, você supos que era uma cobra. Enquanto voc6e estava perdido em seus pensamentos, você acabou deixando a cabeça dela se soltar da sua mão, com ela te picando.\nVocê acabou recebendo 12 de dano, mas, felizmente, você já tem resistência a veneno o suficiente para lidar com isso.\nVida: "+(vidaHeroi-12));
                    if(vidaHeroi <= 0){
                        System.out.println("Com essa picada, você começa a se sentir muito mal, e, fraco por conta da batalha, acaba caindo no chão, perdendo aos poucos cada um dos seus sentidos, com você se questionando por que mereceu tudo isso que está acontecendo!\nVOCÊ MORREU!");
                        System.exit(0);
                    }
                }
            }else if(opc == 2){
                
            }
        
    }
}
