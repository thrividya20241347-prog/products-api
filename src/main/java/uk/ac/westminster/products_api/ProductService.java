package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    //empty list to store project objects
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;


    //Both child classes inherit their common fields from Product, and Jackson uses the inherited public getters to include them in the JSON response.


    //polymorphism-A variable of a parent class type can refer to an object of a child class.
    //here the product class gets the object values too from teh child class
    //adding initially 2 products to be seen when running
    public ProductService() {

        products.add(new DigitalProduct(
                nextId++,
                "Clean Code (E-book)",
                29.99,
                "/downloads/clean-code.pdf",
                4.2
        ));

        products.add(new PhysicalProduct(
                nextId++,
                "27-inch Monitor",
                249.99,
                5.4,
                "61cm x 41cm x 18cm"
        ));
    }


    //show all products
    public List<Product> getAllProducts() {

        return products;
    }

    //add new product
    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }


    //Find a product using its ID
    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }


    //Delete a product
    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }


    //Search products by name
    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }

}
