package org.example;

public class ClaseCadena {
    // contenga un método DevuelveIniciales que permita devolver las iniciales de los nombres y apellidos que se pasan como argumento en forma de cadena
   //metodo principal

    public String DevuelveIniciales(String cadena) {
        cadena = reducirEspacios(cadena);
        if (esNumero(cadena)) {
            return "No se puede introducir numeros";
        } else if (tieneEspacio(cadena)) {
            return DevuelveIniciales2(cadena);
        } else {
            return "Falta el nombre o el apellido";
        }
    }


    public String DevuelveIniciales2(String cadena) {
            String[] palabras = cadena.split(" ");
            String iniciales = "";
            for (String palabra : palabras) {
                iniciales += palabra.charAt(0);
                iniciales += ".";
            }
            return convertirMayusculas(iniciales);
    }

    /*
    public boolean EsPalindromo(String cadena) {
        String cadenaSinEspacios = cadena.replace(" ", "");
        String cadenaInvertida = new StringBuilder(cadenaSinEspacios).reverse().toString();
        return cadenaSinEspacios.equalsIgnoreCase(cadenaInvertida);
    }*/

    // trim() elimina los espacios en blanco al principio y al final de la cadena
    public boolean estaVacia(String cadena) {
        return cadena.trim().isEmpty();
    }

    //otro meotod para comprobar que la cadena tenga dos partes separadas por un espacio
    public boolean tieneEspacio(String cadena) {
        return cadena.contains(" ");
    }

    //si introduce una cadena en minusculas, la convierte a mayusculas
    // asi las iniciales se devuelven en mayusculas y lo aplicacmos al metodo DevuelveIniciales2
    public String convertirMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    public String reducirEspacios(String cadena) {
        if (cadena == null || estaVacia(cadena)) {
            System.out.println("La cadena está vacía");
            return cadena;
        }

        // Verificar si hay uno o más espacios en blanco
        else if (cadena.matches(".*\\s+.*")) {
            // Aplicar el método replaceAll() para reducir los espacios a uno solo
            cadena = cadena.replaceAll("\\s+", " ");
        }

        return cadena;
    }



    //metodo para comprobar si la cadena de string son relamente numeros
    public boolean esNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //

}
