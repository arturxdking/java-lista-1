package exe1;
public class TestaAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno(1, "Pedro", 17, 4.5f,5f);

        String mensagem = obj1.notaFinal();
        System.out.println(mensagem);

        obj1.dadosAluno();
       System.out.println(obj1.passou());
    }
}
