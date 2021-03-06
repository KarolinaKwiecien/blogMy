package pl.karolinakwiecien.blog.models.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.karolinakwiecien.blog.models.CategoryModel;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryModel, Integer> {

    CategoryModel findByName(String name);
}
