package Example.mapper;

import Example.model.Country;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryMapper implements RowMapper<Country> {

    @Override
    public Country mapRow(ResultSet rs, int rowNum) throws SQLException {
        Country country = new Country(rs.getInt("id"),rs.getString("name"));
        return country;
    }
}
