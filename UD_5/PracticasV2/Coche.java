package PracticasV2;

public class Coche {
    final String modelo;
    private String color;
    private boolean pinturaMetalizada;
    final String matricula;
    final String tipo;
    private int yearFabrication;
    private String seguro;

    public Coche(String modelo, String color, boolean pinturaMetalizada, String matricula, String tipo, int yearFabrication,  String seguro) {
        if (modelo.length() != 0) {
            this.modelo = modelo;
        }else{
            this.modelo = null;
        }
        setColor(color);
        setPinturaMetalizada(pinturaMetalizada);
        if(matricula.length() != 0){
            this.matricula = matricula;
        }else{
            this.matricula = null;
        }

        if(tipo.length() != 0){
            this.tipo = tipo;
        }else{
            this.tipo = null;
        }
        setYearFabrication(yearFabrication);
        setSeguro(seguro);

    }

    public String getModelo() {
        return modelo;
    }
    public String getColor() {
        return color;
    }
    public boolean isPinturaMetalizada() {
        return pinturaMetalizada;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getTipo() {
        return tipo;
    }
    public int getYearFabrication() {
        return yearFabrication;
    }
    public String getSeguro() {
        return seguro;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPinturaMetalizada(boolean pinturaMetalizada) {
        this.pinturaMetalizada = pinturaMetalizada;
    }
    public void setYearFabrication(int yearFabrication) {
        this.yearFabrication = yearFabrication;
    }
    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public void mostrar(){
        System.out.println("Modelo: " + getModelo());
        System.out.println("Color: " + getColor());
        System.out.println("Pintura Metalizada: " + isPinturaMetalizada());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Year Fabrication: " + getYearFabrication());
        System.out.println("Seguro: " + getSeguro());
    }
}
