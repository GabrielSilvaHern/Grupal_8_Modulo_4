class Repartidor extends Empleado{
    private final String disponibilidadHoraria;

    public Repartidor(String nombre, String apellido, int edad, int salario, String disponibilidadHoraria) {
        super(nombre, apellido, edad, salario);
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Disponibilidad horaria: " + disponibilidadHoraria);
    }

    public int calcularSalarioTotal() {
        int salarioTotal = salario;
        if (edad > 40) {
            salarioTotal += 100000;
        }
        if (edad < 30) {
            salarioTotal += 15000;
        }
        return salarioTotal;
    }
}