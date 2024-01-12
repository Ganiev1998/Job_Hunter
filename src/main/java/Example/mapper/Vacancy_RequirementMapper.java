package Example.mapper;

import Example.model.Vacancy_Requirement;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Vacancy_RequirementMapper implements RowMapper<Vacancy_Requirement> {
    @Override
    public Vacancy_Requirement mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Vacancy_Requirement(rs.getInt("id"),rs.getInt("vacancy_id"),
                rs.getInt("requirement_id"));
    }
}
