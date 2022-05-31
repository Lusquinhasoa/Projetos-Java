import java.util.Scanner;

public class Ex3{

    public static void main(String[]args){

        System.out.println("Qual é o seu nome ?");
        Scanner in = new Scanner(System.in);
        String nome = in.nextLine();

        System.out.println("Qual a sua idade ?");
        String idade = in.nextLine();
        
        System.out.println("Olá, " + nome + " sua idade é : " + idade);
    }
    }
