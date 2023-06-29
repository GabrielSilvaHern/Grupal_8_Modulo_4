import java.util.Date;

class Vendedor extends Empleado {
    private final Date fechaInicio;

    public Vendedor(String nombre, String apellido, int edad, int salario, Date fechaInicio) {
        super(nombre, apellido, edad, salario);
        this.fechaInicio = fechaInicio;
    }

    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Fecha de inicio: " + fechaInicio);
    }

    public int calcularSalarioTotal() {
        int salarioTotal = salario + 50000;
        if (edad > 40) {
            salarioTotal += 100000;
        }
        return salarioTotal;
    }
}