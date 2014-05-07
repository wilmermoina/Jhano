/*
 * Esta clase represnta al objeto(tabla) Proveedor
 */
package com.lewissa.jhano.proveedor;

/**
 *
 * Clase cProveedor
 * @author Miguel Mejía, Juan Moyano
 * @version 1.0 06/05/2014 
 */
public class cProveedor {

    private String strIdProveedor;
    private String strNombreFiscal;
    private String strNombreComercial;
    private String strDireccion;
    private String strConvencional;
    private String strCelular;
    private String strCorreo;

    public void setId(String strId) {
        strIdProveedor = strId;
    }

    public void setNombreFiscal(String strNombre) {
        strNombreFiscal = strNombre;
    }

    public void setNombreComercial(String strComercial) {
        strNombreComercial = strComercial;
    }

    public void setDireccion(String strDir) {
        strDireccion = strDir;
    }

    public void setConvencional(String strNumero) {
        strConvencional = strNumero;
    }

    public void setCelular(String strNumero) {
        strCelular = strNumero;
    }

    public void setCorreo(String strEmail) {
        strCorreo = strEmail;
    }

    String getId() {
        return strIdProveedor;
    }

    String getNombreFiscal() {
        return strNombreFiscal;
    }

    String getNombreComercial() {
        return strNombreComercial;
    }

    String getDireccion() {
        return strDireccion;
    }

    String getConvencional() {
        return strConvencional;
    }

    String getCelular() {
        return strCelular;
    }

    String getCorreo() {
        return strCorreo;
    }

}
