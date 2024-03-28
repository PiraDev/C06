public class Cliente {
    String nome;
    long cpf;

    public float calculaTotalCompra(Computador computador) {
        float totalCompra = 0;
        totalCompra += computador.preco;
        return totalCompra;

    }
}


