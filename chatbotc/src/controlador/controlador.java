/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.modelo;
import vista.vista;

/**
 *
 * @author airto
 */
public class controlador {

    private modelo Modelo;
    private vista Vista;

    public controlador(modelo Modelo, vista Vista) {
        this.Modelo = Modelo;
        this.Vista = Vista;

// Agregando el ActionListener al botón Enviar
        this.Vista.enviarPregunta(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procesarPregunta();
            }

        // Método para procesar la pregunta
            private void procesarPregunta() {
                String pregunta = Vista.getPregunta();
                Vista.mostrarRespuestaUsuario(pregunta); 
                String respuesta = Modelo.getRespuesta(pregunta);
                Vista.mostrarRespuesta(respuesta);
            }
        });
            
    }
}
