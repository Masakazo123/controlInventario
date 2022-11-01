package dominio;

import java.io.Serializable;


public class Lanzadera extends Nave implements Serializable{

    private int capacidadMaxima;
    private int empuje;
    
    public Lanzadera(String pais, String modelo, boolean condicionesOptimas, int capacidadMaxima, int empuje){
        super(pais,modelo,condicionesOptimas);
        this.capacidadMaxima = capacidadMaxima;
        this.empuje = empuje;
    }

    public int getCarga() {
        return capacidadMaxima;
    }

    public void setCarga(int carga) {
        this.capacidadMaxima = carga;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getEmpuje() {
        return empuje;
    }

    public void setEmpuje(int empuje) {
        this.empuje = empuje;
    }
    
    

    @Override
    public String toString() {
        return "Nave: lanzadera - "+super.toString()+" - Empuje: "+this.empuje+"tons - Capacidad transporte: "+this.capacidadMaxima+"tons";
    }

    
    
    public String[] toArray(){
        String[] fila = {
            "Lanzadera",
            super.getModelo(),
            super.getPais(),
            super.getCondicionesOptimas()};
        return fila;
    }

    @Override
    public String realizarMantenimiento() {
        return "Llenando tanques de combustible...";
    }

    @Override
    public String tipoCombustible() {
        return "Combustible químico sólido";
    }

    
    
    
}
