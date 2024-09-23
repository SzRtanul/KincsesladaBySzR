/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objektumok;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.plaf.metal.MetalIconFactory;

/**
 *
 * @author SzabóRoland(SZF_2023
 */
public class LadaGomb extends JButton {
    byte ladaszam;
    boolean nyitva;

    public byte getLadaszam() {
        return ladaszam;
    }

    public boolean isNyitva() {
        return nyitva;
    }
    String kepcsukva, kepnyitva;
    
    public LadaGomb(byte ladaszam, Color szin, int x, int y, String kepcsukva, String kepnyitva){
        this.ladaszam = ladaszam;
        this.setBackground(szin);
        this.kepnyitva = kepnyitva;
        this.kepcsukva = kepcsukva;
        
        this.setSize(new Dimension(75, 75));
        this.setLocation(x, y);
        URL csukva = LadaGomb.class.getClassLoader().getResource("kepek/csukva.jpeg");
        Image resized = getScaledImage(new ImageIcon(csukva).getImage(), this.getWidth() - 5, this.getHeight() - 10);
        this.setIcon(new ImageIcon(resized));
    }
    
    public void kinyit(boolean vanbenne){
       // this.setText(vanbenne ? "Itt a kincs!" : "Nincs itt a kincs.");
        URL nyitvaures = LadaGomb.class.getClassLoader().getResource("kepek/nyitvaures.jpg");
        URL nyitva = LadaGomb.class.getClassLoader().getResource("kepek/nyitva.jpg");
        Image resized = getScaledImage(new ImageIcon(vanbenne ? nyitva : nyitvaures).getImage(), this.getWidth() - 5, this.getHeight() - 10);
        this.setIcon(new ImageIcon(resized));
    }
    
    private Image getScaledImage(Image srcImg, int w, int h){
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();
        return resizedImg;
    }
}
