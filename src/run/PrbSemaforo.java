/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package run;

import java.awt.EventQueue;
import vista.VentanaPrincipal;

/**
 *
 * @author osval
 */
public class PrbSemaforo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() ->
        {
            try
            {
                VentanaPrincipal ventana = new VentanaPrincipal();
                ventana.setVisible(true);
            } catch (Exception e)
            {
            }
        });
    }
    
}