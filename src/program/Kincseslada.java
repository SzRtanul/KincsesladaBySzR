/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.awt.Color;

/**
 *
 * @author SzabóRoland(SZF_2023
 */
public class Kincseslada {
    boolean kitalalva;
    int melyiklada;
    String[] feliratok;
    Szinek[] szinek;

    public String[] getFeliratok() {
        return feliratok;
    }

    public Szinek[] getSzinek() {
        return szinek;
    }
    
    public Kincseslada(){
        kitalalva = false;
        melyiklada = 2;
        feliratok = new String[]{
            "Én rejtem a kincset.",
            "Nem én rejtem a kincset.",
            "Az aranyláda hazudik."
        };
        szinek = new Szinek[]{
            Szinek.ARANY, Szinek.EZUST, Szinek.BRONZ
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
    
    public Color getSzinek(Szinek szin){
        Color gombszin = new Color(0, 0, 0);
        switch (szin) {
            case ARANY:
                break;
            case EZUST:
                break;
            case BRONZ:
                break;
        }
        return gombszin;
    }
    
    enum Szinek{
        ARANY,
        EZUST,
        BRONZ
    }
}
