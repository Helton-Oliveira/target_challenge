import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        challengeOne();
        challengeTwo();
    }

    public static void challengeOne() {
        System.out.println("Digite um numero: ");
        var init = reader.nextInt();

        if(isFibonnaci(init)) {
            System.out.println("O número " + init + " pertence à sequência de Fibonacci");
        } else {
            System.out.println("O número " + init + " NÃO pertence à sequência de Fibonacci.");
        }

        reader.close();
    }

    public static boolean isFibonnaci(int number) {

        if(number < 0) return false;

        int a = 0, b= 1, temp;

        while(a <= number) {
            if(a == number) {
                return true;
            }
            temp = a;
            a = b;
            b = temp + b;
        }

        return false;
    }


    public static void challengeTwo() {

        System.out.println("Digite a mensagem que desejar: ");
        String message = reader.nextLine();

        if (message.toUpperCase().contains("A")) {
            var letterA = Arrays.stream(message.split("")).filter(l -> l.equalsIgnoreCase("a")).toList();

            var result = letterA.toString().replace("[", "").replace("]", "");

            System.out.println("A ocorrencia da letra 'A' na string é: " + result.length());

        } else {
            System.out.println("Não exixste nenhuma letra 'A' na string.");
        }

    }

}