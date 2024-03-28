public class Computador {
    String marca;
    float preco;
    HardwareBasico[] hardware;
    SistemaOperacional sistema;
    MemoriaUSB musb;

    public Computador(String marca, float preco, HardwareBasico[] hardware, SistemaOperacional sistema, MemoriaUSB musb) {
        this.marca = marca;
        this.preco = preco;
        this.hardware = hardware;
        this.sistema = sistema;
        this.musb = musb;
    }

// Método para exibir as configs do PC
    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        // For para iterar entre os três hardwares básicos
        for (HardwareBasico componente : hardware) {
            String output;
            // Lógica para saber qual termo exibir após cada capacidade
            if (componente.nome.equals("HD")) {
                output = componente.capacidade == 500 ? "500GB de " + componente.nome :
                        componente.capacidade == 1 || componente.capacidade == 2 ? Math.round(componente.capacidade) + "TB de " + componente.nome :
                                Math.round(componente.capacidade) + "GB de " + componente.nome;
            } else if (componente.nome.equals("Memória RAM")) {
                output = Math.round(componente.capacidade) + " GB de " + componente.nome;
            } else {
                output = componente.nome + " (" + Math.round(componente.capacidade) + " MHz)";
            }
            System.out.println(output);
        }
        System.out.println("Sistema Operacional: " + sistema.nome + " (" + sistema.tipo + " bits)");
        System.out.println("Acompanha " + musb.nome + " de " + musb.capacidade + (musb.capacidade == 1 ? " TB" : " GB"));
    }


// Não consegui descobrir pra que eu teria que usar esse método =/
    public void addMemoriaUSB(MemoriaUSB musb) {
        this.musb = musb;
    }
}

