package gs.micro.gs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import gs.micro.gs.model.Indicadores;

@Repository
public interface IndicadoresRepository extends IGenericRepository<Indicadores>{

	@Query("select o from Indicadores o where o.objetivos.id = :id")
	List<Indicadores> findByObjetivos(@Param("id") String id);
	
}
