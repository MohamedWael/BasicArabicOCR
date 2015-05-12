# BasicArabicOCR
A very basic Arabic OCR based on tesseract OCR engine written in Java.

### How to run
Firstly, downlaad the following files and extract them.

[Arabic OCR](https://github.com/MohamedWael/BasicArabicOCR/archive/master.zip)

[Tess4J-2.0-src_2.zip](https://www.dropbox.com/s/cb9jwpogk0w8tzi/Tess4J-2.0-src_2.zip?dl=0)

[tesseract-ocr-3.02.ara.tar.gz](https://www.dropbox.com/s/t10y587ry3oo0sp/tesseract-ocr-3.02.ara.tar.gz?dl=0)

Secondly, open the project "Arabic OCR" using the NetBeans IDE and then right click on the Libraries directory
--> add jar/folder browse to the lib directory in the tess4j project and add the fowllowing jar files

- ghost4j-0.5.1.jar
- jai_imageio.jar
- jna.jar
- win32-x86-64

repeat the previous process to add the "tess4j.jar" file located in the Tess4J\dist directory

finally, open the class "ProcessImage.java" and find the "instance.setDatapath" using ctrl+f and paste the path of the tessdata directory located in the tesseract-ocr\tessdata


