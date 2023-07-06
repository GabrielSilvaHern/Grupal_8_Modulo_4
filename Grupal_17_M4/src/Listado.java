import java.util.ArrayList;
import java.util.List;

public class Listado {

    List<Usuario> usuarios;

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Listado() {
        this.usuarios = new ArrayList<>();
    }


    public void agregarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }

}
