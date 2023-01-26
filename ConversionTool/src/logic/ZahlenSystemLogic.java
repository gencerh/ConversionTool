package logic;

import model.IO;
import model.ZahlenSystem;

public class ZahlenSystemLogic {
    //Attr

    ZahlenSystem zs = new ZahlenSystem();

    //Konstruktor
    public ZahlenSystemLogic() {
    }

    //Methoden
    public void DezToBin() {
        System.out.println("Wert in Dez eingeben: ");
        zs.setInput1(IO.getScan().nextInt());
        System.out.println("Wert in Bin : " + Integer.toBinaryString(zs.input1) + "\n");

    }

    public void BinToDez() {
        System.out.println("Wert in Bin eingeben: ");
        zs.setInput(IO.getScan().next());
        System.out.println("Wert in Dez : " + Integer.parseInt(zs.input, 2) + "\n");
    }

    public void DezToOct() {
        System.out.println("Wert in Dez eingeben: ");
        zs.setInput1(IO.getScan().nextInt());
        System.out.println("Wert in Oct : " + Integer.toOctalString(zs.input1) + "\n");

    }

    public void OctToDez() {
        System.out.println("Wert in Oct eingeben: ");
        zs.setInput(IO.getScan().next());
        System.out.println("Wert in Dez : " + Integer.parseInt(zs.input, 8) + "\n");

    }

    public void DezToHex() {
        System.out.println("Wert in Dez eingeben: ");
        zs.setInput1(IO.getScan().nextInt());
        System.out.println("Wert in Hex : " + Integer.toHexString(zs.input1) + "\n");

    }

    public void HexToDez() {
        System.out.println("Wert in Hex eingeben: ");
        zs.setInput(IO.getScan().next());
        System.out.println("Wert in Dez: " + Integer.parseInt(zs.input, 16) + "\n");

    }

}
