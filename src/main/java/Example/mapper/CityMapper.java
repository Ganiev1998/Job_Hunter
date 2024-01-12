package Example.mapper;

import Example.model.City;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CityMapper implements RowMapper<City> {
    @Override
    public City mapRow(ResultSet rs, int rowNum) throws SQLException {
        City city = new City(rs.getInt("id"),rs.getString("name"),rs.getInt("country_id"));
        return city;
    }
}
