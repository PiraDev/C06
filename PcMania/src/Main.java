import java.util.Scanner; // Pra receber a entrada do usuário
import java.util.concurrent.TimeUnit; // Coloquei pra fazer uma graça de espera
import java.util.ArrayList; // Coloquei pra utilizar ArrayList
import java.util.List; // Coliquei pra usar List


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);


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

        // Colocando todos os hardwares básicos em um vetor de compotentesBasicos para passar ao computador
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

        // Criação de todos os computadores
        Computador pcPromocao1 = new Computador("Positivo", 3300, componentesBasicos1, sistema1, musb1);
        Computador pcPromocao2 = new Computador("Acer", 8800, componentesBasicos2, sistema2, musb2);
        Computador pcPromocao3 = new Computador("Vaio", 4800, componentesBasicos3, sistema3, musb3);

        // Criando um vetor "promoções" com os 3 computadores
        Computador[] promocoes = {pcPromocao1, pcPromocao2, pcPromocao3};


        // Criação dos clientes
        Cliente[] clientes = new Cliente[2];
        clientes[0] = new Cliente();
        clientes[0].nome = "Chris Mono Brand";
        clientes[0].cpf = 123456789;
        clientes[1] = new Cliente();
        clientes[1].nome = "Pira";
        clientes[1].cpf = 987654321;

        System.out.println("Seja bem vindo à PCMania!");
        TimeUnit.SECONDS.sleep(2);

        // Enchanced FOR para permitir que vários clientes realizem compras
        for (Cliente cliente : clientes) {
            int totalCompraCliente = 0;
            List<Computador> computadoresAdquiridos = new ArrayList<>(); // Lista temporária para armazenar os computadores adquiridos pelo cliente

            // Exibição do usuário atual
            System.out.println("Cliente: " + cliente.nome);
            System.out.println(" ");
            TimeUnit.SECONDS.sleep(2);

            // While para realização de compras
            int verificaEntrada = -1;
            while (verificaEntrada != 0) {
                // Enchanced FOR para exibição das três promoções
                int promocaoNumero = 1;
                for (Computador promocao : promocoes) {
                    System.out.println("Promoção " + promocaoNumero + ":");
                    promocao.mostraPCConfigs();
                    System.out.println();
                    TimeUnit.MILLISECONDS.sleep(500);
                    promocaoNumero++;
                }
                System.out.println("-----------------------------------");
                System.out.println("Qual promoção deseja comprar? (Digite o número da promoção ou 0 para finalizar sua compra)");

                // Scanner da entrada do usuário
                verificaEntrada = scanner.nextInt();

                // Verificação para saber se foi inserida uma opção válida
                if (verificaEntrada >= 1 && verificaEntrada <= promocoes.length) {
                    System.out.println("Você comprou a promoção " + verificaEntrada + "!");
                    Computador pcAdquirido = promocoes[verificaEntrada - 1]; // -1 pra ir pra posição certa do vetor
                    totalCompraCliente += (int) cliente.calculaTotalCompra(pcAdquirido); // Utiliza o método para somar
                    computadoresAdquiridos.add(pcAdquirido); // Adiciona o PC comprado na list
                    TimeUnit.SECONDS.sleep(1);
                } else if (verificaEntrada != 0) {
                    System.out.println("Opção inválida!");
                }
            }

            // Exibir total da compra individual para o cliente
            System.out.println("-----------------------------------");
            System.out.println("Nome: " + cliente.nome);
            System.out.println("CPF: " + cliente.cpf);
            System.out.println("Total da compra: R$" + totalCompraCliente);
            TimeUnit.SECONDS.sleep(2);

            // Exibir informações dos computadores adquiridos pelo cliente
            System.out.println("Computadores adquiridos:");
            for (Computador pc : computadoresAdquiridos) {
                pc.mostraPCConfigs();
                System.out.println();
            }
            TimeUnit.SECONDS.sleep(5);
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
        }
    }
}
