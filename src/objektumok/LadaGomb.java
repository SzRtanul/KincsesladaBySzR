/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objektumok;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;

/**
 *
 * @author SzabóRoland(SZF_2023
 */
public class LadaGomb extends JButton {
    byte ladaszam;
    String kepcsukva, kepnyitva;
    boolean nyitva;
    
    public LadaGomb(byte ladaszam, Color szin, int x, int y, String kepcsukva, String kepnyitva){
        this.ladaszam = ladaszam;
        this.setBackground(szin);
        this.kepnyitva = kepnyitva;
        this.kepcsukva = kepcsukva;
        
        this.setSize(new Dimension(75, 75));
        this.setLocation(x, y);
    }
    
    public void kinyit(boolean vanbenne){
        this.setText(vanbenne ? "Itt a kincs!" : "Nincs itt a kincs.");
    }
}
