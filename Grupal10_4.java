import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int CALIFICACION_MAXIMA = 7;
        Scanner leer = new Scanner(System.in);
        String dia, hora, lugar, duracion;
        String nombre = "";
        int cantidadAsistentes = 0;
        int calificacion = 1;
        int promedio = 0;
        int suma = 0;
        int calificacionMayor = 0;
        int calificacionMenor = CALIFICACION_MAXIMA;
        String nombreMayor = "";
        String nombreMenor = "";

        String evaluaciones [][];
        System.out.println("Ingrese dia de la capacitacion");
        dia = leer.nextLine();
        System.out.println("Ingrese hora de la capacitacion");
        hora = leer.nextLine();
        System.out.println("Ingrese lugar de la capacitacion");
        lugar = leer.nextLine();
        System.out.println("Ingrese duracion de la capacitacion");
        duracion = leer.nextLine();
        System.out.println("Ingrese cantidad de asistentes");
        cantidadAsistentes = leer.nextInt();
        leer.nextLine();

        evaluaciones = new String [cantidadAsistentes][2];

        for (int i= 0; i<cantidadAsistentes; i++) {
            for (int j=0; j<2; j++) {
                if (j==0) {
                    System.out.println("Ingrese nombre");
                    nombre = leer.nextLine();
                    evaluaciones[i][0] = nombre;
                }
                if (j==1) {
                    System.out.println("Ingrese calificacion a capacitacion (1 a 7)");
                    calificacion = leer.nextInt();
                    leer.nextLine();
                    if (calificacion > 0 && calificacion <=CALIFICACION_MAXIMA) {
                        suma = suma+calificacion;

                        if (calificacion>calificacionMayor) {
                            calificacionMayor = calificacion;
                            nombreMayor = nombre;
                        }
                        if (calificacion<calificacionMenor) {
                            calificacionMenor = calificacion;
                            nombreMenor = nombre;
                        }

                        String nota = Integer.toString(calificacion);
                        evaluaciones[i][1] = nota;
                    } else {
                        System.out.println("Calificacion fuera de rango");
                    }
                }
            }
        }
        promedio = suma/cantidadAsistentes;
        System.out.println("Datos de la capacitacion");
        System.out.println("Dia: "+dia);
        System.out.println("Hora: "+hora);
        System.out.println("Lugar: "+lugar);
        System.out.println("Duracion: "+duracion);
        System.out.println("Cantidad de asistentes: "+cantidadAsistentes);
        System.out.println("Promedio: "+promedio);
        System.out.println("Calificacion mayor: "+calificacionMayor+" Nombre calificacion mayor: "+nombreMayor);
        System.out.println("Calificacion menor: "+calificacionMenor+" Nombre calificacion menor: "+nombreMenor);
    }
}