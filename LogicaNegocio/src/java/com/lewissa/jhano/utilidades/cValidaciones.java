
package com.lewissa.jhano.utilidades;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cValidaciones {

    /**
     * Método que peermite validar que el correo electronico utiliza los
     * parametro correctos.
     *
     * @author Wilmer Moina, Esteban Borja
     * @param strEmail, Strinque que posee el correo electronico a verificar.
     * @return Booleano, contiene la verificacion del metodo.
     *  PATTERN_EMAIL, Variable que poosee, restricciones del correo.
     */
    public Boolean validaEmail(String strEmail) {

        String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
        Matcher matcher = pattern.matcher(strEmail);
        return matcher.matches();
    }

    /**
     * Método que permite validar que una cédula sea correcta.
     *
     * @author Wilmer Moina, Esteban Borja
     * @param strCedula, String que contiene la cédula a verficar.
     * @return Booleano, Booleano que contiene verificación de si la cédula
     * cumple con las requisitos correspondientes.
     */
    public Boolean validaCedula(String strCedula) {
        String PATTERN_EMAIL = "([0-9]{10})";
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
        Matcher matcher = pattern.matcher(strCedula);
        Boolean booFlag = false;
        if (matcher.matches()) {
            Integer intCedula = Integer.parseInt(strCedula);
            Integer vecCedula[] = new Integer[10];
            for (int i = 9; i >= 0; i--) {
                vecCedula[i] = intCedula % 10;
                intCedula /= 10;
            }
            booFlag = validaCedulaDigitoVerificador(vecCedula, 2, 0, 0);
        }
        return booFlag;
    }

    /**
     * Método que permite validar que un RUC sea correcto.
     *
     * @author Wilmer Moina, Esteban Borja
     * @param strRuc, String que contiene el ruc a verificar.
     * @return Booleano, Retorna si el correo verificado es o no correcto.
     */
    public Boolean validaRuc(String strRuc) {
        String PATTERN_RUC = "([0-9]{10})*[0]*[0]*[1]";
        Pattern pattern = Pattern.compile(PATTERN_RUC);
        Matcher matcher = pattern.matcher(strRuc);
        return matcher.matches();
    }

    /**
     * Método que comprueba la cédula, utilizando el dígito verificar.
     *
     * @author Wilmer Moina, Esteban Borja
     * @param vecCedula, Vector que contendra la cédula.
     * @param intMul, Integer que permite calcular el dígito verificador.
     * @param intControl, Integer de control que llevara el número de veces que
     * se realizo la recursividad, controla que se haya recorrido todo elvector.
     * @param intVerificador, Integer de contendra el digito verificar,
     * utilizado para la comparacion con el ultimo dígito de la cédula.
     * @return Booleano, Retorna si el dígito verificador encontrado es o no
     * correcto.
     */
    private Boolean validaCedulaDigitoVerificador(Integer[] vecCedula, Integer intMul, Integer intControl, Integer intVerificador) {
        Integer intMulti;
        if (intControl == 9) {
            while (intVerificador >= 0) {
                intVerificador -= 10;
            }
            intVerificador *= -1;
            return intVerificador == vecCedula[intControl];
        } else {
            intMulti = intMul * vecCedula[intControl];
            if (intMulti >= 10) {
                intMulti -= 9;
            }
            intVerificador += intMulti;
            if (intMul == 2) {
                return validaCedulaDigitoVerificador(vecCedula, 1, ++intControl, intVerificador);
            } else {
                return validaCedulaDigitoVerificador(vecCedula, 2, ++intControl, intVerificador);
            }
        }
    }

}
