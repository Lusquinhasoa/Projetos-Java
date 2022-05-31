import java.util.Scanner;

public class Trapezio{

public static void main(String[]args){

    Scanner in = new Scanner(System.in);
    System.out.println("Informe o valor da base maior do Trapézio : ");
    int n1 = in.nextInt();

    System.out.println("Informe o valor da base menor do Trapézio ");
    int n2 = in.nextInt();

    System.out.println("Informe o valor da altura do Trapézio ");
    int n3 = in.nextInt();
     
    int area = ((n1 * n2)*n3)/2;
    System.out.println("A área do losango é : " + area);
    in.close();

}
}