import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int verificaSaida;

        HardwareBasico hardware1 = new HardwareBasico();
        hardware1.nome = "Pentium Core i3";
        hardware1.capacidade = 2200;
        SistemaOperacional sistema1 = new SistemaOperacional();
        sistema1.nome = "Linux Ubuntu";
        sistema1.tipo = 32;
        MemoriaUSB musb1 = new MemoriaUSB();
        musb1.nome = "Pen-drive";
        musb1.capacidade = 16;
        Computador pcPromocao1 = new Computador("Positivo", 3300, hardware1, sistema1, musb1);

        HardwareBasico hardware2 = new HardwareBasico();
        hardware2.nome = "Pentium Core i5";
        hardware2.capacidade = 3370;
        SistemaOperacional sistema2 = new SistemaOperacional();
        sistema2.nome = "Windows 8";
        sistema2.tipo = 64;
        MemoriaUSB musb2 = new MemoriaUSB();
        musb2.nome = "Pen-drive";
        musb2.capacidade = 32;
        Computador pcPromocao2 = new Computador("Acer", 8800, hardware2, sistema2, musb2);

        HardwareBasico hardware3 = new HardwareBasico();
        hardware3.nome = "Pentium Core i7";
        hardware3.capacidade = 4500;
        SistemaOperacional sistema3 = new SistemaOperacional();
        sistema3.nome = "Windows 10";
        sistema3.tipo = 64;
        MemoriaUSB musb3 = new MemoriaUSB();
        musb3.nome = "HD Externo";
        musb3.capacidade = 1;
        Computador pcPromocao3 = new Computador("Vaio", 3300, hardware3, sistema3, musb3);



        do{
        System.out.println("Promoção 1:");
        pcPromocao1.mostraPCConfigs();
        System.out.println();

        System.out.println("Promoção 2:");
        pcPromocao2.mostraPCConfigs();
        System.out.println();

        System.out.println("Promoção 3:");
        pcPromocao3.mostraPCConfigs();
        System.out.println();

            System.out.println("---------------------");
            System.out.println("Qual promoção deseja comprar?");
            verificaSaida = scanner.nextInt();
        } while(verificaSaida != 0);

    }
}