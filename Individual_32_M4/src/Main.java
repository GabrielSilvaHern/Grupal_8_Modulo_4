public class Main {

    public static void main(String[] args) {
        Listado listado = new Listado();
        Honorario honorario = new Honorario("Pedro Pablo", "Picapiedras Marmol", "4012489-3", "4372894430", 20, "Contabilidad", 2003);
        Honorario honorario2 = new Honorario("Pablo Pedro", "Zapata Rios", "12999043-1", "987635472", 32,"Administración", 2006);
        Contratado contratado = new Contratado("Carla", "Vergara Vergara", "12143784-5", "923489320", 50, "1999", "1800000");
        Contratado contratado2 = new Contratado("Sofia", "Castro Vergara", "14325784-8", "876345698", 35,"2002", "1900000");
        Eventual eventual = new Eventual("Caterin Laura", "Morales Sanabria", "20103924-5", "883737389", 24,"disponibilidad", "correoElectronico");

        listado.agregarTrabajador(honorario);
        listado.agregarTrabajador(honorario2);
        listado.agregarTrabajador(contratado);
        listado.agregarTrabajador(contratado2);
        listado.agregarTrabajador(eventual);

        listado.mostrarDatos();


    }


}

//Trabajo individual 32 Mod4 // Coder: Michael Pizarro - Nelson Toledo - Gabriel Silva - Rebeca Gatica //


