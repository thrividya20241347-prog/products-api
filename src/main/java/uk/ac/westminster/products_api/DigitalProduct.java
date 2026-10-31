package uk.ac.westminster.products_api;

//inheritance application "extends"
public class DigitalProduct extends Product {

    private String downloadUrl;
    private double fileSizeMB;


    //default constructor- Because sometimes we want to create an object without immediately giving it any information.
    public DigitalProduct(){

    }

    // parameterized constructor
    public DigitalProduct(Long id, String name, double price, String downloadUrl, double fileSizeMB){
        //calling parent class constructors- giving objects its starting values
        super (id, name, price);

        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;

    }

    //adding getters to read those values added in constrictor
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }


    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String getSummary() {
        return "Digital: " + getName()
                + " | Download: " + downloadUrl;
    }

}
