public class Computador {
    String marca;
    float preco;
    HardwareBasico hardware;
    SistemaOperacional sistema;
    MemoriaUSB musb;

    public Computador(String marca, float preco, HardwareBasico hardware, SistemaOperacional sistema, MemoriaUSB musb) {
        this.marca = marca;
        this.preco = preco;
        this.hardware = hardware;
        this.sistema = sistema;
        this.musb = musb;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Processador: " + hardware.nome);
        System.out.println("Capacidade do Processador: " + hardware.capacidade + " Mhz");
        System.out.println("Memória RAM: " + hardware.capacidade + " GB");
        System.out.println("Sistema Operacional: " + sistema.nome + " (" + sistema.tipo + " bits)");
        System.out.print("Acompanha: " + musb.nome + " de " + musb.capacidade);
        if (musb.capacidade == 1)
            System.out.println(" TB");
        else
            System.out.println(" GB");
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.musb = musb;
    }
}
