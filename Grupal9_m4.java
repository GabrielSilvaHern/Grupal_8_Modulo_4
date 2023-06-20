import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Empresa {
    private final String rut;
    private final String nombre;
    private final String direccion;
    private final String comuna;
    private final String telefono;

    public Empresa(String rut, String nombre, String direccion, String comuna, String telefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.comuna = comuna;
        this.telefono = telefono;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public String getTelefono() {
        return telefono;
    }
}

class Capacitacion {
    private final String dia;
    private final String hora;
    private final String lugar;
    private final int duracion;
    private final int asistentes;
    private final List<String> asistentesMenores25;
    private final List<String> asistentesEntre26y35;
    private final List<String> asistentesMayores35;

    public Capacitacion(String dia, String hora, String lugar, int duracion, int asistentes) {
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.asistentes = asistentes;
        this.asistentesMenores25 = new ArrayList<>();
        this.asistentesEntre26y35 = new ArrayList<>();
        this.asistentesMayores35 = new ArrayList<>();
    }

    public void ingresarAsistentes() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= asistentes; i++) {
            System.out.print("Ingrese el nombre del asistente " + i + ": ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la edad del asistente " + i + ": ");
            int edad = Integer.parseInt(scanner.nextLine());

            if (edad < 25) {
                asistentesMenores25.add(nombre);
            } else if (edad >= 26 && edad <= 35) {
                asistentesEntre26y35.add(nombre);
            } else {
                asistentesMayores35.add(nombre);
            }
        }
    }

    public void mostrarDatos(Empresa empresa) {
        System.out.println("\nDatos de la empresa:");
        System.out.println("RUT: " + empresa.getRut());
        System.out.println("Nombre: " + empresa.getNombre());
        System.out.println("Dirección: " + empresa.getDireccion());
        System.out.println("Comuna: " + empresa.getComuna());
        System.out.println("Teléfono: " + empresa.getTelefono());
        System.out.println("\nDatos de la capacitación:");
        System.out.println("Día: " + dia);
        System.out.println("Hora: " + hora);
        System.out.println("Lugar: " + lugar);
        System.out.println("Duración: " + duracion + " horas");
        System.out.println("\nCantidad de asistentes por rango de edad:");
        System.out.println("Menores a 25 años: " + asistentesMenores25.size());
        System.out.println("Entre 26 y 35 años: " + asistentesEntre26y35.size());
        System.out.println("Mayores a 35 años: " + asistentesMayores35.size());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos de la empresa
        System.out.println("Ingrese los datos de la empresa:");
        System.out.print("RUT: ");
        String rut = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Comuna: ");
        String comuna = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        Empresa empresa = new Empresa(rut, nombre, direccion, comuna, telefono);

        // Ingreso de datos de la capacitación
        System.out.println("\nIngrese los datos de la capacitación:");
        System.out.print("Día: ");
        String dia = scanner.nextLine();
        System.out.print("Hora: ");
        String hora = scanner.nextLine();
        System.out.print("Lugar: ");
        String lugar = scanner.nextLine();
        System.out.print("Duración (en horas): ");
        int duracion = Integer.parseInt(scanner.nextLine());

        int asistentes;
        do {
            System.out.print("Cantidad de asistentes: ");
            asistentes = Integer.parseInt(scanner.nextLine());

            if (asistentes <= 0) {
                System.out.println("La cantidad de asistentes debe ser mayor que cero. Inténtelo nuevamente.");
            }
        } while (asistentes <= 0);

        Capacitacion capacitacion = new Capacitacion(dia, hora, lugar, duracion, asistentes);
        capacitacion.ingresarAsistentes();
        capacitacion.mostrarDatos(empresa);
    }
}

/* Michael Pizarro - Rebeca Gatica - Gabriel Silva - Nelson Toledo */