<%-- 
    Document   : controlador.jsp
    Created on : 09/04/2014, 04:47:58 AM
    Author     : ECORAE
--%>
<%@page import="com.lewissa.jhano.cliente.CCliente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Controlador</title>
    </head>
    <body>
        <%
            try {
                String strCiruc = (request.getParameter("ciruc") != null) ? request.getParameter("ciruc") : "0";
                String strNombrecomer = (request.getParameter("nombrecomer") != null) ? request.getParameter("nombrecomer") : "0";
                String strNombrefiscal = (request.getParameter("nombrefiscal") != null) ? request.getParameter("nombrefiscal") : "0";
                String strDireccion = (request.getParameter("direccion") != null) ? request.getParameter("direccion") : "0";
                String strConvencional = (request.getParameter("convencional") != null) ? request.getParameter("convencional") : "0";
                String strCelular = (request.getParameter("celular") != null) ? request.getParameter("celular") : "0";
                String strCorreo = (request.getParameter("correo") != null) ? request.getParameter("correo") : "0";
                String strTipocliente = (request.getParameter("tipocliente") != null) ? request.getParameter("correo") : "0";
                switch (Integer.parseInt(request.getParameter("tipocliente"))) {
                    case 1: {
                        strTipocliente = "tc001";
                        break;
                    }
                    case 2: {
                        strTipocliente = "tc002";
                        break;
                    }
                    case 3: {
                        strTipocliente = "tc003";
                        break;
                    }
                }
                com.lewissa.jhano.cliente.WsLogicaNegocioCliente_Service service = new com.lewissa.jhano.cliente.WsLogicaNegocioCliente_Service();
                com.lewissa.jhano.cliente.WsLogicaNegocioCliente port = service.getWsLogicaNegocioClientePort();// TODO initialize WS operation arguments here
                CCliente cliCliente = new CCliente();
                cliCliente.setStrIdCliente(strCiruc);
                cliCliente.setStrCelular(strCelular);
                cliCliente.setStrConvencional(strConvencional);
                cliCliente.setStrCorreo(strCorreo);
                cliCliente.setStrDireccion(strDireccion);
                cliCliente.setStrNombreComercial(strNombrecomer);
                cliCliente.setStrNombreFiscal(strNombrefiscal);
                cliCliente.setStrTipoCliente(strTipocliente);
                // TODO process result here
                java.lang.Boolean result = port.actualizaDataBaseCliente(cliCliente);
                out.println("Result = " + result);
                request.getSession().setAttribute("cliente", result);

            } catch (Exception e) {
                out.print("ERROR: " + e.getMessage());
            }
        %>
    </body>
</html>


