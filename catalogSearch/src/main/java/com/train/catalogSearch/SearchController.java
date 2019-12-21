package com.train.catalogSearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController {

    @RequestMapping(method = RequestMethod.POST, value = "/search/catalog")
    @ResponseBody
    public List<Product> searchCatalog(@RequestBody SearchItem searchItem){

        List<Product> products = new ArrayList<>();
        products.add(new Product("phone","Electronics"));
        products.add(new Product("Television","Electronics"));
        products.add(new Product("Computer","Electronics"));
        products.add(new Product("Shirt","Garments"));

        return products;
    }
}
