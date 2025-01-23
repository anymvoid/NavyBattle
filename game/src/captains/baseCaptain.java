package captains;

public class baseCaptain{
    private String nome ;
    private  int forza ;
    private String  arma ;

    public baseCaptain(String nome, int forza, String arma) {
        this.nome = nome;
        this.forza = forza;
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForza() {
        return forza;
    }

    public void setForza(int forza) {
        this.forza = forza;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
}
