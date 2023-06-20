public class Main {
    public static void main(String[] args) {
// Creamos dos instancias para Usuario, Cliente y Capacitacion:
        Cliente cliente = new Cliente("1147895-8","Juan Pablo","Perez Perez","654987321","Provida",1,"Calle Falsa 123","Santiago",36);
        Cliente cliente2 = new Cliente ();
                cliente2.setRUT("14230890-7");
                cliente2.setNombres("Javiera Camila");
                cliente2.setApellidos("Vallejos Roa");
                cliente2.setTelefono("990323498");
                cliente2.setAFP("Provida");
                cliente2.setSistSalud(2);
                cliente2.setDireccion("Calle Esperanza 345");
                cliente2.setComuna("Valdivia");
                cliente2.setEdad(32);


        Usuario usuario = new Usuario("Elvis","12/12/1989","1321456-8");
        Usuario usuario2 = new Usuario();
                usuario2.setNombre("Julio");
                usuario2.setFechaNacimiento("08/09/1980");
                usuario2.setRUN("16432987-4");

        Capacitacion capacitacion = new Capacitacion(1,"1234567-8","Lunes","14:00 horas","Viña del Mar","120 minutos",15);
        Capacitacion capacitacion2 = new Capacitacion();
                     capacitacion2.setIdentificador(2);
                     capacitacion2.setRutCliente("98765432-1");
                     capacitacion2.setDia("Martes");
                     capacitacion2.setHora("11:00 horas");
                     capacitacion2.setLugar("Santiago");
                     capacitacion2.setDuracion("120 minutos");
                     capacitacion2.setCantAsistentes(20);

// Desplegamos la información de cada clase con System.out.println() :

        System.out.println(cliente.toString());
        System.out.println(cliente2.toString());

        System.out.println(usuario.toString());
        System.out.println(usuario2.toString());

        System.out.println(capacitacion.toString());
        System.out.println(capacitacion2.toString());

//Modificamos un atributo de cada clase:

        cliente2.setEdad(33);
        usuario2.setFechaNacimiento("08/12/1980");
        capacitacion2.setLugar("Puerto Montt");
        System.out.println(cliente2.toString());
        System.out.println(usuario2.toString());
        System.out.println(capacitacion2.toString());
//

//Mostrar info mediante los métodos accesores y desplegamos los resultados de los métodos creados.

        System.out.println(cliente.obtenerNombre());
        System.out.println(cliente.obtenerSistSalud());
        usuario.mostrarEdad();

        System.out.println(capacitacion.mostrarDetalle());

        System.out.println(cliente.getRUT()+", "+ cliente.getNombres()+", "+cliente.getApellidos()+", "+cliente.getTelefono()+", "+cliente.getAFP()+", "+cliente.getSistSalud()+", "+cliente.getDireccion()+", "+cliente.getComuna()+", "+cliente.getEdad()+".");
        System.out.println(cliente2.getRUT()+", "+ cliente2.getNombres()+", "+cliente2.getApellidos()+", "+cliente2.getTelefono()+", "+cliente2.getAFP()+", "+cliente2.getSistSalud()+", "+cliente2.getDireccion()+", "+cliente2.getComuna()+", "+cliente2.getEdad()+".");

        System.out.println(usuario.getNombre()+", "+ usuario.getFechaNacimiento()+", "+ usuario.getRUN()+".");
        System.out.println(usuario2.getNombre()+", "+ usuario2.getFechaNacimiento()+", "+ usuario2.getRUN()+".");

        System.out.println(capacitacion.getIdentificador()+", "+ capacitacion.getRutCliente()+", "+ capacitacion.getDia()+", "+ capacitacion.getHora()+", "+ capacitacion.getLugar()+", "+ capacitacion.getDuracion()+", "+ capacitacion.getCantAsistentes()+".");
        System.out.println(capacitacion2.getIdentificador()+", "+ capacitacion2.getRutCliente()+", "+ capacitacion2.getDia()+", "+ capacitacion2.getHora()+", "+ capacitacion2.getLugar()+", "+ capacitacion2.getDuracion()+", "+ capacitacion2.getCantAsistentes()+".");

//Integrantes: Michael Pizarro - Nelson Toledo - Gabriel Silva - Rebeca Gatica

    }
}