package com.syntax.JavaBasics.class17.ReviewAccessModifiersConstructors;

public class Mobile {
    private static int secondaryMemory;
    private String company;
    private String model;
    public int mainMemory;
    private String Modeeel;

    public Mobile(String companyyyy, String model,int mainMemory, int secondaryMemory) {

      this.model=model;
      this.mainMemory=mainMemory;
      this.secondaryMemory=secondaryMemory;
          this.company=companyyyy;
}

public void printInfo() {
        System.out.println(company+model+mainMemory+secondaryMemory);
    }
protected void printModel() {
        System.out.println(mainMemory+secondaryMemory);
    }
    protected static void printModeeel() {
        System.out.println(secondaryMemory);
    }


    public void printCompany() {
        System.out.println(company);
    }


    public static void main(String[] args) {
          Mobile mobile=new Mobile("Samsung", "Galaxy10", 64, 128);
mobile.printInfo();
    }
}
 class MobileTester{
    public static void main(String[] args) {
Mobile mobile = new Mobile("Samsung", "Galaxy10", 64, 128  );

    }

}