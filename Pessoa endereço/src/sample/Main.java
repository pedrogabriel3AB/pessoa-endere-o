package sample;

import sample.model.PessoaFisica;
import sample.model.Pessoa;

public class Main {

    public static void main(String[] args){

        PessoaFisica pessoafisica1 = new PessoaFisica(" Santiago","","sant@gmail.com");
        pessoafisica1.setEndereco("Sete de outubro", 12);
        PessoaFisica pessoafisica2 = new PessoaFisica("pedrin", "888.999.111.90","pedrin@gmail.com");
        pessoafisica2.setEndereco("Rua do manguito",13);
        PessoaFisica pessoafisica3 = new PessoaFisica("fernando", "1-01", "fe@gmail.com");
        pessoafisica3.setEndereco("Ruas das rendeiras",14);
        System.out.println(pessoafisica1);
        System.out.println(pessoafisica2);
        System.out.println(pessoafisica3);



    }
}
