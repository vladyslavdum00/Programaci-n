package JuegoUno;

public class Carta {
    private Color color;
    private TipoCarta tipoCarta;
    private int numero;
    private String colorVisual;
    public Carta(Color color, TipoCarta tipoCarta, int numero) {
        setColor(color);
        setTipoCarta(tipoCarta);
        setNumero(numero);
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setTipoCarta(TipoCarta tipoCarta) {
        this.tipoCarta = tipoCarta;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Color getColor() {
        return color;
    }
    public TipoCarta getTipoCarta() {
        return tipoCarta;
    }
    public int getNumero() {
        return numero;
    }



    public String getColorVisual() {
        return colorVisual;
    }
    public void setColorVisual(String colorVisual) {
        this.colorVisual = colorVisual;
    }


    @Override
    public String toString() {
        return "Carta{" +
                "color=" + color +
                ", tipoCarta=" + tipoCarta +
                ", numero=" + numero +
                '}';
    }
}
