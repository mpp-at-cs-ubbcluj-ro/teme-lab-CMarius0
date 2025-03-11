package domain;

import java.util.List;

public interface Repository<TID, ELEM> {
    void save(ELEM ELEM);
    ELEM getById(TID id);
    void update(TID id, ELEM ELEM);
    void delete(TID id);
    List<ELEM> getAll();
}
