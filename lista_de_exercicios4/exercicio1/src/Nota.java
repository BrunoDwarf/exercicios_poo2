public class Nota {
    public static int contador = 0;
    public int numero;
    private Double valor;
    private double media;

    public Nota(Double valor) {
        this.numero = ++contador;
        this.valor = valor;
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

    public double calcularMedia(Double valor) {
        media = media + this.valor;
        return media;
    }
}