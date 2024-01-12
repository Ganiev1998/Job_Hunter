package Example.dao.impl;

import Example.dao.CompanyDao;
import Example.mapper.CompanyMapper;
import Example.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CompanyDaoImpl implements CompanyDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Company selectCompanyById(Integer id) {
        return (Company) jdbcTemplate.queryForObject("select * from company where id = ?",
                new Object[]{id},new CompanyMapper());
    }

    @Override
    public List<Company> selectAllCompany() {
        return jdbcTemplate.query("select * from company",new CompanyMapper());
    }

    @Override
    public boolean insertCompany(Company company) {
        jdbcTemplate.update("insert into company(name,city_id,description,telNumber,webSite)values (?,?,?,?,?)",
                company.getName(),company.getCity_id(),company.getDescription(),
                company.getTelNumber(),company.getWebSite());
        return true;
    }

    @Override
    public boolean updateCompany(Integer id, Company company) {
        jdbcTemplate.update("update company set name = ?,city_id = ?,description = ?,telnumber = ?,webSite = ? where id = ?",
                company.getName(),company.getCity_id(),company.getDescription(),
                company.getTelNumber(),company.getWebSite());
        return true;
    }

    @Override
    public boolean deleteCompany(Integer id) {
        jdbcTemplate.update("delete from company where id = ?",id);
        return true;
    }
}
