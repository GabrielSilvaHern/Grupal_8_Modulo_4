public class Cliente {

    private String RUT;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String AFP;
    private int sistSalud;
    private String direccion;
    private String comuna;
    private int edad;

    public Cliente() {
    }

    public Cliente(String RUT, String nombres, String apellidos, String telefono, String AFP, int sistSalud, String direccion, String comuna, int edad) {
        this.RUT = RUT;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.AFP = AFP;
        this.sistSalud = sistSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente: \n" +
                "RUT:'" + RUT + '\'' +
                ", nombres:'" + nombres + '\'' +
                ", apellidos:'" + apellidos + '\'' +
                ", telefono:'" + telefono + '\'' +
                ", AFP:'" + AFP + '\'' +
                ", sistSalud:" + sistSalud +
                ", direccion:'" + direccion + '\'' +
                ", comuna:'" + comuna + '\'' +
                ", edad:" + edad;
    }
}
