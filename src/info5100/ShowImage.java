/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Administrator
 */
public class ShowImage {
    public ImageIcon getImage(String filePath) throws IOException {
        System.out.println(filePath);
        if (filePath == null || filePath.length() == 0) {
            filePath = "C:\\Users\\Administrator\\Documents\\NetBeansProjects\\INFO5100\\src\\info5100\\empty.jpg";
        }
        final BufferedImage image = ImageIO.read(new File(filePath));
       Image scaledImage = image.getScaledInstance(500, 300, Image.SCALE_DEFAULT);
       ImageIcon icon = new ImageIcon(scaledImage);
        return icon;
    }
}
