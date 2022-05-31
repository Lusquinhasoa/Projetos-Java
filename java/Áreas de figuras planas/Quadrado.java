import java.util.Scanner;

public class Quadrado{

public static void main(String[]args){

    Scanner in = new Scanner(System.in);
    System.out.println("Informe o valor do 1° lado do Quadrado : ");
    int n1 = in.nextInt();

    System.out.println("Informe o valor do 2° lado do Quadrado : ");
    int n2 = in.nextInt();
     
    int area = (n1 * n2);
    System.out.println("A área do quadrado é : " + area +"²");
    in.close();

}
}