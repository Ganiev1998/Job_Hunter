package Example.dao.impl;

import Example.dao.CityDao;
import Example.mapper.CityMapper;
import Example.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CityDaoImpl implements CityDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public City selectCityById(Integer id) {
        return (City) jdbcTemplate.queryForObject(
                "select * from city where id =?",new Object[]{id},new CityMapper());
    }

    @Override
    public List<City> selectAllCity() {
        return jdbcTemplate.query("select * from city",new CityMapper());
    }

    @Override
    public boolean insertCity(City city) {
        jdbcTemplate.update("insert into city(name,country_id)values (?,?)",
                city.getName(),
                city.getCountry_id());
        return true;
    }
    @Override
    public boolean updateCity(Integer id, City city) {
        jdbcTemplate.update("update city set name = ?,country_id = ? where id = ?",
                city.getName(),
                city.getCountry_id(),
                id);
        return true;
    }

    @Override
    public boolean deleteCity(Integer id) {
        jdbcTemplate.update("delete from city where id = ?",id);
        return true;
    }
}
