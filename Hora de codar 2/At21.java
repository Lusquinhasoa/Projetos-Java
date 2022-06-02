import java.util.Scanner;

public class At21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a nota da 1° avaliação: ");
        int nota1 = in.nextInt();

        System.out.println("Digite a nota da 2° avaliação: ");
        int nota2 = in.nextInt();

        System.out.println("Digite a nota da avaliação optativa: ");
        int nota3 = in.nextInt();

        int media = (nota1 + nota2) /2;

        if(nota3<nota1 && nota3<nota2){
            System.out.println(media);
        }
           if(media>=6){
               System.out.println("Sua nota é: " + media + " Parabéns, você foi aprovado!!");
           }
           else{
               if(media<3){
                   System.out.println("Sua nota é: " + media + " Infelizmente você não foi aprovado");
               }
               if(media>=3 && media<6){
                    System.out.println("Em exame");
               }
        in.close();
    }
}
}
