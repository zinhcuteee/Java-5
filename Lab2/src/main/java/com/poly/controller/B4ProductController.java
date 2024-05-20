package com.poly.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poly.model.Product;

@Controller
public class B4ProductController {
    List<Product> products = new ArrayList<Product>();

    @GetMapping("/product/B4")
    public String form(Model model) {
        Product p = new Product();
        p.setName("Iphone11");
        p.setPrice(50.0);
        model.addAttribute("product", p);
        products = createItems();
        System.out.println(products.size());
        model.addAttribute("products", products);

        return "formB4";
    }

    public List<Product> createItems() {
        List<Product> product2 = new ArrayList<Product>();
        product2.add(new Product("Iphone1", 30.0));
        product2.add(new Product("Iphone2", 40.0));
        return product2;
    }

    @PostMapping("/product/saveB4")
    public String save(@ModelAttribute Product p, Model model) {
        products.add(p);
        model.addAttribute("products", products);
        return "formB4";
    }
    @GetMapping("/product/edit")
    public String edit(@RequestParam("index") int index, Model model) {
        Product product = products.get(index);
        model.addAttribute("product", product);
        model.addAttribute("products", products);
        return "formB4";
    }
}