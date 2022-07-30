/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cme.neptune.qrcodegenerator;

import cme.neptune.qrcodegenerator.globalVars.GlobalVars;
import cme.neptune.qrcodegenerator.gui.GUI;
import java.awt.Cursor;
import javax.swing.ImageIcon;

/**
 *
 * @author elie.abdallah
 */
public class Main {

    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.setTitle("QR Code Generator");
        gui.setLocationRelativeTo(null);
        gui.setResizable(false);
        ImageIcon img = new ImageIcon(GlobalVars.imageIconPath);
        gui.setIconImage(img.getImage());
        gui.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gui.setVisible(true);
    }
}
