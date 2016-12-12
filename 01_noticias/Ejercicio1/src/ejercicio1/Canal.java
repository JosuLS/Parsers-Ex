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
public class Canal {
    
    private String title;
    private String link;
    private String desc;
    private String lang;

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
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the lang
     */
    public String getLang() {
        return lang;
    }

    /**
     * @param lang the lang to set
     */
    public void setLang(String lang) {
        this.lang = lang;
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("---Canal----");
        sb.append("Titulo:" + getTitle());
        sb.append(", ");
        sb.append("Link:" + getLink());
        sb.append(", ");
        sb.append("Descripcion:" + getDesc());
        sb.append(", ");
        sb.append("Idioma:" + getLang());
        sb.append(".");

        return sb.toString();
    }
    
}
