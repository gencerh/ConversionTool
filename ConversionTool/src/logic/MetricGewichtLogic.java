package logic;

import model.IO;
import model.MetricGewicht;



public class MetricGewichtLogic {
     //Attr

    MetricGewicht mg = new MetricGewicht();

    //Konstruktor

    public MetricGewichtLogic() {
    }
    

    //Methoden
    public void KgTog() {
        System.out.println("Wert in kg eingeben: ");
        mg.setInput(IO.getScan().nextDouble());
        mg.setOutput(mg.getInput() * 1000);
        System.out.println("Wert in g : " + mg.getOutput() + "\n");

    }

    public void KgToMg() {
        System.out.println("Wert in kg eingeben: ");
        mg.setInput(IO.getScan().nextDouble());
        mg.setOutput(mg.getInput() * 1000000);
        System.out.println("Wert in mg : " + mg.getOutput() + "\n");

    }

    public void GToKg() {
        System.out.println("Wert in g eingeben: ");
        mg.setInput(IO.getScan().nextDouble());
        mg.setOutput(mg.getInput() / 1000);
        System.out.println("Wert in kg : " + mg.getOutput() + "\n");

    }

    public void GToMg() {
        System.out.println("Wert in g eingeben: ");
        mg.setInput(IO.getScan().nextDouble());
        mg.setOutput(mg.getInput() * 1000);
        System.out.println("Wert in mg : " + mg.getOutput() + "\n");

    }

    public void MgToKg() {
        System.out.println("Wert in mg eingeben: ");
        mg.setInput(IO.getScan().nextDouble());
        mg.setOutput(mg.getInput() / 1000000);
        System.out.println("Wert in kg: " + mg.getOutput() + "\n");

    }

    public void MgToG() {
        System.out.println("Wert in mg eingeben: ");
        mg.setInput(IO.getScan().nextDouble());
        mg.setOutput(mg.getInput() / 1000);
        System.out.println("Wert in g : " + mg.getOutput() + "\n");

    }
}
