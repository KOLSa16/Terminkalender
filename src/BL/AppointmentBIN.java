/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author sasch
 */
public class AppointmentBIN {
    public void writeBin(List<Appointment> l){
        //create Streams
        OutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("werte.bin"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            //write Objects
            for(Appointment cur:l){
                oos.writeObject(cur);
            }
        } catch(IOException e){
            System.err.print("Save:"+e.getMessage());
        }
        finally{
            try {
                fos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
     public ArrayList<Appointment> readBin(){
        ArrayList<Appointment> l = new ArrayList();
        
        //create Streams
        InputStream fis = null;
        try {
            fis = new FileInputStream(new File("werte.bin"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            //read until IOException is catched
            while(true){
                try {
                    l.add((Appointment)ois.readObject());
                } catch (IOException e) {
                    ois.close();
                    return l;
                }
            }
            
            
            
        } catch (Exception e) {
        }
        return null;
    }
}
