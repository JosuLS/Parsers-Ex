/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author 8flm01
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import org.xml.sax.helpers.DefaultHandler;

public class Ejercicio1 extends DefaultHandler{

    /**
     * @param args the command line arguments
     */ 
    
   
            
        List noticias;
        private String temp;
        private Canal canal;
        private Noticia noticia;
        
        public Ejercicio1() {
        noticias = new ArrayList();
    }

        public void run(){
    
            parse();
                    imprimir();
            
    }
        
        private void parse() {
		
        SAXParserFactory saxpar = SAXParserFactory.newInstance();

        try {           
            SAXParser sp = saxpar.newSAXParser();
            
            sp.parse("../Tuvisa.rss", this);

        } catch (SAXException saxex) {
            saxex.printStackTrace();
        } catch (ParserConfigurationException parseex) {
            parseex.printStackTrace();
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
    }
           private void imprimir()  {
            System.out.println("Noticias '" + noticias.size() + "'.");

        Iterator it = noticias.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }

}
           
           
             public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        
        temp = "";
        if (qName.equalsIgnoreCase("item")) {
            
            noticia = new Noticia();
            
        }
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        temp = new String(ch, start, length);
    }
           
           
           
           
           
           public void endElement(String uri, String localName, String qName) throws SAXException {

        if (qName.equalsIgnoreCase("item")) {
            
            noticias.add(noticia);

        } else if (qName.equalsIgnoreCase("title") && noticia !=null ) {
            noticia.setTitle(temp);
        } else if (qName.equalsIgnoreCase("link")&& noticia !=null) {
            noticia.setLink(temp);
        } else if (qName.equalsIgnoreCase("pubdate")&& noticia !=null) {
            noticia.setDate(temp);
        }else if (qName.equalsIgnoreCase("guid")&& noticia !=null) {
            noticia.setGuid(temp);
        }

    }

    
    
 
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("**Noticias Tuvisa***");
        System.out.println("");

        Ejercicio1 sax = new Ejercicio1();
        sax.run();
        
    }
 

 
}
  