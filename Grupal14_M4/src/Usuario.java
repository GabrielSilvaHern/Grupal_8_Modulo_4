import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRUN() {
        return RUN;
    }

    public void setRUN(String RUN) {
        this.RUN = RUN;
    }


    public void mostrarEdad(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(this.fechaNacimiento, formatter);
        Period edad = Period.between(fechaNacimiento, LocalDate.now());
        System.out.println( "El usuario tiene " +edad.getYears() +" años.");
    }


    @Override
    public String toString() {
        return "Usuario: \n" +
                "nombre:'" + nombre + '\'' +
                ", fechaNacimiento:'" + fechaNacimiento + '\'' +
                ", RUN:'" + RUN + '\'';
    }
}
