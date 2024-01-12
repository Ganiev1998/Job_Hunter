package Example.mapper;

import Example.model.Company;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CompanyMapper implements RowMapper<Company> {
    @Override
    public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Company(rs.getInt("id"),rs.getString("name"),
                rs.getInt("city_id"),rs.getString("description"),rs.getString("telNumber"),
                rs.getString("website"));
    }
}
