package infrastructure.mapper;

public interface Mapper<E, D> {
    E createEntity(D dto);
    D createDTO(E entity);
}
