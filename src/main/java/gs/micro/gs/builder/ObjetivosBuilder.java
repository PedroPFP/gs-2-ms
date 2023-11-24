package gs.micro.gs.builder;

import org.springframework.stereotype.Component;

import gs.micro.gs.model.Objetivos;
import gs.micro.gs.records.ObjetivoCreateDto;

@Component
public class ObjetivosBuilder implements IGenericBuilder<Objetivos, ObjetivoCreateDto>{

	@Override
	public Objetivos toEntity(ObjetivoCreateDto dto) {
		return new Objetivos(dto.id());
	}

	@Override
	public ObjetivoCreateDto toAllDto(Objetivos entity) {
		return new ObjetivoCreateDto(entity.getId());
	}

}
