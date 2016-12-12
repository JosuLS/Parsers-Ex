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
public class Noticia {
    
    
    
    private String title;
    private String link;
    private String date;
    private String guid;

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link the link to set
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the guid
     */
    public String getGuid() {
        return guid;
    }

    /**
     * @param guid the guid to set
     */
    public void setGuid(String guid) {
        this.guid = guid;
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("---Noticia----");
        sb.append("Titulo: " + getTitle());
        sb.append(", ");
        sb.append("Link: " + getLink());
        sb.append(", ");
        sb.append("Fecha: " + getDate());
        sb.append(", ");
        sb.append("Guid: " + getGuid());
        sb.append(".");

        return sb.toString();
    }
    
}
