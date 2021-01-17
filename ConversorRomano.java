package roman;

public class ConversorRomano {
    public static Object intToRoman(int numero) {
        String retorno = "";
        int getDigitoVar = getDigito(numero, 1);
        retorno = getNumeroRomano("I", "V", "X", getDigitoVar);

        if (numero >= 10) {
            String sdecena = getNumeroRomano("X", "L", "C", getDigito(numero, 2));
            retorno = sdecena + retorno;
        }
        if (numero >= 100) {
            String scentena = getNumeroRomano("C", "D", "M", getDigito(numero, 3));
            retorno = scentena + retorno;
        }
        
        return retorno;
    }

    public static int getDigito(int numero, int posicion) {
        String snum = Integer.toString(numero);
        return Integer.parseInt("" + snum.charAt(snum.length() - posicion));
    }

    public static String getNumeroRomano(String unidad, String cinco,
                                         String decena, int numero) {
        String retorno = "";
        switch (numero) {
            case 0:
            case 1:
            case 2:
            case 3:
                retorno = componeNumero(unidad, numero);
                break;
            case 4:
                retorno = unidad + cinco;
                break;
            case 5:
                retorno = cinco;
                break;
            case 6:
            case 7:
            case 8:
                retorno = cinco + componeNumero(unidad, numero - 5);
                break;
            case 9:
                retorno = unidad + decena;
                break;
        }
        return retorno;
    }

    public static String componeNumero(String simbolo, int cantidad) {
        String resultado = "";
        for (int i = 0; i < cantidad; i++) {
            resultado += simbolo;
        }
        return resultado;
    }
}
