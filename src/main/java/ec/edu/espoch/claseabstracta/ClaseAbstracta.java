/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.claseabstracta;

import ec.edu.espoch.claseabstracta.clases.Animal;
import ec.edu.espoch.claseabstracta.clases.Gato;
import ec.edu.espoch.claseabstracta.clases.Leon;
import ec.edu.espoch.claseabstracta.clases.Lobo;
import ec.edu.espoch.claseabstracta.clases.Perro;

/**
 *
 * @author mundo
 */
public class ClaseAbstracta {

    public static void main(String[] args) {
        
        Animal [] animales = new Animal [4];
        
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();
        
        for (int i = 0; i < animales.length; i++) {
            System.out.println("El nombre cientifico es; "+animales[i].getNombreCientífico());
            System.out.println("El alimento es; "+animales[i].getAlimentos());
            System.out.println("El habitad es; "+animales[i].getHábitat());
            System.out.println("El sonido es; "+animales[i].getSonido());
        }
    }
}
 