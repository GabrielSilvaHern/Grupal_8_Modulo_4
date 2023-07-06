
public class MetodosUsuarios {

    public static void analizarUsuarios(Usuario usuario){

            System.out.println("\nnombre: " + usuario.getNombre());
            if(usuario instanceof Cliente){
                Cliente cliente = (Cliente) usuario;
                System.out.println("rut: "+cliente.getRut()+"\n"+
                                    "nombres: "+cliente.getNombres()+"\n"+
                                    "apellidos: "+cliente.getApellidos()+"\n"+
                                    "telefono: "+cliente.getTelefono()+"\n"+
                                    "afp: "+cliente.getAfp()+"\n"+
                                    "sistema de salud: "+cliente.getSistemaSalud()+"\n"+
                                    "dirección: "+cliente.getDireccion()+"\n"+
                                    "comuna: "+cliente.getComuna()+"\n"+
                                    "edad: "+cliente.getEdad());
            }
            if(usuario instanceof Profesional){
                Profesional profesional = (Profesional) usuario;
                System.out.println("titulo: "+profesional.getTitulo()+"\n"+
                                    "fecha de ingreso: "+profesional.getFechaIngreso());
            }
            if (usuario instanceof Administrativo){
                Administrativo administrativo = (Administrativo) usuario;
                System.out.println("area: "+administrativo.getArea()+"\n"+
                                    "experiencia previa: "+administrativo.getExpPrevia());
            }
    }
}
