package com.pratik.InventorySearch;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController {

    @PostMapping("/inventory/search")
    @ResponseBody
    public List<Product> search(@RequestBody Product searchItem){
        List<Product> products = new ArrayList<>();
        products.add(new Product("TV","Electronics"));
        products.add(new Product("Computer","Electronics"));

        return products;
    }
}
