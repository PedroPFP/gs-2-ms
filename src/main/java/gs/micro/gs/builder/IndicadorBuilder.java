package gs.micro.gs.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gs.micro.gs.model.Indicadores;
import gs.micro.gs.records.IndicadorCreateDto;
import gs.micro.gs.records.IndicadorDto;

@Component
public class IndicadorBuilder implements IGenericBuilder<Indicadores, IndicadorCreateDto>{

	@Autowired
	private ObjetivosBuilder objBuilder;
	
	@Override
	public Indicadores toEntity(IndicadorCreateDto dto) {
		return new Indicadores(dto.id(), objBuilder.toEntity(dto.objetivoDto()), dto.descricao());
	}

	@Override
	public IndicadorCreateDto toAllDto(Indicadores entity) {
		return new IndicadorCreateDto(entity.getId(), objBuilder.toAllDto(entity.getObjetivos()), entity.getDescricao());
	}
	
	public IndicadorDto toDto(Indicadores entity) {
		return new IndicadorDto(entity.getId(), entity.getDescricao());
	}
	

}
