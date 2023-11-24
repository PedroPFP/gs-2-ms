package gs.micro.gs.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "indicadores")
public class Indicadores {

	@Id	
	private String id; 	

	@ManyToOne
	private Objetivos objetivos;
	
	@Column(nullable = false, length = 100)
	private String descricao;
}
