public class Main {

    public static void main(String[] args) {
        Honorario honorario = new Honorario("Pedro Pablo", "Picapiedras Marmol", "4012489-3", "4372894430", 20, "giro", 2003);
        Contratado contratado = new Contratado("Carla", "Vergara Vergara", "12143784-5", "923489320", 50, "1999", "1800000");
        Eventual eventual = new Eventual("Caterin Laura", "Morales Sanabria", "20103924-5", "883737389", 24,"disponibilidad", "correoElectronico");

     honorario.mostrarDatos();
     contratado.mostrarDatos();
     eventual.mostrarDatos();
    }


}

