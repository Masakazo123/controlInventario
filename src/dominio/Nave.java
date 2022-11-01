package dominio;

import java.io.Serializable;


public abstract class Nave implements Serializable{
    
    private String modelo;
    private String pais;
    private boolean condicionesOptimas;
    
    public abstract String realizarMantenimiento();
    public abstract String tipoCombustible();

    public Nave(String pais, String modelo, boolean condicionesOptimas) {
        this.pais = pais;
        this.modelo = modelo;
        this.condicionesOptimas = condicionesOptimas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCondicionesOptimas() {
        if(this.condicionesOptimas){
            return "Sí";
        }else{
            return "No";
        }
    }

    public void setCondicionesOptimas(boolean condicionesOptimas) {
        this.condicionesOptimas = condicionesOptimas;
    }

    @Override
    public String toString() {
        return "Modelo: "+modelo;
    }
    
    
    
}
