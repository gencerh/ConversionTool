package model;

public class ZahlenSystem {

    public String input;
    public String output;
    public int input1;
    public int output1;

    //Kons
    public ZahlenSystem() {
    }

    //Methoden
    /*
    get: sich holen : zugriff : reinschauen : bekommen : anfordern : zurückgeben --> Datentype
    set: einsetzen : breitstellen : einstellen : speichern : festlegen  -->void
     */
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
     public int getInput1() {
        return input1;
    }

    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public int getOutput1() {
        return output1;
    }

    public void setOutput1(int output1) {
        this.output1 = output1;
    }

}
