package exe4;

public class TestaRio {
    public static void main(String[] args) {

        Rio obj1 = new Rio("Soliões",10f, false);

        obj1.chover(30f);
        System.out.println(obj1.mostra());

        if (obj1.ensolarar(23f) == false) {
            System.out.println("O Rio " + obj1.nome + " secou!");
        }
        System.out.println(obj1.mostra());

        Rio obj2 = new Rio("Negro", 2, true);
        obj2.chover(34f);
        System.out.println(obj2.mostra());

        if (obj2.ensolarar(70f) == false) {
            System.out.println("O Rio " + obj2.nome + " secou!");
        }
        obj2.poluido = true;
        System.out.println(obj2.mostra());
    }
}
