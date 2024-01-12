package Example.dao;

import Example.model.Company;

import java.util.List;

public interface CompanyDao {
    Company selectCompanyById(Integer id);
    List<Company> selectAllCompany();
    boolean insertCompany(Company company);
    boolean updateCompany(Integer id, Company company);
    boolean deleteCompany(Integer id);
}
