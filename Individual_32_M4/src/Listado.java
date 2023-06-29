import java.util.*;

public class Listado {
    List<Trabajador> trabajadores;

    public Listado(){
        this.trabajadores = new ArrayList<Trabajador>() ;

    }
    public void agregarTrabajador(Trabajador trabajador){
        trabajadores.add(trabajador);

    }

    public void mostrarDatos(){
        for(Trabajador trabajador:trabajadores){
           trabajador.mostrarDatos();

        }
    }

}
