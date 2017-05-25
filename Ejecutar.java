/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;

import java.util.*;

/**
 * Metodo para la ejecución del tablero y sus movimientos<br>
 * @author jean.rincon
 */
public class Ejecutar {

    private final Matriz uno;

    /**Constructor -- Inicializar la Matriz Tablero
     */
    public Ejecutar() {
        uno = new Matriz();
        uno.iniBoard();
    }

    /**Captura de comandos en teclado, Ejecución de metodos, Representar tablero en consola
     */
    public void correrTablero() {
        Operar di = new Operar();
        try {
            boolean lleno = true;
            do {
                String[][] ficha = di.traerFicha("traer");
                String[][] Board = uno.getBoard();
                int b = 0;
                boolean bajar;
                do {
                    Scanner leer = new Scanner(System.in);
                    System.out.print("g + Enter para Girar --- i + Enter para Izquierda --- d + Enter para derecha --- Enter para seguir");
                    String valor_menu = leer.nextLine();
                    if (valor_menu.equalsIgnoreCase("i")) {
                        ficha = di.traerFicha("izquierda");
                    } else if (valor_menu.equalsIgnoreCase("d")) {
                        ficha = di.traerFicha("derecha");
                    } else if (valor_menu.equalsIgnoreCase("g")) {
                        ficha = di.traerFicha("girar");
                    } else {
                        di.traerFicha("traer");
                    }
                    Thread.sleep(300);
                    Board = di.limpiar(Board);
                    di.bajar(Board, ficha, b);
                    bajar = di.isBajar();
                    di.dibujar(Board);
                    b++;
                } while (bajar);
                di.colideFicha(Board);
                di.dibujar(uno.getBoard());
            } while (lleno);

        } catch (InterruptedException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("GAME OVER!!!!!");
        }
    }
}
