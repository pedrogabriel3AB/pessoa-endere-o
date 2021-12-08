package sample.model;

public class PessoaFisica extends Pessoa{

    private String email;


    public PessoaFisica(String nome) {
        super(nome);
    }
    public PessoaFisica(String nome, String cpf){
        super(nome, cpf);
    }
    public PessoaFisica(String nome, String cpf, String email){
        super(nome, cpf);
        this.email = email;
    }
}


