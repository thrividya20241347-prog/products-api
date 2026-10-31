package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();

    public ProductService() {

        // Digital product
        products.add(new DigitalProduct(
                1L,
                "E-book",
                9.99,
                "/dl/1",
                4.2
        ));

        // Physical product
        products.add(new PhysicalProduct(
                2L,
                "Keyboard",
                49.99,
                0.8,
                "45 x 15 x 4 cm"
        ));
    }

    // Return all products
    public List<Product> getAllProducts() {
        return products;
    }

    // Add a new product
    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }

    // Activity 5 - Polymorphic summaries
    public List<String> getAllSummaries() {

        List<String> summaries = new ArrayList<>();

        for (Product p : products) {
            summaries.add(p.getSummary());
        }

        return summaries;
    }
}