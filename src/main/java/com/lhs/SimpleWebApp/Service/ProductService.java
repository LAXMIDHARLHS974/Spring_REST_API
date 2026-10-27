package com.lhs.SimpleWebApp.Service;

import com.lhs.SimpleWebApp.Model.Product;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products =new ArrayList<>( Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Mac Book", 82000),
            new Product(103, "Samsung Galaxy S24", 75000),
            new Product(104, "Dell Laptop", 65000),
            new Product(105, "HP Laptop", 58000),
            new Product(106, "iPad", 40000),
            new Product(107, "Apple Watch", 35000),
            new Product(108, "AirPods", 18000),
            new Product(109, "Sony Headphones", 12000),
            new Product(110, "OnePlus Phone", 30000)
    ));

    //How Fatch data

    public List<Product> getProducts(){
        return products;
    }

    //How Fatch data by Id
    public Product getProductById(int productId) {
        return products.stream()
                .filter(p -> p.getProductId() == productId )
                .findFirst().get();
    }

    //How add data
    public void addProduct(Product product){
    products.add(product);
    }

    //How update data
    public void updateProduct(Product product) {
        int index=0;
        for(int i=0;i<products.size();i++)
            if(products.get(i).getProductId() == product.getProductId())
                index=i;
        products.set(index,product);
    }

    //How Delete data
    public void deleteProduct(int productId) {
        int index=0;
        for(int i=0;i<products.size();i++)
            if(products.get(i).getProductId() == productId)
                index=i;
        products.remove(index);
    }
}
