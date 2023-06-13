package clase11;

class EjeMpl02 {
    public static void main(String[] args) {
        final boolean VALOR_CONSTANTE = false;

        String mensaje = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \n" +
                "Donec facilisis est ac ante viverra, vel efficitur leo consequat. \n" +
                "Maecenas quis lorem sit amet diam consequat lacinia non nec lacus. \n" +
                "Phasellus egestas quam non dui dictum, sed fermentum dolor efficitur. \n" +
                "Aliquam volutpat ex sodales pulvinar scelerisque. \n" +
                "Donec sodales cursus tortor eu aliquam. \n" +
                "Curabitur id purus arcu. \n" +
                "Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; \n" +
                "Suspendisse pretium, quam non consectetur scelerisque, diam tortor iaculis arcu, \n" +
                "nec tincidunt diam eros sed urna. \n" +
                "Ut at consequat enim. Orci varius natoque penatibus et magnis dis parturient montes, \n" +
                "nascetur ridiculus mus. \n" +
                "Donec sit amet ultricies dui. Donec aliquet rhoncus velit et sollicitudin.\n";

        int ola = 10;

        for (int i = 0; i < ola; i++) {
            System.out.println("Valor: " + (i * i));
        }

        /*Esto es un comentario
        demasiado grande
        para que esté en una
        sola línea*/

        System.out.println("El mensaje es: " + mensaje);
        System.out.println("El valor de la constante es: " + VALOR_CONSTANTE);
    }
}

/*Errores:
1) El nombre de la clase deben comenzar con letra mayúscula.
2) El nombre del package debe comenzar con minúscula.
3) El valor constante, si es "final" debe ir con mayúscula.
4) El mensaje debe tener una mejor visualización mediante saltos de línea y concatenación.
5) La variable "Ola" debe ir en minúsculas.
6) El ciclo for debe ubicarse en la misma línea.
7) El comentario debe estar en un sole bloque mediante /* y no //.
 */