package Klasse_12.Software.Arbeitsblatt_11;

public class Person {
    protected String aName;
    protected String aVorname;
    protected char aPersonenGruppe;

    public Person(char pPersonenGruppe){
        this.aPersonenGruppe = pPersonenGruppe;
    }

    public String getName() {
        return this.aName;
    }

    public void setName(String pName) {
        this.aName = pName;
    }

    public String getVorname() {
        return this.aVorname;
    }

    public void setVorname(String pVorname) {
        this.aVorname = pVorname;
    }

}
