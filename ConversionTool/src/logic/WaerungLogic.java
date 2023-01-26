package logic;

import model.IO;
import model.Waerung;

public class WaerungLogic {
    //Attr

    Waerung wr = new Waerung();
    double katsayi;

    //Konstruktor
    public WaerungLogic() {
    }
    //Methoden

    public void €To$() {
        System.out.println("Wert in Euro eingeben: ");
        wr.setInput(IO.getScan().nextDouble());
        System.out.println("Aktueller wert euro-dollar eingeben: ");
        katsayi=IO.getScan().nextDouble();
        wr.setOutput(wr.getInput() * katsayi);
        System.out.println("Wert in USD : " + wr.getOutput() + "\n");

    }

    public void $To€() {
        System.out.println("Wert in USD eingeben: ");
        wr.setInput(IO.getScan().nextDouble());
        System.out.println("Aktueller wert dollar-euro eingeben: ");
        katsayi=IO.getScan().nextDouble();
        wr.setOutput(wr.getInput() * katsayi);
        System.out.println("Wert in Euro : " + wr.getOutput() + "\n");

    }
}
