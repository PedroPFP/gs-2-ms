package gs.micro.gs.services;

import org.springframework.stereotype.Service;

import gs.micro.gs.model.Indicadores;
import gs.micro.gs.repository.IGenericRepository;
import lombok.RequiredArgsConstructor;

@Service
public class IndicadoresService extends GenericService<Indicadores>{

	public IndicadoresService(IGenericRepository<Indicadores> repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

}
