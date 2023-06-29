//Ingresando subclase Contratado
public class Contratado extends Trabajador {
    private String fechaIngreso;
    private String salarioMensual;

    public Contratado (String nombres, String apellidos, String run, String telefono, int edad, String fechaIngreso, String salarioMensual) {
        super (nombres, apellidos, run, telefono, edad);
        this.fechaIngreso = fechaIngreso;
        this.salarioMensual = salarioMensual;
    }
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(String salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Fecha de Ingreso: "+this.fechaIngreso+","+" Salario Mensual: "+this.salarioMensual);
    }

    @Override
    public String toString() {
        return "Contratado{" +
                "fechaIngreso='" + fechaIngreso + '\'' +
                ", salarioMensual='" + salarioMensual + '\'' +
                '}';
    }
}
