
package com.lhs.SimpleWebApp.Model;

import org.springframework.stereotype.Component;

@Component
public class Product {

    private int productId;
    private String proName;
    private int price;

    public Product(){

    }

    public Product(int productId, String proName, int price) {
        this.productId = productId;
        this.proName = proName;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", proName='" + proName + '\'' +
                ", price=" + price +
                '}';
    }
}
