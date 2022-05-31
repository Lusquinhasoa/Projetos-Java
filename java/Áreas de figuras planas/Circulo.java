import java.util.Scanner;

public class Circulo{

public static void main(String[]args){

    Scanner in = new Scanner(System.in);
    System.out.println("Informe o raio do Círculo : ");
    int n1 = in.nextInt();
    
    System.out.println("A área do Círculo é : " + (n1*n1)*3.14);
    in.close();

}
}