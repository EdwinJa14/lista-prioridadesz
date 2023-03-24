
import Controlador.PacientesController;
import Modelos.PacientesModell;
import Vistas.frmPrincipal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Javier
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        frmPrincipal VistaPrincipal= new frmPrincipal();
        PacientesModell ModeloPacientes=new PacientesModell();
        PacientesController Controlador=new PacientesController(VistaPrincipal,ModeloPacientes);
    }
    
}
