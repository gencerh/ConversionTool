package model;


public class MetricLaenge {
    //Attr
    private double input;
    private double output;

    //Kons
    public MetricLaenge() {
    }
    
    //Methoden
    /*
    get: sich holen : zugriff : reinschauen : bekommen : anfordern : zurückgeben --> Datentype
    set: einsetzen : breitstellen : einstellen : speichern : festlegen  -->void
    */
    public double getInput (){
        return input;
    }
    public void setInput(double input){
        this.input = input;
    }
    public double getOutput(){
        return output;
    }
     public void setOutput(double output){
        this.output = output;
    }
    
}
