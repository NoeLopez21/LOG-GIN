/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login;

import elementos.Correo;

/**
 *
 * @author ayele
 */
public class PruebaCorreo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Correo miCorreo = new Correo();

    // ✅ Cambia estos datos por los tuyos
    String remitente = "enriquezvalenciaoliver501@gmail.com"; // Tu correo real
    String contraseña = "cile mzdw ytpo srnu"; // Contraseña de aplicación (NO la normal)
    String destinatario = "tajinesxd@gmail.com"; // A quién va dirigido
    //String rutaArchivo = "C:\\Users\\ayele\\Downloads\\curp atzlyn .pdf";

    //String rutaHTML = "correo_generado.html";

    // Configurar el correo
    miCorreo.setRemitente(remitente, contraseña);
    miCorreo.setDestinatario(destinatario);
    miCorreo.setContenido(
        "Archivo en el cuerpo del correo",
        "ARRIBA EL PINCHE CRUZAZUL."
    );
    //miCorreo.agregarArchivo(rutaArchivo);

    try {
        // Genera un respaldo HTML del correo
        //miCorreo.crearHTML(rutaHTML);

        // Envía el correo
        miCorreo.enviarCorreo();

    } catch (Exception e) {
        System.err.println("❌ Error al enviar el correo:");
        e.printStackTrace();
    }
}
    }
    

