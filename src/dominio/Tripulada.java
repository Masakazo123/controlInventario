package dominio;

import java.io.Serializable;

public class Tripulada extends Nave implements Serializable{

    private int capacidadPersonas;
    private int peso;
    
    public Tripulada(int unaCapacidad, int peso, String pais, String modelo, boolean condicionesOptimas) {
        super(pais,modelo,condicionesOptimas);
        this.capacidadPersonas = unaCapacidad;
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    @Override
    public String toString() {
        return "Nave: tripulada - "+super.toString()+" - Capacidad tripulacion: "+this.capacidadPersonas+" personas - Peso: "+this.peso+"tons";
    }
    
    
    
    public String[] toArray(){
        String[] fila = {
            "Tripulada",
            super.getModelo(),
            super.getPais(),
            super.getCondicionesOptimas()};
        return fila;
    }

    @Override
    public String realizarMantenimiento() {
        return "Cargando equipo de mantenimiento...";
    }

    @Override
    public String tipoCombustible() {
        return "Químico sólido";
    }

}
