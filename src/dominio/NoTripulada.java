package dominio;

import java.io.Serializable;

public class NoTripulada extends Nave implements Serializable{
    
    private int empuje;
    private String cuerpoEstudiar;
    
    public NoTripulada(String pais, String modelo, boolean condicionesOptimas, int empuje, String cuerpoEstudiar) {
        super(pais,modelo,condicionesOptimas);
        this.empuje = empuje;
        this.cuerpoEstudiar = cuerpoEstudiar;
    }

    public String getCuerpoEstudiar() {
        return cuerpoEstudiar;
    }

    public void setCuerpoEstudiar(String cuerpoEstudiar) {
        this.cuerpoEstudiar = cuerpoEstudiar;
    }

    public int getEmpuje() {
        return empuje;
    }

    public void setEmpuje(int empuje) {
        this.empuje = empuje;
    }

    @Override
    public String toString() {
        return "Nave no tripulada - "+super.toString()+" - Empuje: "+this.empuje+"kg - Cuerpo a estudiar: "+this.cuerpoEstudiar;
    }
    
    
    
    public String[] toArray(){
        String[] fila = {
            "No tripulada",
            super.getModelo(),
            super.getPais(),
            super.getCondicionesOptimas()};
        return fila;
    }

    @Override
    public String realizarMantenimiento() {
        return "Limpiando paneles solares...";
    }

    @Override
    public String tipoCombustible() {
        return "Óxido nítrico";
    }

    
}
