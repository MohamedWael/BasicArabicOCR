/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arabic.ocr;

import java.io.File;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 *
 * @author Mohamed
 */
public class ProcessImage {

    private File imageFile;
    private String result;

    ProcessImage(File imageFile) {

        try {
            this.imageFile = imageFile;
            System.out.println("image loaded!");
        } catch (Exception e) {
            System.out.println("something went wrong!\nhere are the detailes: ");
            System.err.println(e.getMessage());
        }

    }

    /**
     * @return the result
     */
    public String getResult() {
        try {
            Tesseract instance = Tesseract.getInstance();
            //System.out.println("Tesseract instance has beeen gotten");
            System.out.println("extracting text...");
            instance.setDatapath("D:\\FCIS\\Dropbox\\FCIS\\2st term 4th year\\Computer Arabization and Language Technology\\Tools\\Tesseract\\tesseract-ocr\\tessdata");
            instance.setLanguage("ara");
            result = instance.doOCR(imageFile);
            //System.out.println(result);

        } catch (TesseractException e) {
            System.out.println("something went wrong!\nhere are the detailes:");
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("something went wrong!\nhere are the detailes: ");
            System.err.println(e.getMessage());
        }

        return result;
    }

}
