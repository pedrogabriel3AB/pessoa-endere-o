package sample.model;

public class Endereco {

    public String rua;
    public int numero;




    public Endereco(String nome){this.rua = nome; }

    public Endereco() {

    }

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) { this.rua = rua; }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }




    public String toString(){{return "Endereco do gabriel:" + rua +"," + numero+ "," ; }

    }

}
