package infrastructure.repository;

import java.util.List;

public interface Repository<E>{
    void save(E entity);
    List<E> read();
}
