package dominio;
import java.io.Serializable;
import java.util.*;

public class Sistema implements Serializable{
    private List<Nave> naves = new ArrayList();
    public List<Nave> getListaNaves() {
        return naves;
    }
    
    public void borrarListaNaves(){
        naves = new ArrayList();
    }

    public void agregarNave(Nave unaNave){
        naves.add(unaNave);
    }
    
    public void eliminarNave(Nave unaNave){
        naves.remove(unaNave);
    }
    
    public void eliminarNave(int num){
        naves.remove(num);
    }
    
    public void agregarNavesPredeterminadas(){
        Lanzadera n1 = new Lanzadera("EEUU", "Saturno V", true, 2900, 3500);
        agregarNave(n1);
        
        Lanzadera n2 = new Lanzadera("Rusia", "Energía", false, 100, 3060);
        agregarNave(n2);
        
        Lanzadera n3 = new Lanzadera("China", "Larga Marcha 3B", true, 2000, 2800);
        agregarNave(n3);
        
        Tripulada n4 = new Tripulada(3, 20, "Rusia", "Salyut", false);
        agregarNave(n4);
        
        Tripulada n5 = new Tripulada(3, 77, "EEUU", "Skylab", false);
        agregarNave(n5);
        
        Tripulada n6 = new Tripulada(7, 420, "EEUU", "EEI", true);
        agregarNave(n6);
        
        NoTripulada n7 = new NoTripulada("EEUU", "Mariner X", false, 66, "Mercurio");
        agregarNave(n7);
    
        NoTripulada n8 = new NoTripulada("EEUU", "Mariner IV", true, 22, "Marte");
        agregarNave(n8);
    
        NoTripulada n9 = new NoTripulada("EEUU", "Pionero XI", true, 26, "Estrella Lambda");
        agregarNave(n9);
    }
}
