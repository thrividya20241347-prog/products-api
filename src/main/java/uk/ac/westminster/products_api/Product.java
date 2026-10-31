package uk.ac.westminster.products_api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "productType"
)
@JsonSubTypes({
        @JsonSubTypes.Type(
                value = DigitalProduct.class,
                name = "DIGITAL"
        ),
        @JsonSubTypes.Type(
                value = PhysicalProduct.class,
                name = "PHYSICAL"
        )
})


public abstract class Product {

    // Instance variables
    private Long id;
    private String name;
    private double price;

    // No-argument constructor
    public Product() {
    }

    // Parameterized constructor
    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract String getSummary();

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}