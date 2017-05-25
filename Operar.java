/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;

/**
 * Metodos operativos en la ejecución del tablero<br>
 * USO:
 * <pre>
 *        Metodos que modifican el estado del tablero.
 * </pre>
 *
 * @author jean.rincon
 */
public class Operar {

    /**
     * Detecta ficha en su maximo de movimiento y la convierte en X
     *
     * @param Board Tablero con la ficha en el limite de movimiento,
     * @return Tablero con la ficha convertida a X.
     */
    public String[][] colideFicha(String[][] Board) {
        for (int z = 0; z < Board.length; z++) {
            for (int w = 0; w < Board[z].length; w++) {
                if ((Board[z][w]).equals("O")) {
                    Board[z][w] = "X";
                    Board[z - 1][w] = "X";
                }
            }
        }
        return Board;
    }

    /**
     * Dibujar tablero y ficha en consola.
     *
     * @param Board Tablero con la ficha para ser representada en consola
     */
    public void dibujar(String[][] Board) {
        for (int z = 0; z < Board.length; z++) {
            System.out.println("");
            System.out.print("*|");
            for (int w = 0; w < Board[z].length; w++) {
                System.out.print(Board[z][w]);
            }
            System.out.print("|*");
        }
        System.out.println("");
    }

    /**
     * Limpiar ficha repetida en su movimiento en el tablero.
     *
     * @param Board tablero con ficha en cada uno de sus moviemientos, limpiar
     * para que solo se vea una ficha.
     * @return Tablero con sola la ficha representada una vez.
     */
    public String[][] limpiar(String[][] Board) {
        for (int z = 0; z < Board.length; z++) {
            for (int w = 0; w < Board[z].length; w++) {
                if ((Board[z][w]).equals("O")) {
                    Board[z][w] = " ";
                }
            }
        }
        return Board;
    }

    private final Matriz uno;
    boolean bajar;

    /**
     * Get la variable bajar.
     *
     * @return valor de la variable bajar.
     */
    public boolean isBajar() {
        return bajar;
    }

    /**
     * Set la variable bajar.
     *
     * @param bajar Valor de la variable bajar.
     */
    public void setBajar(boolean bajar) {
        this.bajar = bajar;
    }

    /**
     * Constructor varable uno de la clase Matriz
     */
    public Operar() {
        uno = new Matriz();
    }

    /**
     * Bajar ficha en el tablero
     *
     * @param Board Estado del tablero
     * @param ficha Ficha a bajar
     * @param b valor de la posición a bajar en el tablero.
     * @return Tablero con el valor de la ficha representada.
     */
    public String[][] bajar(String[][] Board, String[][] ficha, int b) {
        for (int x = 0; x < ficha.length; x++) {
            for (int y = 0; y < ficha[x].length; y++) {
                if (ficha[x][y] != null) {
                    String posicion = ficha[x][y];
                    String[] strposicion = posicion.split(",");
                    int[] intposicion = new int[strposicion.length];
                    for (int i = 0; i < strposicion.length; i++) {
                        intposicion[i] = Integer.parseInt(strposicion[i]);
                    }
                    if ((Board[intposicion[0] + b][intposicion[1]]).equals(" ")) {
                        Board[intposicion[0] + b][intposicion[1]] = "O";
                        setBajar(true);
                    } else {
                        Board[intposicion[0] + b][intposicion[1]] = "O";
                        setBajar(false);
                        uno.setBoard(Board);
                    }
                }
            }
        }
        return Board;
    }

    /**
     * Eliminar Líneas completas horizaontalmente en el tablero
     * @param Board tablero con la posición de las fichas
     * @return Tablero con las líneas completas eliminadas
     */
    public String[][] eliminarLinea(String[][] Board) {
        return Board;
    }

    /**
     * Trae String con valor de la ficha desde WebService
     *
     * @param orden recibe el valor de la ficha en String para ser convertido
     * @return Retorna al tablero la ficha convertida en Matriz
     */
    public String[][] traerFicha(String orden) {

        int d2 = (int) (Math.random() * 7 + 1);
        String[][] ficha = null;
        FichaClient client = new FichaClient();
        String resultado;
        switch (d2) {
            case (1):
                resultado = client.ficha1(String.class, String.valueOf(orden));
                System.out.println("Resultado  (1) : " + resultado);
                ficha = convertirFicha(resultado);
                break;
            case (2):
                resultado = client.ficha1(String.class, String.valueOf(orden));
                System.out.println("Resultado  (2) : " + resultado);
                ficha = convertirFicha(resultado);
                break;

            case (3):
                resultado = client.ficha1(String.class, String.valueOf(orden));
                System.out.println("Resultado  (3) : " + resultado);
                ficha = convertirFicha(resultado);
                break;
            case (4):
                resultado = client.ficha1(String.class, String.valueOf(orden));
                System.out.println("Resultado  (4) : " + resultado);
                ficha = convertirFicha(resultado);
                break;
            case (5):
                resultado = client.ficha1(String.class, String.valueOf(orden));
                System.out.println("Resultado  (5) : " + resultado);
                ficha = convertirFicha(resultado);
                break;
            case (6):
                resultado = client.ficha1(String.class, String.valueOf(orden));
                System.out.println("Resultado  (6) : " + resultado);
                ficha = convertirFicha(resultado);
                break;
            case (7):
                resultado = client.ficha1(String.class, String.valueOf(orden));
                System.out.println("Resultado  (7) : " + resultado);
                ficha = convertirFicha(resultado);
                break;
        }
        return ficha;
    }

    /**
     * Metodo para convertir String a Matriz
     *
     * @param resultado String resultado enviado por el Web service
     * @return Ficha convertida a Matriz
     */
    public String[][] convertirFicha(String resultado) {
        String[][] ficha = new String[4][4];
        String[] row = resultado.split("/");
        for (int i = 0; i < row.length; i++) {
            String td2 = row[i];
            String td[] = td2.split("-");
            for (int j = 0; j < td.length; j++) {
                ficha[i][j] = td[j];
                if (ficha[i][j].equals("X")) {
                    ficha[i][j] = null;
                }
            }
        }
        return ficha;
    }

}
