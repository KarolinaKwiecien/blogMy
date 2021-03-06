package pl.karolinakwiecien.blog.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.karolinakwiecien.blog.models.CommentModel;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository<CommentModel, Integer> {
    List<CommentModel> findByPostIdOrderByIdDesc(int id);
}
