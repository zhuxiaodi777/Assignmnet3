/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yongxingnie
 */
public class EncounterHistory {
    private List<Encounter> encounterhis;
    
    
    public EncounterHistory(){
        encounterhis=new ArrayList<Encounter>();
    }

    public List<Encounter> getEncounterhis(){
        return encounterhis;
        
    }
    
    public Encounter addEncounter(){
        Encounter e=new Encounter();
        encounterhis.add(e);
        return e;
    }
    
    public void removeEncounter(Encounter e){
        encounterhis.remove(e);
        
    }

    
    
    
    
    
}
