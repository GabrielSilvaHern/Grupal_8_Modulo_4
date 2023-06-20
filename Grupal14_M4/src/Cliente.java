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

    public String getRUT() {
        return RUT;
    }

    public void setRUT(String RUT) {
        this.RUT = RUT;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAFP() {
        return AFP;
    }

    public void setAFP(String AFP) {
        this.AFP = AFP;
    }

    public int getSistSalud() {
        return sistSalud;
    }

    public void setSistSalud(int sistSalud) {
        this.sistSalud = sistSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String obtenerNombre() {
       return this.nombres+" "+ this.apellidos;    //String nombreCompleto concatenado
    }

    public String obtenerSistSalud() {
        String mensaje="";

        if(this.sistSalud==1) {
          mensaje="El cliente pertenece a Fonasa";
        } else if (this.sistSalud==2) {
            mensaje="El cliente pertenece a Isapre";
        }
        else {
            mensaje="Valor ingresado no válido.";
        }

        return mensaje;
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
