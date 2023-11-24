package gs.micro.gs.services;

import java.util.List;
import java.util.Optional;

public interface IGenericService<T> {
	List<T> findAll();
	Optional<T> findById(long id);
	T save(T entity);
	void delete(Long id);
}
