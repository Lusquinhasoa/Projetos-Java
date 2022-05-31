import java.util.Scanner;

public class Ex2{

public static void main(String[]args){
    System.out.println("Qual é o seu nome ?");
    Scanner in = new Scanner(System.in);
    String nome = in.nextLine();
    System.out.println("Olá, " + nome );
}

}