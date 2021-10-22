package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface ClientDao {
    public void insert(Department obj);
    public void update(Department obj);
    public void delete(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
    public List<Seller> findByDepartment(Department department);

}
