package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class ProgramDepartment {
    DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
}
