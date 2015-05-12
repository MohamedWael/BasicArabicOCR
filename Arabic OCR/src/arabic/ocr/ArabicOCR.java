/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arabic.ocr;

import java.io.*;
import net.sourceforge.tess4j.*;

/**
 *
 * @author Mohamed
 */
public class ArabicOCR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainFrame x = new MainFrame();
        /*try {
            File imageFile = new File("test1.jpg");
            System.out.println("image loaded!");
            Tesseract instance = Tesseract.getInstance();
            //Tesseract1 instance = new Tesseract1();
            //System.out.println("Tesseract instance has beeen gotten");
            System.out.println("extracting text...");
            instance.setDatapath("D:\\FCIS\\Dropbox\\FCIS\\2st term 4th year\\Computer Arabization and Language Technology\\Tools\\Tesseract\\tesseract-ocr\\tessdata");
            instance.setLanguage("ara");
            String result = instance.doOCR(imageFile);
            System.out.println(result);

        } catch (TesseractException e) {
            System.out.println("something went wrong!\nhere are the detailes:");
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("something went wrong!\nhere are the detailes: ");
            System.err.println(e.getMessage());
        }*/
    }

}
