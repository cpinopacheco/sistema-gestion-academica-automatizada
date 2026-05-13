package com.proyecto.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    void validarAsistenciaAprobada() {

        App app = new App();

        boolean resultado = app.validarAsistencia(80);

        assertTrue(resultado);
    }

    @Test
    void validarAsistenciaReprobada() {

        App app = new App();

        boolean resultado = app.validarAsistencia(60);

        assertFalse(resultado);
    }
}