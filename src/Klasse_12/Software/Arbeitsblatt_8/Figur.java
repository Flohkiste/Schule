public class Figur {
    private String aBezeichnung;
    private int aXPos;
    private int aYPos;

    public Figur(){}

    public void setBezeichnung(String pBezeichnung){
        aBezeichnung = pBezeichnung;
    }
    
    public String getBezeichnung(){
        return aBezeichnung;
    }

    public void setXPos(int pXPos){
        aXPos = pXPos;
    }

    public void setYPos(int pYPos){
        aYPos = pYPos;
    }

    public int getXPos(){
        return aXPos;
    }

    public int getYPos(){
        return aYPos;
    }
}
