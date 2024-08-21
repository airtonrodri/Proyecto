/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class modelo {

    public String getRespuesta(String input) {
        if (input.equalsIgnoreCase("Hola")) {
            return "¡Hola! ¿En qué puedo ayudarte hoy?\n"
                    + "1. Productos\n"
                    + "2. Horarios\n"
                    + "3. Redes sociales\n"
                    + "4. Otras consultas";
        } else if (input.equalsIgnoreCase("1")) {
            return "Información sobre productos: Aquí puedes encontrar detalles sobre nuestros productos.";
        } else if (input.equalsIgnoreCase("2")) {
            return "Información sobre horarios: Nuestros horarios son de 9 AM a 6 PM de lunes a viernes.";
        } else if (input.equalsIgnoreCase("3")) {
            return "Redes sociales: Síguenos en Facebook, Twitter e Instagram para las últimas novedades.";
        } else if (input.equalsIgnoreCase("4")) {
            return "Otras consultas: ¿En qué más puedo ayudarte?";
        } else {
            return "Opción no válida. Por favor, selecciona una opción del 1 al 4.";
        }
    }
}
