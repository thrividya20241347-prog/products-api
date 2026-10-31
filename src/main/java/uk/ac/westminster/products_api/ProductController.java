package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // GET /products
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // POST /products
    @PostMapping
    public Product addProduct(
            @RequestBody DigitalProduct product) {

        // Lab fix: accept a concrete class because Product is abstract.
        return productService.addProduct(product);
    }

    // GET /products/summaries
    @GetMapping("/summaries")
    public List<String> getSummaries() {
        return productService.getAllSummaries();
    }
}