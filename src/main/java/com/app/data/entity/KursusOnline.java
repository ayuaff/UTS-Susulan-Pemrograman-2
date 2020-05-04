/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.data.entity;

/**
 *
 * @author dani
 */
public class KursusOnline {
    private String InstrukturID;
    private String Nama;
    private String Keahlian;
    private String NamaKursus;
    private String Rate;

    public KursusOnline() {
    }

    public KursusOnline(String InstrukturID, String Nama, String Keahlian, String NamaKursus, String Rate) {
        this.InstrukturID = InstrukturID;
        this.Nama = Nama;
        this.Keahlian = Keahlian;
        this.NamaKursus = NamaKursus;
        this.Rate = Rate;
    }

    public String getInstrukturID() {
        return InstrukturID;
    }

    public void setInstrukturID(String InstrukturID) {
        this.InstrukturID = InstrukturID;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getKeahlian() {
        return Keahlian;
    }

    public void setKeahlian(String Keahlian) {
        this.Keahlian = Keahlian;
    }

    public String getNamaKursus() {
        return NamaKursus;
    }

    public void setNamaKursus(String NamaKursus) {
        this.NamaKursus = NamaKursus;
    }

    public String getRate() {
        return Rate;
    }

    public void setRate(String Rate) {
        this.Rate = Rate;
    }
    
    
    
}
