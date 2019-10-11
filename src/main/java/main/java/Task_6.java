package main.java;

public class Task_6 {

    public static void main(String[] args) {

        Printer printer = new Printer();
    }

    public class Printer {

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

        public Printer (String manufacturer, String model, boolean isColor, String type, boolean isDuplex, int tonerLevelBlack, int tonerLevelMagenta, int tonerLevelYellow, int tonerLevelBlue, int printedPages) {

            this.manufacturer = manufacturer;
            this.model = model;
            this.isColor = isColor;
            this.type = type;
            this.isDuplex = isDuplex;
            this.tonerLevelBlack = tonerLevelBlack;
            this.tonerLevelMagenta = tonerLevelMagenta;
            this.tonerLevelYellow = tonerLevelYellow;
            this.tonerLevelBlue = tonerLevelBlue;
            this.printedPages = printedPages;
        }

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

        public boolean isColor() {
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

        public boolean isDuplex() {
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
            return printedPages;
        }

        public void setPrintedPages(int printedPages) {
            this.printedPages = printedPages;
        }
    }
}
