package logic;

import model.IO;
import model.Temparatur;

public class TemparaturLogic {
    //Attr

    Temparatur tm = new Temparatur();

    //Konstruktor
    public TemparaturLogic() {
    }
    //Methoden

    public void CToF() {
        System.out.println("Wert in °C eingeben: ");
        tm.setInput(IO.getScan().nextDouble());
        tm.setOutput(tm.getInput() * 1.8 + 32);
        System.out.println("Wert in °F : " + tm.getOutput() + "\n");

    }

    public void FToC() {
        System.out.println("Wert in °F eingeben: ");
        tm.setInput(IO.getScan().nextDouble());
        tm.setOutput((tm.getInput() - 32) * 5 / 9);
        System.out.println("Wert in °C : " + tm.getOutput() + "\n");

    }

}
