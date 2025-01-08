/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.claseabstracta.clases;

/**
 *
 * @author mundo
 */
public class Perro extends Caninos{
    
    @Override
    public String getNombreCientífico(){
        return " Canislupus familiaris";
    }
    
    @Override
    public String getSonido(){
        return "ladrido";
    }
    
    @Override
    public String getAlimentos(){
        return "carnívora";
    }
    
    @Override
    public String getHábitat(){
        return "doméstico";
    }
    
}
