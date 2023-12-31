package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class LocalValidacion {

    private Util util = new Util();
    boolean validarNit(String nit)throws Exception{
        if (util.buscarCoincidencia(nit,"^[0-9]+$" )){
            throw new Exception(Mensaje.FORMATO_LOCAL.getMensaje());
        }
        if (nit.length()!=10){
            throw new Exception(Mensaje.LONGITUD_NIT.getMensaje());
        }return true;
    }

    boolean validarNombre(String nombre)throws Exception{
        if (!util.buscarCoincidencia(nombre,"^[a-zA-Z0-9 ]+$" )){
            throw new Exception(Mensaje.FORMATO_NOMBRE.getMensaje());

        }
        if (nombre.length()>=30){
            throw new Exception(Mensaje.LONGITUD_NOMBRE.getMensaje());
        }return true;
    }




}


