package logic;

import model.IO;
import model.MetricLaenge;

public class MetricLaengeLogic {
    //Attr

    MetricLaenge ml = new MetricLaenge();

    //Konstruktor
    public MetricLaengeLogic() {
    }

    //Methoden
    public void mToCm() {
        System.out.println("Wert in meter eingeben: ");
        ml.setInput(IO.getScan().nextDouble());
        ml.setOutput(ml.getInput() * 100);
        System.out.println("Wert in cm : " + ml.getOutput() + "\n");

    }

    public void mToMm() {
        System.out.println("Wert in meter eingeben: ");
        ml.setInput(IO.getScan().nextDouble());
        ml.setOutput(ml.getInput() * 1000);
        System.out.println("Wert in mm : " + ml.getOutput() + "\n");

    }

    public void CmToM() {
        System.out.println("Wert in cm eingeben: ");
        ml.setInput(IO.getScan().nextDouble());
        ml.setOutput(ml.getInput() / 100);
        System.out.println("Wert in meter : " + ml.getOutput() + "\n");

    }

    public void CmToMm() {
        System.out.println("Wert in cm eingeben: ");
        ml.setInput(IO.getScan().nextDouble());
        ml.setOutput(ml.getInput() * 10);
        System.out.println("Wert in mm : " + ml.getOutput() + "\n");

    }

    public void MmToM() {
        System.out.println("Wert in mm eingeben: ");
        ml.setInput(IO.getScan().nextDouble());
        ml.setOutput(ml.getInput() / 1000);
        System.out.println("Wert in meter : " + ml.getOutput() + "\n");

    }

    public void MmToCm() {
        System.out.println("Wert in mm eingeben: ");
        ml.setInput(IO.getScan().nextDouble());
        ml.setOutput(ml.getInput() / 10);
        System.out.println("Wert in cm : " + ml.getOutput() + "\n");

    }

}
