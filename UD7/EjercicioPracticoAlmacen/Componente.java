package EjercicioPracticoAlmacen;

import java.util.Objects;

public class Componente {
    private String modelo;
    private String marca;
    private double precio;

    public Componente(String modelo, String marca, double precio) {
        setModelo(modelo);
        setMarca(marca);
        setPrecio(precio);
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Componente that = (Componente) o;
        return Objects.equals(modelo, that.modelo) && Objects.equals(marca, that.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, marca);
    }
    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Precio: " + precio;
    }
}
