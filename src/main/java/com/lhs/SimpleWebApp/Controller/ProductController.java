package com.lhs.SimpleWebApp.Controller;


import com.lhs.SimpleWebApp.Model.Product;
import com.lhs.SimpleWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service ;

    //How Fatch data
    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    //How Fatch data By Id
    @GetMapping ("/products/{productId}")
    public Product getProductById(@PathVariable int productId){
        return service.getProductById(productId);
    }

    //How Add data
    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        System.out.println(product);
        service.addProduct(product);
    }

    //How Update the data
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        System.out.println("It is update ");
        service.updateProduct(product);
    }

    //How Delete data
    @DeleteMapping("/products/{productId}")
    public void deleteProduct(@PathVariable int  productId)
    {
        System.out.println("it is delete ");
        service.deleteProduct(productId);

    }

}
