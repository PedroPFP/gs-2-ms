package gs.micro.gs.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gs.micro.gs.builder.IndicadorBuilder;
import gs.micro.gs.model.Objetivos;
import gs.micro.gs.records.IndicadorCreateDto;
import gs.micro.gs.records.IndicadorDto;
import gs.micro.gs.repository.IGenericRepository;
import gs.micro.gs.repository.IndicadoresRepository;

@Service
public class ObjetivosService extends GenericService<Objetivos>{
	
	@Autowired
	private IndicadoresRepository indicadoresRepository;
	
	@Autowired IndicadorBuilder builder;
	

	public ObjetivosService(IGenericRepository<Objetivos> repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	public List<String> findIds() {
		List<String> results = new ArrayList<>();
		this.repository.findAll().stream().map(obj -> results.add(obj.getId()));
		return results;
	}

	public List<IndicadorDto> findIndicadores(String id) {
		List<IndicadorDto> results = this.indicadoresRepository.findByObjetivos(id).stream().map(builder::toDto).collect(Collectors.toList());
		return results;
	}
	
}
