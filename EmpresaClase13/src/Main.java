public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("1147895-8","Juan Pablo","Perez Perez","654987321","Provida",1,"Calle falsa 123","Santiago",36);
        Usuario usuario = new Usuario("Elvis","12/12/89","321456-8");
        Capacitacion capacitacion = new Capacitacion(1,"123456-7","Lunes","14:00","Viña","2 hrs",15);

        System.out.println(cliente.toString());
        System.out.println(usuario.toString());
        System.out.println(capacitacion.toString());

    }
}