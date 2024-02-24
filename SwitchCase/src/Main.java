import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner numeroAlunos = new Scanner(System.in);

        int alunos;
        alunos = numeroAlunos.nextInt();
        switch(alunos){

            case 10:
            case 20:
                System.out.println("Sala I-16");
                break;
            case 30:
                System.out.println("Sala I-22");
                break;

            default:
                System.out.println("Valor incorreto");


        }
    }
}