package Example.mapper;

import Example.model.Vacancy;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VacancyMapper implements RowMapper<Vacancy> {
    @Override
    public Vacancy mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Vacancy(rs.getInt("id"),rs.getString("title"),rs.getInt("company_id"),
                rs.getInt("salary"),rs.getString("description"));
    }
}
