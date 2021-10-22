package model.dao;

import model.entities.Department;
import model.entities.Seller;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface SellerDao {
    List<Seller> findByDepartment(@NotNull Department department);

    void insert(Seller obj);
    void update(Seller obj);
    void deleteById (Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
}
