package com.dirmod;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TraductorTest {
    Traductor prueba;


    @Before
    public void inicializar(){
        this.prueba = new Traductor();
    }

    @Test
    public void translateText (){
        String testeo = prueba.translate("a");
        assertEquals("2", testeo);
    }

    @Test
    public void translateNumber (){
        String testeo = prueba.translate("1");
        assertEquals("11", testeo);
    }

    @Test
    public void translateBoth (){
        String testeo = prueba.translate("a1b2");
        assertEquals("21122 2222", testeo);
    }

    @Test
    public void translateVoid (){
        String testeo = prueba.translate("");
        assertEquals("No se ingreso texto", testeo);
    }
}
