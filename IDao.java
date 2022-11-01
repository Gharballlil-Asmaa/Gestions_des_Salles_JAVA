package ma_projet_deo;

import java.util.List;

interface IDao<T> {
    public boolean create(T o);
    public boolean delete(T o);
    public boolean update(T o);
    T findById(int id);
    List<T> findAll();

}
