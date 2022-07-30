/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cme.neptune.qrcodegenerator.utilities;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author elie.abdallah
 */
public class Utilities {

    public void generateQRcode(boolean mode, String dataToAdd, File fileToAdd, String charset, Map map, int height, int width, String path) throws WriterException, IOException {
        if (height > 0 && width > 0 && (dataToAdd.length() > 0 || fileToAdd.exists())) {
            if (mode == false) {
                BitMatrix matrix = new MultiFormatWriter().encode(new String(dataToAdd.getBytes(charset), charset), BarcodeFormat.QR_CODE, width, height);
                MatrixToImageWriter.writeToFile(matrix, path.substring(path.lastIndexOf('.') + 1), new File(path));
                JOptionPane.showMessageDialog(null, "QR Code created successfully.", "QR CODE", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // TO BE ADDED LATER ENCODE FILE TO QR CODE
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid entries!\nCheck height/width and/or data", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
