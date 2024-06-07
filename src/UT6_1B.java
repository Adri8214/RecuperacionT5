import java.util.Random;

public class UT6_1B {
    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 1; i <=20 ; i++) {

            int numeroAleatorio = random.nextInt(100);
            System.out.println(numeroAleatorio);

            if(numeroAleatorio == i){
                System.out.println("REPETIDO, INTRODUCE OTRO");
            } else if (numeroAleatorio <= 0 && numeroAleatorio >=100) {
                System.out.println("NO VÁLIDO, INTRODUCE OTRO");
            }

        }
    }
}
