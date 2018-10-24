/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author sasch
 */
public class AppointmentModell extends AbstractListModel <Appointment> {
    private ArrayList<Appointment> list;

    public AppointmentModell() {
        list=new ArrayList();
    }
    public AppointmentModell(ArrayList<Appointment> l) {
        list=l;
    }
    
    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public Appointment getElementAt(int i) {
        return list.get(i);
        
    }
    public void add(Appointment a){
        list.add(a);
        fireContentsChanged(this,0,list.size());
    }
    public void set(Appointment a,int i){
        list.set(i, a);
        fireContentsChanged(this,0,list.size());
    }
    public void remove(int i){
        list.remove(i);
        fireContentsChanged(this,0,list.size());
    }
}
