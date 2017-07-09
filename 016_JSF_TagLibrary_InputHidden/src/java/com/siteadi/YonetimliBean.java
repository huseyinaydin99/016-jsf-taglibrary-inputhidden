/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author husey
 */
@ManagedBean
@RequestScoped
public class YonetimliBean {

    /**
     * Creates a new instance of YonetimliBean
     */
    private String verilecekMesaj = "Maraba ben hüseyin";
    public YonetimliBean() {
    }

    public String getVerilecekMesaj() {
        return verilecekMesaj;
    }

    public void setVerilecekMesaj(String verilecekMesaj) {
        this.verilecekMesaj = verilecekMesaj;
    }
    
    
    
}
