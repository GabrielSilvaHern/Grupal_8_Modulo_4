import java.util.ArrayList;
import java.util.List;

public class Listado {

    List<Usuario> usuarios;

    public Listado() {
        this.usuarios = new ArrayList<>();
    }


    public void agregarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }

    public void analizarUsuario(){
        for(Usuario u: usuarios){
            System.out.println(u.analizarUsuario());
        }
    }
}
