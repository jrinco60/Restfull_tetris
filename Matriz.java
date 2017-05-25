/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;

/**
 * Matriz tablero con valores por defecto<br>
 * 
 * @author Administrador
 */
public class Matriz {

    private String[][] BoardNi;

    /**
     * Get tablero con cambios guardados.
     * @return Tablero inicializado 
     */
    public String[][] getBoard() {
        return BoardNi;
    }

    /**
     * Set el tablero con todos los cambios que se realizan.
     * @param Board Recibe el tablero modificado por los metodos
     */
    public void setBoard(String[][] Board) {
        this.BoardNi = Board;
    }

    /**
     * Inicializar el tablero con valor por defecto
     * @return Tablero con los valores por defecto para inicializar
     */
    public String[][] iniBoard() {
        String[][] tablero = {          
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"X", "X", "X", "X", "X", "X", "X", "X", "X", "X"}
        };
        setBoard(tablero);
        return tablero;
    }
}
