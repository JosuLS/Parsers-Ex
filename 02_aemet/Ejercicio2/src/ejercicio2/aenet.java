/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 8flm01
 */
public class aenet {
    
    private String fecha;
    private List rangotiemp = new ArrayList();
    private String Prov_prec;
    private List rangotiempNiev = new ArrayList();
    private List rangotiempCielo = new ArrayList();
    private List descCielo = new ArrayList();

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the rangotiemp
     */
    public List getRangotiemp() {
        return rangotiemp;
    }

    /**
     * @param rangotiemp the rangotiemp to set
     */
    public void setRangotiemp(List rangotiemp) {
        this.rangotiemp = rangotiemp;
    }

    /**
     * @return the Prov_prec
     */
    public String getProv_prec() {
        return Prov_prec;
    }

    /**
     * @param Prov_prec the Prov_prec to set
     */
    public void setProv_prec(String Prov_prec) {
        this.Prov_prec = Prov_prec;
    }

    /**
     * @return the rangotiempNiev
     */
    public List getRangotiempNiev() {
        return rangotiempNiev;
    }

    /**
     * @param rangotiempNiev the rangotiempNiev to set
     */
    public void setRangotiempNiev(List rangotiempNiev) {
        this.rangotiempNiev = rangotiempNiev;
    }

    /**
     * @return the rangotiempCielo
     */
    public List getRangotiempCielo() {
        return rangotiempCielo;
    }

    /**
     * @param rangotiempCielo the rangotiempCielo to set
     */
    public void setRangotiempCielo(List rangotiempCielo) {
        this.rangotiempCielo = rangotiempCielo;
    }

    /**
     * @return the descCielo
     */
    public List getDescCielo() {
        return descCielo;
    }

    /**
     * @param descCielo the descCielo to set
     */
    public void setDescCielo(List descCielo) {
        this.descCielo = descCielo;
    }
}
