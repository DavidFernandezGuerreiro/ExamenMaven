
package com.mycompany.examenmaven;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import static org.jsoup.nodes.Document.OutputSettings.Syntax.html;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * En esta clase están los métodos de la aplicación.
 * Métodos: titlePage y fuenteHTML.
 * 
 * @author dfernandezguerreiro
 */
public class ClassJsoup {
    
    //https://aboullaite.me/jsoup-html-parser-tutorial-examples/
    /**
     * En el siguiente método recuperamos el título de la página web.
     * 
     * @param url Es URL de la página web.
     * @param doc Leemos el título de una página web específica
     * @throws IOException 
     */
    public void titlePage() throws IOException{
        String url="https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP";
        Document doc=Jsoup.connect(url).get();
        String title=doc.title();
        System.out.println(title);
        
    }
    
    //https://aboullaite.me/jsoup-html-parser-tutorial-examples/
    //https://stackoverflow.com/questions/9335044/get-element-by-class-in-jsoup
    /**
     * En el siguiente método imprime el tiempo.
     * @param webPage La URL de la pagina web.
     * @param tiempoNumero Imprime el tiempo en grados.
     * @param fraseTiempo Imprime una frase del tiempo.
     * 
     * @throws IOException 
     */
    public void fuenteHTML() throws IOException{
        String webPage="https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP";
        String html=Jsoup.connect(webPage).get().html();
        
        Document doc = Jsoup.parse(html);
        Elements tiempoNumero=doc.getElementsByClass("today_nowcard-temp").not(".pad_10").not(".pad_20");
        Elements fraseTiempo=doc.getElementsByClass("today_nowcard-phrase").not(".pad_10").not(".pad_20");
        System.out.println(tiempoNumero.text());
        System.out.println(fraseTiempo.text());
    }
    
    


  
    
}
