package dia15;

import java.util.Scanner;

/** *
 * @author : Gabriel Silva
 * @author : Nelson Toledo
 * @author : Michael Pizarro
 * @author : Rebeca Gatica
 * @version : 1.0
 * Esta clase nos permite realizar operaciones básicas de cálculo.
 */

public class Individual15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        String signo = "";
        int resultado = 0;

        System.out.println("Ingrese el primer número: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = sc.nextInt();
        System.out.println("Ingrese un signo aritmético (+ - x : /)");
        signo = sc.next();

        switch (signo){
            case "+":
                resultado = sumar(num1,num2);
                break;
            case "-":
                resultado = restar(num1,num2);
                break;
            case "x":
                resultado = multiplicar(num1,num2);
                break;
            case ":":
                if (num2 == 0){
                    System.out.println("No se puede dividir por 0");
                }else {
                    resultado = dividir(num1,num2);
                }
                break;
            case "/":
                resultado = modulo(num1,num2);
                break;
            default:
                System.out.println("El signo ingresado no es válido");
                break;
        }

        System.out.println("El resultado de la operación es: "+resultado);

    }

    /**
     *
     * @param num1 : Ingresamos un valor de tipo entero.
     * @param num2 : Ingresamos un segundo valor de tipo entero.
     * @return retornamos un valor de tipo entero, resultado de la suma.
     */
    public static int sumar(int num1,int num2){
        return num1+num2;
    }
    /**
     *
     * @param num1 : Ingresamos un valor de tipo entero.
     * @param num2 : Ingresamos un segundo valor de tipo entero.
     * @return retornamos un valor de tipo entero, resultado de la resta.
     */
    public static int restar(int num1,int num2){
        return num1-num2;
    }
    /**
     *
     * @param num1 : Ingresamos un valor de tipo entero.
     * @param num2 : Ingresamos un segundo valor de tipo entero.
     * @return retornamos un valor de tipo entero, resultado de la multiplicación.
     */
    public static int multiplicar(int num1,int num2){
        return num1*num2;
    }
    /**
     *
     * @param num1 : Ingresamos un valor de tipo entero.
     * @param num2 : Ingresamos un segundo valor de tipo entero.
     * @return retornamos un valor de tipo entero, resultado de la división y evaluamos que el valor de num2,
     * no sea 0.
     */
    public static int dividir(int num1,int num2){
        return num1/num2;
    }
    /**
     *
     * @param num1 : Ingresamos un valor de tipo entero.
     * @param num2 : Ingresamos un segundo valor de tipo entero.
     * @return retornamos un valor de tipo entero, resultado de el módulo.
     */
    public static int modulo(int num1,int num2){
        return num1%num2;
    }
}
