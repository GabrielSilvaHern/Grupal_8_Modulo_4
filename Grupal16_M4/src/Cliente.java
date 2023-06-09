public class Cliente extends Usuario {

    private Integer rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    private Integer sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;

    public Cliente() {
    }

    public Cliente(String nombre, String fechaNacimiento, String run, Integer rut, String nombres, String apellidos, String telefono, String afp, Integer sistemaSalud, String direccion, String comuna, int edad) {
        super(nombre, fechaNacimiento, run);
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
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

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public Integer getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(Integer sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
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

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("rut: "+this.rut+"\n"+
                           "nombres: "+this.nombres+"\n"+
                           "apellidos: "+this.apellidos+"\n"+
                           "telefono: "+this.telefono+"\n"+
                           "afp: "+this.afp+"\n"+
                           "sistema de salud: "+this.sistemaSalud+"\n"+
                           "dirección: "+this.direccion+"\n"+
                           "comuna: "+this.comuna+"\n"+
                           "edad: "+this.edad);
    }

    @Override
    public String toString() {
        return "Cliente " +
                "rut: " + rut +
                ", nombres: '" + nombres + '\'' +
                ", apellidos: '" + apellidos + '\'' +
                ", telefono: '" + telefono + '\'' +
                ", afp: '" + afp + '\'' +
                ", sistemaSalud: " + sistemaSalud +
                ", direccion: '" + direccion + '\'' +
                ", comuna: '" + comuna + '\'' +
                ", edad: " + edad;
    }
}
