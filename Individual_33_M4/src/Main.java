import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Juan", "Perez", 45, 2000000, new Date());
        vendedor.imprimirInformacion();
        System.out.println("Salario total: $" + vendedor.calcularSalarioTotal());

        System.out.println();

        Repartidor repartidor = new Repartidor("Maria", "Lopez", 28, 1500000, "Tarde");
        repartidor.imprimirInformacion();
        System.out.println("Salario total: $" + repartidor.calcularSalarioTotal());
    }
}
