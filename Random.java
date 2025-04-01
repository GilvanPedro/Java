import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int max = 20;
        int randomNumber = rand.nextInt(max);  // Gera um número aleatório de 0 a (max - 1)
        int numero = randomNumber +1;
        System.out.println("Número aleatório: " + numero);
    }
}
