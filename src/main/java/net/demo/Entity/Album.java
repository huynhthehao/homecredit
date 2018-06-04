package net.demo.Entity;

public class Album {
    String ID;
    int numberofPaage;
    String albumName;
    String companyOwner;

    public Album(){}

    public Album(String ID, int numberofPaage, String albumName, String companyOwner) {
        this.ID = ID;
        this.numberofPaage = numberofPaage;
        this.albumName = albumName;
        this.companyOwner = companyOwner;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getNumberofPaage() {
        return numberofPaage;
    }

    public void setNumberofPaage(int numberofPaage) {
        this.numberofPaage = numberofPaage;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getCompanyOwner() {
        return companyOwner;
    }

    public void setCompanyOwner(String companyOwner) {
        this.companyOwner = companyOwner;
    }
}
