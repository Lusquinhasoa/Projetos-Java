import java.util.Scanner;

public class At3{

public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    System.out.println("Informe um valor: ");
    int n1 = in.nextInt();

    System.out.println("Informe um segundo valor: ");
    int n2 = in.nextInt();

    System.out.println("Informe um terceiro valor: ");
    int n3 = in.nextInt();

    if(n1>n2 && n1>n3){
    System.out.println("O número " + n1 + " é o maior"); 
    }
    else if(n2>n1 && n2>n3){
    System.out.println("O número " + n2 + " é o maior");   
    }
    else{
        System.out.println("O número " + n3 + " é o maior");
    }
    in.close();
}
}