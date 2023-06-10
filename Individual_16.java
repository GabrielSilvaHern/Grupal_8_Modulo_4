import java.util.Scanner;

public class Individual_16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String contrasenia ="contraseña1234";
        String contraseniaUsuario ="";
        int intento = 0;
        do {
            System.out.println("Ingrese contraseña");
        contraseniaUsuario = leer.nextLine();
        intento++;

        } while (intento<3 && !contrasenia.equals(contraseniaUsuario));
        if (intento == 4){
            System.out.println("No tienes mas intentos");

        } else {
            System.out.println("La clave ingresada es correcta");
        }
        }
        }



