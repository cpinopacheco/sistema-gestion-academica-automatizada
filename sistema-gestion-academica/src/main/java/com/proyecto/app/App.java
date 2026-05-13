package com.proyecto.app;

public class App {

    public boolean validarAsistencia(int porcentajeAsistencia) {
        return porcentajeAsistencia >= 75;
    }

    public static void main(String[] args) {

        App app = new App();

        boolean resultado = app.validarAsistencia(80);

        if (resultado) {
            System.out.println("Alumno aprobado por asistencia");
        } else {
            System.out.println("Alumno reprobado por asistencia");
        }
    }
}