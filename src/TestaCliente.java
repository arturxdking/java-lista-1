public class TestaCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente(378478, 7364,"Fulando", 10f);
        Cliente obj2 = new Cliente(239474, 1111,"Beltrano", 1000f);

        obj1.realizarDeposito(5f);
        obj1.realizarSaque(3f);

        String mensagem = obj1.extrato();
        System.out.println(mensagem);

        obj2.realizarDeposito(9f);
        obj2.realizarSaque(8f);

        mensagem = obj2.extrato();
        System.out.println(mensagem);
    }
}
