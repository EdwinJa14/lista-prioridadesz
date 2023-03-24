/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.PriorityQueue;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javier
 */
public class PacientesModell {
    PriorityQueue <Pacientes>ListaPacientes =new PriorityQueue<Pacientes>();
    DefaultTableModel ModeloTabla =new DefaultTableModel();
    
    public void IngresarPaciente(String Apellidos, String Nombre, String Telefono, int gra){
       
        Pacientes nuevoPaciente =new Pacientes(Apellidos, Nombre, Telefono, gra);
        ListaPacientes.add(nuevoPaciente);
        
       
    }
    public DefaultTableModel ListasPacientes(){
            this.ModeloTabla.addColumn("Apellidos");
            this.ModeloTabla.addColumn("Nombre");
            this.ModeloTabla.addColumn("Telefono");
            this.ModeloTabla.addColumn("Gravedad");
        
        for(Pacientes MiListaPacientes:ListaPacientes){
         //System.out.println(MiListaPacientes.getApellidos());   
         this.ModeloTabla.addRow(new Object []{MiListaPacientes.getApellidos(),MiListaPacientes.getNombre(),
         MiListaPacientes.getTelefono(),MiListaPacientes.getGravedad()});
        
        }
        return ModeloTabla;
    }
}
