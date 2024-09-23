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
        boolean both = lada == melyiklada;
        kitalalva = kitalalva || lada == melyiklada;
        return both;
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
                gombszin = new Color(209, 186, 60);
                break;
            case EZUST:
                gombszin = new Color(193, 181, 161);
                break;
            case BRONZ:
                gombszin = new Color(196, 142, 42);
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
