package logic;

import model.IO;
import model.DatenMenge;


public class DatenMengeLogic {
      //Attr

    DatenMenge dm = new DatenMenge();

    //Konstruktor

    public DatenMengeLogic() {
    }

    //Methoden
    public void kByteToByte() {
        System.out.println("Wert in kByte eingeben: ");
        dm.setInput(IO.getScan().nextDouble());
        dm.setOutput(dm.getInput() * 1024);
        System.out.println("Wert in Byte : " + dm.getOutput() + "\n");

    }

    public void kByteToMByte() {
        System.out.println("Wert in kByte eingeben: ");
        dm.setInput(IO.getScan().nextDouble());
        dm.setOutput(dm.getInput() * 0.0009765625);
        System.out.println("Wert in MByte : " + dm.getOutput() + "\n");

    }

    public void ByteToKByte() {
        System.out.println("Wert in Byte eingeben: ");
        dm.setInput(IO.getScan().nextDouble());
        dm.setOutput(dm.getInput() * 0.0009765625);
        System.out.println("Wert in KByte : " + dm.getOutput() + "\n");

    }

    public void ByteToMByte() {
        System.out.println("Wert in Byte eingeben: ");
        dm.setInput(IO.getScan().nextDouble());
        dm.setOutput(dm.getInput() * 9.5367431640625E-7);
        System.out.println("Wert in MByte : " + dm.getOutput() + "\n");

    }

    public void MByteToKByte() {
        System.out.println("Wert in MByte eingeben: ");
        dm.setInput(IO.getScan().nextDouble());
        dm.setOutput(dm.getInput() * 1024);
        System.out.println("Wert in KByte: " + dm.getOutput() + "\n");

    }

    public void MByteToByte() {
        System.out.println("Wert in MByte eingeben: ");
        dm.setInput(IO.getScan().nextDouble());
        dm.setOutput(dm.getInput() * 1048576);
        System.out.println("Wert in Byte : " + dm.getOutput() + "\n");

    }
}
