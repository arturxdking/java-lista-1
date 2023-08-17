public class Aluno {
    
    public int numeroAluno;
    public String nome;
    public int idade;
    public float p1;
    public float p2;

    public Aluno(int numeroAluno, String nome, int idade,
        float p1, float p2){
            this.numeroAluno = numeroAluno;
            this.nome = nome;
            this.idade = idade;
            this.p1 = p1;
            this.p2 = p2;
        }

    public String notaFinal(){
        float media = (this.p1 + this.p2)/2;
        return "A nota final do aluno " + this.nome + " é : " + media;
    }

    public void dadosAluno(){
        System.out.println("\nNúmero do aluno: " + this.numeroAluno +
        "\nNome: " + this.nome + "\nIdade: " + idade);
    }

    public String passou() {
        float media = (this.p1 + this.p2) / 2;
        return "\n" + this.nome + " " + (media >= 6 ? "Passou" : "Rodou");
    }
}
