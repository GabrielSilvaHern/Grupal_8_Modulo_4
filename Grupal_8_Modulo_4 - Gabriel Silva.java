//Integrantes Gabriel Silva - Michael Pizarro - Nelson Toledo - Rebeca Gatica //
import java.util.Scanner;

public class Grupal_8 {

       public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String nombre = "";
            String fechaNacimiento = "";
            String run = "";
            String tipoUsuario = "";
            String direccion = "";
            String telefono = "";
            int cantidadEmpleados = 0;
            int aniosExperiencia = 0;
            String departamento = "";
            String funcion = "";
            String nombreSuperior = "";

            System.out.println("Ingrese un nombre: ");
            nombre = sc.nextLine();


            System.out.println("Ingrese fecha de nacimiento: ");
            fechaNacimiento = sc.nextLine();

            System.out.println("Ingrese run: ");
            run = sc.nextLine();

            System.out.println("Ingrese Tipo de usuario (Cliente - Profesional - Administrativo)");
            tipoUsuario = sc.nextLine().toLowerCase().trim();

            switch (tipoUsuario){
                 case "cliente":
                      System.out.println("Ingrese su direccion: ");
                      direccion = sc.nextLine();

                      System.out.println("Ingrese su número telefónico: ");
                      telefono = sc.nextLine();

                      System.out.println("Ingrese cantidad de empleados: ");
                      cantidadEmpleados = sc.nextInt();
                      break;
                 case "profesional":
                      System.out.println("Ingrese años de experiencia: ");
                      aniosExperiencia = sc.nextInt();
                      sc.nextLine();

                      System.out.println("Ingrese su departamento: ");
                      departamento = sc.nextLine();
                      break;
                 case "administrativo":
                      System.out.println("Ingrese su funcion: ");
                      funcion = sc.nextLine();

                      System.out.println("Ingrese nombre superior: ");
                      nombreSuperior = sc.nextLine();
                      break;
                 default:
                      System.out.println("Tipo de usuario no válido");
                      break;
            }

            System.out.println("Nombre: "+nombre+"\n"+
                               "Fecha de nacimiento: "+fechaNacimiento+"\n"+
                               "Run: "+run+"\n"+
                               "Tipo de Usuario: "+tipoUsuario);

            switch (tipoUsuario){
                 case "cliente":
                      System.out.println("Dirección: "+direccion+"\n"+
                                         "Teléfono: "+telefono+"\n"+
                                         "Cantidad de empleados: "+cantidadEmpleados);
                      break;
                 case "profesional":
                      System.out.println("Años de experiencia: "+aniosExperiencia+"\n"+
                                         "Departamento: "+departamento);
                      break;
                 case "administrativo":
                      System.out.println("Función: "+funcion+"\n"+
                                         "Nombre superior: "+nombreSuperior);
            }
       }
}
