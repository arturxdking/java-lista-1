public class TestaRio {
    public static void main(String[] args) {
        Rio rio = new Rio();
        rio.nivel = 10;
        rio.nome = "Solimões";
        rio.poluido = false;
        rio.chover(30f);
        System.out.println(rio.mostra());

        if (rio.ensolarar(23f) == false) {
            System.out.println("O Rio " + rio.nome + " secou!");
        }
        System.out.println(rio.mostra());

        Rio riob = new Rio("Negro", 2, true);
        riob.chover(34f);
        System.out.println(riob.mostra());

        if (riob.ensolarar(70f) == false) {
            System.out.println("O Rio " + riob.nome + " secou!");
        }
        riob.poluido = true;
        System.out.println(riob.mostra());
    }
}
