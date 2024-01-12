package Example.service;

import Example.model.Company;

import java.util.List;

public interface CompanyService {
    Company getCompanyById(Integer id);
    List<Company> getCompanyList();
    boolean insertCompany(String name,Integer city_id,String description,String telNumber,String webSite);
    boolean updateCompany(Integer id, String name,Integer city_id,String description,String telNumber,String webSite);
    boolean deleteCompany(Integer id);
}
