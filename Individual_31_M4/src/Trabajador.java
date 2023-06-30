public class Trabajador {

    private String nombres;
    private String apellidos;
    private String run;
    private String telefono;
    private int edad;

    public Trabajador(){

    }

    public Trabajador(String nombres,String apellidos, String run,String telefono,int edad){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }
    public String getNombres() {
        return this.nombres;
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

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("Teléfono: "+this.telefono+"\n"+
                           "Edad: "+this.edad);
    }

    @Override
    public String toString() {
        return "Trabajador \n" +
                "nombres: '" + nombres + '\'' +
                ", apellidos: '" + apellidos + '\'' +
                ", run: '" + run + '\'' +
                ", telefono: '" + telefono + '\'' +
                ", edad: " + edad;
    }
}
