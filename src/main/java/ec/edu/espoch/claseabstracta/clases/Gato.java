/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.claseabstracta.clases;

/**
 *
 * @author mundo
 */
public class Gato extends Felinos{
    
    @Override
    public String getNombreCientífico(){
        return "Felis silvestris catus";
    }
    
    @Override
    public String getSonido(){
        return "maullido";
    }
    
    @Override
    public String getAlimentos(){
        return "ratones";
    }
    
    @Override
    public String getHábitat(){
        return "doméstico";
    }
}
