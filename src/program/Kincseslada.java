/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

/**
 *
 * @author SzabóRoland(SZF_2023
 */
public class Kincseslada {
    boolean kitalalva;
    int melyiklada;
    String[] feliratok;
    
    public Kincseslada(){
        kitalalva = false;
        melyiklada = 2;
        feliratok = new String[]{
            "Én rejtem a kincset.",
            "Nem én rejtem a kincset.",
            "Az aranyláda hazudik."
        };
    }
    
    public boolean kitalal(byte lada){
        return lada == melyiklada;
    }
    
    public boolean getKitalalva(){
        return kitalalva;
    }
    
    public String[] feliratok(){
        return feliratok;
    }
}
