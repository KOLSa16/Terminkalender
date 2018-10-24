/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author sasch
 */
public class Appointment implements Serializable {
    LocalDate datum;
    LocalTime zeit;
    String text;
    DateTimeFormatter fmdate = DateTimeFormatter.ofPattern("dd.MM.YYYY");
    DateTimeFormatter fmtime = DateTimeFormatter.ofPattern("hh:mm");
    public Appointment(String tag,String monat,String jahr,String stunde,String minute,String text) {
        this.datum = LocalDate.parse(tag+"."+monat+"."+jahr,fmdate);
        this.zeit = LocalTime.parse(stunde+":"+minute,fmtime);
        this.text=text;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public LocalTime getZeit() {
        return zeit;
    }

    public void setZeit(LocalTime zeit) {
        this.zeit = zeit;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

//    @Override
//    public String toString() {
//        return 
//    }
    
}
