public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;

    public Cliente (int numeroConta, int numeroAgencia, String nome,
    float saldo){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;   
        this.saldo = saldo;
    }

    public void realizarDeposito(float x){
        this.saldo += x;
    }

    public void realizarSaque(float x){
        if(x <= this.saldo){
            this.saldo -= x;
        }else{
            System.out.println("Saldo insuficiênte");
        }
    }

    public String extrato (){
        return "\nAgência: " + this.numeroAgencia + "\nConta: " + this.numeroConta + "\nNome: " +
        this.nome + "\nSaldo: " + this.saldo; 
    }
}
