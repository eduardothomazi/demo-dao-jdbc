package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("===Test #1: findById from seller=== Seller #3:");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n===Test #2 findByDepartment === Department #2");
        Department department = new Department(2, null);
        List<Seller> sellerList = sellerDao.findByDepartment(department);
        for(Seller obj : sellerList){
            System.out.println(obj);
        }

        System.out.println("\n===Test #3 findAll ===");
        sellerList = sellerDao.findAll();
        for(Seller obj : sellerList) {
            System.out.println(obj);
        }

        System.out.println("\n===Test #4 Seller insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n===Test #5 Seller update === Bob Brown to Martha Wane");
        seller = sellerDao.findById(1);
        seller.setName("Martha Wane");
        sellerDao.update(seller);
        System.out.println("Update completed!");

        System.out.println("\n===Test #6 deleteById === id = 10");
        sellerDao.deleteById(10);
        for(Seller obj : sellerList) {
            System.out.println(obj);
            if (sellerDao.findById(10) == null){
                System.out.println("Success");
            }
        }

    }
}
