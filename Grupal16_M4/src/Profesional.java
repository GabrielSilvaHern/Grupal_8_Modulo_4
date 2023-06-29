public class Profesional extends Usuario{

    private String titulo;
    private String fechaIngreso;

    public Profesional() {
    }

    public Profesional(String nombre, String fechaNacimiento, String run, String titulo, String fechaIngreso) {
        super(nombre, fechaNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("titulo: "+this.titulo+"\n"+
                           "fecha de ingreso: "+this.fechaIngreso);
    }

    @Override
    public String toString() {
        return "Profesional " +
                "titulo: '" + titulo + '\'' +
                ", fechaIngreso: '" + fechaIngreso + '\'';
    }
}
