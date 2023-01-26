package model;

public class Display {
    //Attribute

    public int[] menuNumber = {1, 2, 3, 4, 5, 6, 7};
    public String[] menuTitle = {"Längenmaßer", "Gewichte", "Temparatur", "Währung", "Datenmenge", "Zahlensystem", "Beenden."};
//"Von m zu cm", "Von m zu mm", "Von cm zu m", "Von cm zu mm", "Von mm zu m", "Von mm zu cm", "zurück"
    public int[] submenuDistNumber = {1, 2, 3, 4, 5, 6, 7};
    public String[] subMenuDistTitle = {"Von m zu cm", "Von m zu mm", "Von cm zu m", "Von cm zu mm", "Von mm zu m", "Von mm zu cm", "Zurück zum Hauptmenü"};
//"Von kg zu g", "Von kg zu mg", "Von g zu kg", "Von g zu mg", "Von mg zu kg", "Von mg zu g", "zurück"
    public int[] submenuGewNumber = {1, 2, 3, 4, 5, 6, 7};
    public String[] subMenuGewTitle = {"Von kg zu g", "Von kg zu mg", "Von g zu kg", "Von g zu mg", "Von mg zu kg", "Von mg zu g", "Zurück zum Hauptmenü"};
//"Von °C zu °F", "Von °F zu °C", "zurück"
    public int[] submenuTemNumber = {1, 2, 3};
    public String[] subMenuTemTitle = {"Von °C zu °F", "Von °F zu °C", "Zurück zum Hauptmenü"};
//"Von €uro nach U$D", "Von U$D nach €uro", "zurück"
    public int[] submenuWährNumber = {1, 2, 3};
    public String[] subMenuWährTitle = {"Von Euro nach USD", "Von USD nach Euro", "Zurück zum Hauptmenü"};
//"Von kByte zu Byte", "Von kByte zu MByte", "Von Byte zu kByte", "Von Byte zu MByte", "Von MByte zu kByte", "Von MByte zu Byte", "zurück"
    public int[] submenuDatNumber = {1, 2, 3, 4, 5, 6, 7};
    public String[] subMenuDatTitle = {"Von kByte zu Byte", "Von kByte zu MByte", "Von Byte zu kByte", "Von Byte zu MByte", "Von MByte zu kByte", "Von MByte zu Byte", "Zurück zum Hauptmenü"};
//"Von dez zu bin", "Von bin zu dez", "Von dez zu oct", "Von oct zu dez", "Von dez zu hex", "Von hex zu dez", "zurück"
    public int[] submenuZahlNumber = {1, 2, 3, 4, 5, 6, 7};
    public String[] subMenuZahlTitle = {"Von dez zu bin", "Von bin zu dez", "Von dez zu oct", "Von oct zu dez", "Von dez zu hex", "Von hex zu dez", "Zurück zum Hauptmenü"};

    //Konstruktor
    public Display() {
    }

    //Methoden
    //zeigt das Hauptmenü an
    public void menuShow() {
        for (int i = 0; i < menuNumber.length; i++) {
            System.out.println(menuNumber[i] + ". " + menuTitle[i]);
        }
    }
//Zeigt das Untermenü für Längenmaße

    public void submenuDistShow() {
        for (int i = 0; i < submenuDistNumber.length; i++) {
            System.out.println(submenuDistNumber[i] + ". " + subMenuDistTitle[i]);
        }
    }
    //Zeigt das Untermenü für Gewichte

    public void submenuGewShow() {
        for (int i = 0; i < submenuGewNumber.length; i++) {
            System.out.println(submenuGewNumber[i] + ". " + subMenuGewTitle[i]);
        }
}
    //Zeigt das Untermenü für Temparatur

    public void submenuTemShow() {
        for (int i = 0; i < submenuTemNumber.length; i++) {
            System.out.println(submenuTemNumber[i] + ". " + subMenuTemTitle[i]);
        }
}
     //Zeigt das Untermenü für Währung

    public void submenuWährShow() {
        for (int i = 0; i < submenuWährNumber.length; i++) {
            System.out.println(submenuWährNumber[i] + ". " + subMenuWährTitle[i]);
        }
}
     //Zeigt das Untermenü für Datenmenge

    public void submenuDatShow() {
        for (int i = 0; i < submenuDatNumber.length; i++) {
            System.out.println(submenuDatNumber[i] + ". " + subMenuDatTitle[i]);
        }
}
     //Zeigt das Untermenü für Zahlensystem

    public void submenuZahlShow() {
        for (int i = 0; i < submenuZahlNumber.length; i++) {
            System.out.println(submenuZahlNumber[i] + ". " + subMenuZahlTitle[i]);
        }
}
     //Zeigt das Untermenü für Beenden

    public void submenuEndShow() {
       System.exit(0);
}
    
}
    
