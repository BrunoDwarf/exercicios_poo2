public class Nota {
    public static int contador = 0;
    public int numero;
    private Double valor;
    private Double soma;
    private Double media;

    public Nota(Double valor) {
        this.numero = ++contador;
        this.valor = valor;
        this.soma = soma;
        this.media = media;
    }

    public void setNumero() {
        this.numero = ++contador;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNota(Double valor) {
        this.valor = valor;
    }

    public Double getNota() {
        return this.valor;
    }

    public Double calcularMedia(Double valor) {
        soma = soma + this.valor;
        media = soma / this.numero;
        return media;
    }
}