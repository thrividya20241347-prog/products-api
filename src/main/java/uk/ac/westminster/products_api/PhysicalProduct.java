
package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it is an item
// sold by the shop, with an ID, name and price.
// A ShoppingCart HAS products; it is not itself a Product.

public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {

        super(id, name, price);

        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    @Override
    public String getSummary() {
        return "Physical: " + getName()
                + " | Weight: " + weightKg + " kg";
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}

