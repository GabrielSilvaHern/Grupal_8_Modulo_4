package dia16;

import java.util.Scanner;

/** *
 * @author : Gabriel Silva
 * @author : Nelson Toledo
 * @author : Michael Pizarro
 * @author : Rebeca Gatica
 * @version : 1.0
 * Esta clase nos permite evaluar si la contraseña ingresada por consola es correcta.
 */

public class Individual16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasenia = "pass123";
        String contraseniaUsuario = "";
        int intentos = 0;

        do{
            System.out.println("Ingrese una contraseña");
            contraseniaUsuario = sc.next();
            intentos++;
        }while (intentos < 3 && !contrasenia.equals(contraseniaUsuario));

        if(intentos == 3 && contrasenia.equals(contraseniaUsuario) || contrasenia.equals(contraseniaUsuario)){
            System.out.println("La clave ingresada es correcta");
        }else {
            System.out.println("No tiene más intentos");
        }


    }
}
