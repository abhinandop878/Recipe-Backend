package com.nestDigital.recipeBackend.dao;

import com.nestDigital.recipeBackend.model.RecipeModel;
import org.springframework.data.repository.CrudRepository;

public interface RecipeDAO extends CrudRepository<RecipeModel,Integer> {
}
