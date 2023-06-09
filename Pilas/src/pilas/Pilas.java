package pilas;

/**
 *
 * @author josep
 */
public class Pilas {

    public static void main(String[] args) {
        Pila pila = new Pila(4);
        pila.push(8);
        pila.push(9);
        System.out.println("el valor extraido es: " + pila.pop());
        System.out.println("el valor extraido es: " + pila.pop());
        System.out.println("el valor extraido es: " + pila.pop());
        pila.push(7);
        pila.push(6);
        /*if (pila.pilaLlena(0)) {
            
        } else {
        }
        /*System.out.println("el segundo valor extraido es: " + pila.pop());*/
        pila.mostrarPila();

    }

}
