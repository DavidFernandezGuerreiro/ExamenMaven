
package com.mycompany.examenmaven;

import java.io.IOException;

/**
 * Esta en la clase Principal. Donde llamo a los metodos de la clase.
 * 
 * @author dfernandezguerreiro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ClassJsoup obx=new ClassJsoup();
        obx.titlePage();
        obx.fuenteHTML();
    }
    
}
