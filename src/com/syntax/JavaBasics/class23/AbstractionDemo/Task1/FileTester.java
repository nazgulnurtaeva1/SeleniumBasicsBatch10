package com.syntax.JavaBasics.class23.AbstractionDemo.Task1;

public class FileTester {
    public static void main(String[] args) {
       // File file= new File()

JavaFile javaFile=new JavaFile();
javaFile.open();
javaFile.close();

File pdf=new PdfFile();
pdf.open();
pdf.edit();


        PdfFile pdffile=new PdfFile();
        pdffile.edit();
pdffile.open();

    }

}
