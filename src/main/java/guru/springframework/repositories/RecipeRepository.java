package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
/*
 * created by Hermann Sterling on 10/10/20
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
