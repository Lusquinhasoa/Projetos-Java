import java.util.Scanner;

public class Losango{

public static void main(String[]args){

    Scanner in = new Scanner(System.in);
    System.out.println("Informe o valor da diagonal maior do Losango : ");
    int n1 = in.nextInt();

    System.out.println("Informe o valor da diagonal menor do Losango ");
    int n2 = in.nextInt();
     
    int area = (n1 * n2)/2;
    System.out.println("A área do losango é : " + area);
    in.close();

}
}