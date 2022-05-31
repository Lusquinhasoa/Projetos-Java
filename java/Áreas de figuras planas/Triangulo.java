import java.util.Scanner;

public class Triangulo{

public static void main(String[]args){

    Scanner in = new Scanner(System.in);
    System.out.println("Informe o valor da base do Triângulo : ");
    int n1 = in.nextInt();

    System.out.println("Informe o valor da altura do Triângulo ");
    int n2 = in.nextInt();
     
    int area = (n1 * n2)/2;
    System.out.println("A área do Triângulo é : " + area);
    in.close();

}
}