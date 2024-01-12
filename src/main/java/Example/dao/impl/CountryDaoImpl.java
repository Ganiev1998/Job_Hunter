package Example.dao.impl;

import Example.dao.CountryDao;
import Example.mapper.CountryMapper;
import Example.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CountryDaoImpl implements CountryDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Country selectCountryById(Integer id) {
        return jdbcTemplate.queryForObject("select * from country where id = ?"
                ,new Object[]{id},new CountryMapper()) ;
    }
    @Override
    public List<Country> selectAllCountry() {
        return jdbcTemplate.query("select * from country",new CountryMapper());
    }
    @Override
    public boolean insertCountry(Country country) {
        jdbcTemplate.update("insert into country(name)values (?)",country.getName());
        return true;
    }
    @Override
    public boolean updateCountry(Integer id, Country country) {
        jdbcTemplate.update("update country set name = ? where id = ?",country.getName(),id);
        return true;
    }
    @Override
    public boolean deleteCountry(Integer id) {
        jdbcTemplate.update("delete from country where id = ?",id);
        return true;
    }
}
