/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

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

public class Ejercicio2 extends DefaultHandler {

    List aenet;
    private String Temp;
    private aenet prediccion;

    public Ejercicio2() {
        aenet = new ArrayList();
    }

    public void run() {
        parse();
        imprimir();

    }

    private void parse() {

        SAXParserFactory saxpar = SAXParserFactory.newInstance();

        try {
            SAXParser sp = saxpar.newSAXParser();

            sp.parse("http://www.aemet.es/xml/municipios/localidad_01059.xml", this);

        } catch (SAXException saxex) {
            saxex.printStackTrace();
        } catch (ParserConfigurationException parseex) {
            parseex.printStackTrace();
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
    }

    private void imprimir() {
        System.out.println("Dia '" + prediccion.size() + "'.");

        Iterator it = prediccion.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        Temp = "";
        if (qName.equalsIgnoreCase("dia")) {

            prediccion = new aenet();
            prediccion.setFecha(attributes.getValue("fecha"));

        }else if (qName.equalsIgnoreCase("prov_precipitacion"))
        { 
            prediccion.getRangotiemp().add(attributes.getValue(qName))
        }
                
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        Temp = new String(ch, start, length);
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {

        if (qName.equalsIgnoreCase("Dia")) {

            aenet.add(prediccion);

        } else if (qName.equalsIgnoreCase("prob_precipitacion") && prediccion != null) {

            prediccion.setProbPrec1(Temp);

        } else if (qName.equalsIgnoreCase("temperatura") && prediccion != null) {
            prediccion.setTempMax(Temp);
        } else if (qName.equalsIgnoreCase("sens_termica") && prediccion != null) {
            prediccion.setSensTMax(Temp);
        } else if (qName.equalsIgnoreCase("Maxima") && prediccion != null) {
            prediccion.setSensTMin(Temp);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("**Predicion Tiempo Vitoria***");
        System.out.println("");

        Ejercicio2 sax = new Ejercicio2();
        sax.run();

    }

}
