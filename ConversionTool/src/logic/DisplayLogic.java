package logic;

import model.Display;
import model.IO;

public class DisplayLogic {

    //Attribute
    public String menuSelect;
    public String subMenuSelect;
    public boolean wantsBackOrQuit = false;
    Display dp = new Display();

    //Konstruktor
    public DisplayLogic() {

    }

    //Methoden
    public void mainMenu() {
        do {
           System.out.println("Willkommen beim Konverter");
           System.out.println("\n    Bitte auswählen: ");
            dp.menuShow();
            
            menuSelect = IO.getScan().next();
            switch (menuSelect) {
                //Längenmaße
                case "1":
                    submenuDist();
                    wantsBackOrQuit = false;
                    break;
                //Gewicht
                case "2":
                    submenuGew();
                    wantsBackOrQuit = false;
                    break;
                //Temparatur
                case "3":
                    submenuTem();
                    wantsBackOrQuit = false;
                    break;
                //Währung
                case "4":
                    submenuWähr();
                    wantsBackOrQuit = false;
                    break;
                //Datenmenge
                case "5":
                    submenuDat();
                    wantsBackOrQuit = false;
                    break;
                //Zahlensystem
                case "6":
                    submenuZahl();
                    wantsBackOrQuit = false;
                    break;
                //Beenden
                case "7":
                    dp.submenuEndShow();
                    break;
                default:
                    System.out.println("Ungültige Eingabe");
                    break;

            }
        } while (!wantsBackOrQuit);

    }

    //Untermenü Längenmaße
    public void submenuDist() {
        do {
            
            dp.submenuDistShow();
            System.out.println("\nBitte auswählen: ");
            subMenuSelect = IO.getScan().next();
            switch (subMenuSelect) {
                //Aufruf der Methode m -> cm
                case "1":
                    new MetricLaengeLogic().mToCm();
                    break;
                //Aufruf der Methode m -> mm
                case "2":
                    new MetricLaengeLogic().mToMm();
                    break;
                //Aufruf der Methode cm -> m
                case "3":
                    new MetricLaengeLogic().CmToM();
                    break;
                //Aufruf der Methode cm -> mm
                case "4":
                    new MetricLaengeLogic().CmToMm();
                    break;
                //Aufruf der Methode mm -> m
                case "5":
                    new MetricLaengeLogic().MmToM();
                    break;
                //Aufruf der Methode mm -> cm
                case "6":
                    new MetricLaengeLogic().MmToCm();
                    break;
                //Zurück
                case "7":
                    wantsBackOrQuit = true;
                    break;
                default:
                    System.out.println("Ungültige Eingabe");
                    break;
            }
        } while (!wantsBackOrQuit);
    }

    //Untermenü Gewichte
    public void submenuGew() {
        do {
            dp.submenuGewShow();
            System.out.println("\nBitte auswählen: ");
            subMenuSelect = IO.getScan().next();
            switch (subMenuSelect) {
                //Aufruf der Methode kg -> g
                case "1":
                    new MetricGewichtLogic().KgTog();
                    break;
                //Aufruf der Methode kg -> mg
                case "2":
                    new MetricGewichtLogic().KgToMg();
                    break;
                //Aufruf der Methode g -> kg
                case "3":
                    new MetricGewichtLogic().GToKg();
                    break;
                //Aufruf der Methode g -> mg
                case "4":
                    new MetricGewichtLogic().GToMg();
                    break;
                //Aufruf der Methode mg -> kg
                case "5":
                    new MetricGewichtLogic().MgToKg();
                    break;
                //Aufruf der Methode mg -> g
                case "6":
                    new MetricGewichtLogic().MgToG();
                    break;
                //Zurück
                case "7":
                    System.out.println("Zurück");
                    wantsBackOrQuit = true;
                    break;
                default:
                    System.out.println("Ungültige Eingabe!!!");
                    break;
            }
        } while (!wantsBackOrQuit);
    }

