package gs.micro.gs.builder;

public interface IGenericBuilder<E,D> { 
	E toEntity(D dto);
	D toAllDto(E entity);
}