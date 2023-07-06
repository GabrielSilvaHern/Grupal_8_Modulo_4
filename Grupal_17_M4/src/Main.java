public class Main {
    public static void main(String[] args) {
    Listado listado = new Listado();
    Usuario cliente = new Cliente("Jesus","24/08/87","654987-8",3216547,"Juan Jarry","Juvenal Jacinto","98765421","Provida",1,"Calle 1","Quilpue",23);
    Usuario administrativo = new Administrativo("Pedro","12/12/12","951753-8","Central",6);
    Usuario administrativo2 = new Administrativo("Michelin","10/09/08","415263-1","Secundaria",4);
    Usuario profesional = new Profesional("Maria","15/02/78","167842-6","Ing. Prev. Riesgos","14/12/14");
    Usuario profesional2 = new Profesional("Judas","11/11/72","748596-1-6","Contador Auditor","24/07/10");

    listado.agregarUsuario(cliente);
    listado.agregarUsuario(administrativo);
    listado.agregarUsuario(administrativo2);
    listado.agregarUsuario(profesional);
    listado.agregarUsuario(profesional2);

    for (Usuario usuario: listado.getUsuarios()){
        MetodosUsuarios.analizarUsuarios(usuario);
    }

    }
}