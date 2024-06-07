import java.util.Scanner;

public class UT6_1A {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Introduce 10 números comprendidos entre el 1 y el 100");

        for (int i = 1; i <= 10 ; i++) {
            if(i >=1 && i <= 100){
                int numero = entrada.nextInt();
            }else{
                System.out.println("ERROR");
            }
        }
    }
}
