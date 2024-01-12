package Example.service.Impl;

import Example.dao.CityDao;
import Example.dao.CompanyDao;
import Example.model.Company;
import Example.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyDao companyDao;
    @Override
    public Company getCompanyById(Integer id) {
        return companyDao.selectCompanyById(id);
    }
    @Override
    public List<Company> getCompanyList() {
        return companyDao.selectAllCompany();
    }

    @Override
    public boolean insertCompany(String name, Integer city_id, String description, String telNumber, String webSite) {
        return companyDao.insertCompany(new Company(name,city_id,description,telNumber,webSite));
    }

    @Override
    public boolean updateCompany(Integer id, String name, Integer city_id, String description, String telNumber, String webSite) {
        return companyDao.updateCompany(id,new Company(name,city_id,description,telNumber,webSite));
    }

    @Override
    public boolean deleteCompany(Integer id) {
        return companyDao.deleteCompany(id);
    }
}
