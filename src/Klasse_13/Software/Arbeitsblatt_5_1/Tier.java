package Arbeitsblatt_5_1;

public abstract class Tier {
    private String aName;

    public Tier(String pName) {
        aName = pName;
    }

    public String getName() {
        return aName;
    }

    public abstract void gibLaut();
}
