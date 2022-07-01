package ru.ribenjyeo.springboot_blog.repo;

import org.springframework.data.repository.CrudRepository;
import ru.ribenjyeo.springboot_blog.models.Post;


public interface PostRepository extends CrudRepository<Post, Long> {

}
