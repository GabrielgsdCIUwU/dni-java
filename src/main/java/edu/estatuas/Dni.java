package edu.estatuas;


public class Dni {

    private byte lengthDni = 9;
    private final String cif;

    private TablaAsignacion tabla = new TablaAsignacion();

    Dni(String dni) {
        this.cif = dni;
    }

    String getDni() {
        return this.cif;
    }

    String getLetter() {
        String dni = getDni();
        return dni.substring(0, dni.length() - 1);
    }

    String getNumber() {
        String dni = getDni();
        return dni.substring(dni.length() - 1);
    }

    Boolean isInputDniValid() {
        String dni = getDni();
        return dni != null && !dni.trim().isEmpty();
    }

    Boolean isLengthDniValid() {
        return getDni().length() == this.lengthDni;
    }

    public Boolean isDniValid() {
        return isInputDniValid() && isLengthDniValid()
                && String.valueOf(tabla.calculateLetter(getNumber())).equals(getLetter());
    }

}