    //Untermenü Temparatur
    public void submenuTem() {
        do {
            dp.submenuTemShow();
            System.out.println("\nBitte auswählen: ");
            subMenuSelect = IO.getScan().next();
            switch (subMenuSelect) {
                //Aufruf der Methode °C -> °F
                case "1":
                    new TemparaturLogic().CToF();
                    break;
                //Aufruf der Methode °F -> °C
                case "2":
                    new TemparaturLogic().FToC();
                    break;
                //Zurück
                case "3":
                    System.out.println("Zurück");
                    wantsBackOrQuit = true;
                    break;
                default:
                    System.out.println("Ungültige Eingabe!!!");
                    break;
            }
        } while (!wantsBackOrQuit);
    }

    //Untermenü Währung
    public void submenuWähr() {
        do {
            dp.submenuWährShow();
            System.out.println("\nBitte auswählen: ");
            subMenuSelect = IO.getScan().next();
            switch (subMenuSelect) {
                //Aufruf der Methode €uro -> U$D
                case "1":
                    new WaerungLogic().€To$();
                    break;
                //Aufruf der Methode U$D -> €uro
                case "2":
                    new WaerungLogic().$To€();
                    break;
                //Zurück
                case "3":
                    System.out.println("Zurück");
                    wantsBackOrQuit = true;
                    break;
                default:
                    System.out.println("Ungültige Eingabe!!!");
                    break;
            }
        } while (!wantsBackOrQuit);
    }

    //Untermenü Datenmenge
    public void submenuDat() {
        do {
            dp.submenuDatShow();
            System.out.println("\nBitte auswählen: ");
            subMenuSelect = IO.getScan().next();
            switch (subMenuSelect) {
                //Aufruf der Methode kByte -> Byte
                case "1":
                    new DatenMengeLogic().kByteToByte();
                    break;
                //Aufruf der Methode kByte -> MByte
                case "2":
                    new DatenMengeLogic().kByteToMByte();
                    break;
                //Aufruf der Methode Byte -> kByte
                case "3":
                    new DatenMengeLogic().ByteToKByte();
                    break;
                //Aufruf der Methode Byte -> MByte
                case "4":
                    new DatenMengeLogic().ByteToMByte();
                    break;
                //Aufruf der Methode MByte -> kByte
                case "5":
                    new DatenMengeLogic().MByteToKByte();
                    break;
                //Aufruf der Methode MByte -> Byte
                case "6":
                    new DatenMengeLogic().MByteToByte();
                    break;
                //Zurück
                case "7":
                    System.out.println("Zurück");
                    wantsBackOrQuit = true;
                    break;
                default:
                    System.out.println("Ungültige Eingabe!!!");
                    break;
            }
        } while (!wantsBackOrQuit);
    }
    //Untermenü Zahlensystem

    public void submenuZahl() {
        do {
            dp.submenuZahlShow();
            System.out.println("\nBitte auswählen: ");
            subMenuSelect = IO.getScan().next();
            switch (subMenuSelect) {
                //Aufruf der Methode dez -> bin
                case "1":
                    new ZahlenSystemLogic().DezToBin();
                    break;
                //Aufruf der Methode bin -> dez
                case "2":
                    new ZahlenSystemLogic().BinToDez();
                    break;
                //Aufruf der Methode dez -> oct
                case "3":
                    new ZahlenSystemLogic().DezToOct();
                    break;
                //Aufruf der Methode oct -> dez
                case "4":
                    new ZahlenSystemLogic().OctToDez();
                    break;
                //Aufruf der Methode dez -> hex
                case "5":
                    new ZahlenSystemLogic().DezToHex();
                    break;
                //Aufruf der Methode hex -> dez
                case "6":
                    new ZahlenSystemLogic().HexToDez();
                   break;
                //Zurück
                case "7":
                    System.out.println("Zurück");
                    wantsBackOrQuit = true;
                    break;
                default:
                    System.out.println("Ungültige Eingabe!!!");
                    break;
            }
        } while (!wantsBackOrQuit);

    }

}
