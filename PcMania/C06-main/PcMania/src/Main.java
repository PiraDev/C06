import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int verificaEntrada = -1;
        int totalCompra = 0;


        // Declaração dos processadores
        HardwareBasico processador1 = new HardwareBasico();
        processador1.nome = "Pentium Core i3";
        processador1.capacidade = 2200;
        HardwareBasico processador2 = new HardwareBasico();
        processador2.nome = "Pentium Core i5";
        processador2.capacidade = 3370;
        HardwareBasico processador3 = new HardwareBasico();
        processador3.nome = "Pentium Core i7";
        processador3.capacidade = 4500;

        // Declaração das memórias ram
        HardwareBasico ram1 = new HardwareBasico();
        ram1.nome = "Memória RAM";
        ram1.capacidade = 8;
        HardwareBasico ram2 = new HardwareBasico();
        ram2.nome = "Memória RAM";
        ram2.capacidade = 16;
        HardwareBasico ram3 = new HardwareBasico();
        ram3.nome = "Memória RAM";
        ram3.capacidade = 32;

        // Declaração dos armazenamentos
        HardwareBasico armazenamento1 = new HardwareBasico();
        armazenamento1.nome = "HD";
        armazenamento1.capacidade = 500;
        HardwareBasico armazenamento2 = new HardwareBasico();
        armazenamento2.nome = "HD";
        armazenamento2.capacidade = 1;
        HardwareBasico armazenamento3 = new HardwareBasico();
        armazenamento3.nome = "HD";
        armazenamento3.capacidade = 2;

        // Declaração dos sistemas operacionais
        SistemaOperacional sistema1 = new SistemaOperacional();
        sistema1.nome = "Linux Ubuntu";
        sistema1.tipo = 32;
        SistemaOperacional sistema2 = new SistemaOperacional();
        sistema2.nome = "Windows 8";
        sistema2.tipo = 64;
        SistemaOperacional sistema3 = new SistemaOperacional();
        sistema3.nome = "Windows 10";
        sistema3.tipo = 64;

        // Declaração das memórias USB
        MemoriaUSB musb1 = new MemoriaUSB();
        musb1.nome = "Pen-drive";
        musb1.capacidade = 16;
        MemoriaUSB musb2 = new MemoriaUSB();
        musb2.nome = "Pen-drive";
        musb2.capacidade = 32;
        MemoriaUSB musb3 = new MemoriaUSB();
        musb3.nome = "HD Externo";
        musb3.capacidade = 1;

        HardwareBasico[] componentesBasicos1 = new HardwareBasico[3];
        componentesBasicos1[0] = processador1;
        componentesBasicos1[1] = ram1;
        componentesBasicos1[2] = armazenamento1;
        HardwareBasico[] componentesBasicos2 = new HardwareBasico[3];
        componentesBasicos2[0] = processador2;
        componentesBasicos2[1] = ram2;
        componentesBasicos2[2] = armazenamento2;
        HardwareBasico[] componentesBasicos3 = new HardwareBasico[3];
        componentesBasicos3[0] = processador3;
        componentesBasicos3[1] = ram3;
        componentesBasicos3[2] = armazenamento3;


        Computador pcPromocao1 = new Computador("Positivo", 3300, componentesBasicos1, sistema1, musb1);
        Computador pcPromocao2 = new Computador("Acer", 8800, componentesBasicos2, sistema2, musb2);
        Computador pcPromocao3 = new Computador("Vaio", 4800, componentesBasicos3, sistema3, musb3);


        Computador[] promocoes = {pcPromocao1, pcPromocao2, pcPromocao3};

        Cliente[] clientes = new Cliente[2];

        Cliente cliente = new Cliente();
        cliente.nome = "Chris Mono Brand";
        cliente.cpf = 123456789;

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Pira";
        cliente2.cpf = 987654321;

        System.out.println("Seja bem vindo à PCMania!");
        TimeUnit.SECONDS.sleep(3);
        while (verificaEntrada != 0) {
            for (int i = 0; i < promocoes.length; i++) {
                System.out.println("Promoção " + (i + 1) + ":");
                promocoes[i].mostraPCConfigs();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }

            System.out.println("-----------------------------------");
            System.out.println("Qual promoção deseja comprar? (Digite o número da promoção ou 0 para sair)");
            verificaEntrada = scanner.nextInt();

            if (verificaEntrada >= 1 && verificaEntrada <= promocoes.length) {
                System.out.println("Você comprou a promoção " + verificaEntrada + "!");
                totalCompra += cliente.calculaTotalCompra(promocoes[verificaEntrada - 1]); // Ajuste: Adicionando o total da compra
                TimeUnit.SECONDS.sleep(1);
            } else if (verificaEntrada != 0) {
                System.out.println("Opção inválida!");
            }
        }

        System.out.println("-----------------------------------");
        System.out.println("Informações do Cliente:");
        System.out.println("Nome: " + cliente.nome);
        System.out.println("CPF: " + cliente.cpf);

        if (totalCompra > 0) {
            System.out.println("Total da compra: R$" + totalCompra);
        } else {
            System.out.println("Nenhum PC foi comprado.");
        }
    }
}