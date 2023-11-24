package gs.micro.gs.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gs.micro.gs.builder.ObjetivosBuilder;
import gs.micro.gs.model.Objetivos;
import gs.micro.gs.records.IndicadorDto;
import gs.micro.gs.records.ObjetivoCreateDto;
import gs.micro.gs.services.ObjetivosService;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController extends GenericController<Objetivos, ObjetivosService, ObjetivoCreateDto, ObjetivosBuilder>{

	
	public ObjetivosController(ObjetivosService service, ObjetivosBuilder builder) {
		super(service, builder);
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/{id}/indicadores")
	public ResponseEntity<List<IndicadorDto>> getIndicadoresById(@PathParam(value = "id") String id) {
		List<IndicadorDto> results = this.service.findIndicadores(id);
		return new ResponseEntity<>(results, HttpStatus.OK);
	}
	

}
