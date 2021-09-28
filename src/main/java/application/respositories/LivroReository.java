package application.respositories;
import org.springframework.data.repository.CrudRepository;

import application.models.Livro;
public interface LivroReository extends 
 CrudRepository<Livro, Integer> {
    
}
