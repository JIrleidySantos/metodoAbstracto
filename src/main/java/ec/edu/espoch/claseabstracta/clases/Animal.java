/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.claseabstracta.clases;

/**
 *
 * @author mundo
 */
public abstract class Animal {
    protected String sonido;
    protected String alimentos;
    protected String habitad;
    protected String nombreCientifico;
    
    public abstract String getNombreCientífico();
    
    public abstract String getSonido();
    
    public abstract String getAlimentos();
    
    public abstract String getHábitat();

    
}
