/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelos.PacientesModell;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Javier
 */
public class PacientesController implements ActionListener {
    
    
        frmPrincipal VistaPrincipal;
        PacientesModell ModeloPacientes;
    public PacientesController(frmPrincipal VistaPrincipal,PacientesModell ModeloPacientes){
        this .VistaPrincipal=VistaPrincipal;
         this.ModeloPacientes=ModeloPacientes;
         
        
    }
    //poner escucha botones
        
    
   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnIngresar){
            this.ModeloPacientes.IngresarPaciente(this.VistaPrincipal.txtApellidos.getText(),
                    this.VistaPrincipal.txtNombre.getText(),
                   Integer.parseInt(this.VistaPrincipal.txtPrioridad.getText()) );
            this.VistaPrincipal.jtTablaPacientes.setModel(this.ModeloPacientes.ListasPacientes());
               
            
        }
    }
    
}
