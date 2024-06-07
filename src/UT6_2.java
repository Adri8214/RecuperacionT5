import java.util.Scanner;

public class UT6_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una serie de palabras, el programa terminará cuando escribas FIN");

        String palabra;

        do {

            palabra = entrada.nextLine();

        }while(palabra == "FIN");

    }
}
