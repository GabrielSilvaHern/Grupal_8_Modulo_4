public class Usuario {

    private String nombre;
    private String fechaNacimiento;
    private String RUN;

    public Usuario() {
    }

    public Usuario(String nombre, String fechaNacimiento, String RUN) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.RUN = RUN;
    }

    @Override
    public String toString() {
        return "Usuario: \n" +
                "nombre:'" + nombre + '\'' +
                ", fechaNacimiento:'" + fechaNacimiento + '\'' +
                ", RUN:'" + RUN + '\'';
    }
}
