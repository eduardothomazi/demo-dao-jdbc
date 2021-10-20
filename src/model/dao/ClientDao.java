package model.dao;

import model.entities.Department;

import java.util.List;

public interface ClientDao {
    public void insert(Department obj);
    public void update(Department obj);
    public void delete(Integer id);
    Department findById(Integer id);
    List<Department> findAll();

}
