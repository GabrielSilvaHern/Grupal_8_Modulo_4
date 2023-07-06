Principios SOLID Grupal 17:

Principio de Responsabilidad Única
El principio de Responsabilidad Única señala que un objeto debe realizar una única cosa, 
es muy habitual que esto no se cumpla, y se acabe teniendo clases que tienen varias responsabilidades
lógicas a la vez.

R: En el ejercicio anterior Grupal 16 no se cumplia este principio por lo que tuvimos que modificar
los métodos de la clase padre y clases hijas y creamos una clase llamada MetodosUsuarios que contiene
un método estático que llamamos en la clase Main mediante un ciclo forEach.

Principio de Abierto-Cerrado
Este principio hace referencia a que una entidad de Software debería estar abierta a extensión pero
cerrada a modificación, esto significa que se debe extender el comportamiento de las clases sin
necesidad de modificar su código.
Esto ayuda a seguir añadiendo funcionalidades sin afectar el código existente.

R: En el ejercicio anterior Grupal 16 si se cumplía este principio, al agregar un usuario podiamos
seguir llamando al método de la clase Listado analizarUsario() y no se modificaba cumpliendo de
igual manera su función. En esta nueva versión y al verse modificado el código sigue ocurriendo
lo mismo el método estático de la clase MetodosUsuarios no se ve modificado al querer agregar un
nuevo usuario.

Principio de Sustitución de Liskov
El principio de sustitución de Liskov menciona que si en alguna parte del código se está usando una
clase, y esta clase es extendida, tenemos que poder utilizar cualquiera de las clases hijas y que
el programa siga siendo válido.
Esto obliga a asegurarse de que cuando se extiende una clase no se está alterando el comportamiento
de la clase padre.

R: En el ejercicio anterior no se cumplia este principio y al modificarlo por la clase padre Usuario
las instancias de las clases hijas no se ven alteradas por lo que el código funciona con normalidad.

Principio de Segregación de Interfaces
El principio de segregación de interfaces viene a decir que ninguna clase debería depender de métodos
que no usa.
Por lo tanto, cuando se crean interfaces que definan comportamientos, es importante asegurarse de que
todas las clases que implementen esas interfaces vayan a necesitar y ser capaces de agregar
comportamientos a todos los métodos.
En caso contrario, es mejor tener varias interfaces más pequeñas.

R: En el ejercicio anterior no se cumplia este principio, esta vez hemos modificado el código para
ejemplificar dicho principio.
Se ha creado la interfaz Edad que contiene el método mostrarEdad() y que solo lo implementa la clase
Cliente asi nos aseguramos que es esta clase y no otra la que aplica dicho método. Por consiguiente,
romperiamos el primer principio de responsabilidad única ya que dicha entidad tendria más de una
responsabilidad a su haber.