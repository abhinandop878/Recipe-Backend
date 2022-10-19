package com.nestDigital.recipeBackend.controller;

import com.nestDigital.recipeBackend.dao.RecipeDAO;
import com.nestDigital.recipeBackend.model.RecipeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {
    @Autowired
    private RecipeDAO dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addRecipe",consumes = "application/json",produces = "application/json")
    public String addRecipe(@RequestBody RecipeModel recipe){
        dao.save(recipe);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewRecipe")
    public List<RecipeModel> viewRecipe(){
        return (List<RecipeModel>)dao.findAll();
    }
}
