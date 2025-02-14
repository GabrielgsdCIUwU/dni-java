package edu.estatuas;

public class TablaAsignacion {

    private final char[] tabla = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
            'V', 'H', 'L', 'C', 'K', 'E' };

    

    char[] getTable() {
        return this.tabla;
    }

    char getLetterFromPositionTable(int position) throws ArrayIndexOutOfBoundsException {
        try {
            return getTable()[position];
        } catch (ArrayIndexOutOfBoundsException exception) {
            throw new ArrayIndexOutOfBoundsException(
                    "Posicion fuera de los límites de la tabla asignación");
        }
    }

    char calculateLetter(String dni) {
        int position = Integer.valueOf(dni) % getTable().length;
        return getLetterFromPositionTable(position);
    }
}
