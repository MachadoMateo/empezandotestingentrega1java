package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReservaValidacionTest {
    ReservaValidacion reservaValidacion;

    @BeforeEach
    public void configurarPruebas(){
        System.out.println("Se esta ejecutando la prueba");
        this.reservaValidacion = new ReservaValidacion();
    }

    @Test
    public void formatoFechaIncorrecto(){
        //preparo pongo la semilla
        String prueba = "11/29/2023";
        //ejecuto
        Exception respuesta = Assertions.assertThrows(Exception.class, ()-> this.reservaValidacion.validarFechaRes(prueba));
        Assertions.assertEquals(Mensaje.FORMATO_FECHA.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void formatoFechaCorrecto(){
        //preparo pongo la semmilla
        String prueba = "10-22-2023";
        //ejecuto
        Exception respuesta = Assertions.assertThrows(Exception.class, ()-> this.reservaValidacion.validarFechaRes(prueba));
        Assertions.assertEquals(Mensaje.FORMATO_FECHA.getMensaje(),respuesta.getMessage());
    }


    @Test
    public void maximoPersonasIncorrecto(){
        String prueba = "4";
        Boolean respuesta = Assertions.assertDoesNotThrow(()-> this.reservaValidacion.validarNumeroPer(prueba));
        Assertions.assertTrue(respuesta);
    }

}