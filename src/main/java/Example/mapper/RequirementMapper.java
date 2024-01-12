package Example.mapper;

import Example.model.Requirement;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RequirementMapper implements RowMapper<Requirement> {
    @Override
    public Requirement mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Requirement(rs.getInt("id"),rs.getString("name"));
    }
}
