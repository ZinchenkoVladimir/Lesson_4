package main.java;

public class Task_6 {

    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.setTonerLevelBlack(100);
        printer.setTonerLevelBlue(100);
        printer.setTonerLevelMagenta(50);
        printer.setTonerLevelYellow(100);
        printer.setColor(true);
        printer.setDuplex(true);
        printer.setPrintedPages(0);
        printer.setManufacturer("Какая-то китайщина, склёпанная левой пяткой бухого дядюшки Лу");
        printer.setModel("Terminator T-1000");
        printer.setType("Test");

        printer.print();

        System.out.println("Hello! I'm Superprinter\nMy manufacturer is " + printer.getManufacturer() +
                "\nMy model is " + printer.getModel() +
                "\nMy type is " + printer.getType() +
                "\nI printed " + printer.getPrintedPages() +
                " pages\nAfter printing toner levels are:\nBlack " + printer.getTonerLevelBlack() +
                "\nBlue " + printer.getTonerLevelBlue() +
                "\nMagenta " + printer.getTonerLevelMagenta() +
                "\nYellow " + printer.getTonerLevelYellow());
    }
}

class Printer {

    private String manufacturer;
    private String model;
    private boolean isColor;
    private String type;
    private boolean isDuplex;
    private int tonerLevelBlack;
    private int tonerLevelMagenta;
    private int tonerLevelYellow;
    private int tonerLevelBlue;
    private int printedPages;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean getIsColor() {
        return isColor;
    }

    public void setColor(boolean color) {
        isColor = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getIsDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }

    public int getTonerLevelBlack() {
        return tonerLevelBlack;
    }

    public void setTonerLevelBlack(int tonerLevelBlack) {
        this.tonerLevelBlack = tonerLevelBlack;
    }

    public int getTonerLevelMagenta() {
        return tonerLevelMagenta;
    }

    public void setTonerLevelMagenta(int tonerLevelMagenta) {
        this.tonerLevelMagenta = tonerLevelMagenta;
    }

    public int getTonerLevelYellow() {
        return tonerLevelYellow;
    }

    public void setTonerLevelYellow(int tonerLevelYellow) {
        this.tonerLevelYellow = tonerLevelYellow;
    }

    public int getTonerLevelBlue() {
        return tonerLevelBlue;
    }

    public void setTonerLevelBlue(int tonerLevelBlue) {
        this.tonerLevelBlue = tonerLevelBlue;
    }

    public int getPrintedPages() {
        return this.printedPages;
    }

    public void setPrintedPages(int printedPages) {
        this.printedPages = printedPages;
    }

    public int print() {

            if (isColor) {
                while (tonerLevelBlue > 0 && tonerLevelMagenta > 0 && tonerLevelYellow > 0) {
                    printedPages ++;
                    tonerLevelBlue --;
                    tonerLevelMagenta --;
                    tonerLevelYellow --;
                }
            }
            else
                while (tonerLevelBlack > 0) {
                    printedPages ++;
                    tonerLevelBlack --;
                }

        return printedPages = isDuplex ? (printedPages * 2) : printedPages;

    }
}

