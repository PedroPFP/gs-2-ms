package gs.micro.gs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gs.micro.gs.builder.IndicadorBuilder;
import gs.micro.gs.model.Indicadores;
import gs.micro.gs.records.IndicadorCreateDto;
import gs.micro.gs.services.IndicadoresService;

@RestController
@RequestMapping("/indicadores")
public class IndicadorController extends GenericController<Indicadores, IndicadoresService, IndicadorCreateDto, IndicadorBuilder>{

	public IndicadorController(IndicadoresService service, IndicadorBuilder builder) {
		super(service, builder);
	}
}
