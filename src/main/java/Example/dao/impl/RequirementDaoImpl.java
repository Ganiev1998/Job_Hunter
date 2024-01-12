package Example.dao.impl;

import Example.dao.RequirementDao;
import Example.model.Requirement;

import java.util.List;

public class RequirementDaoImpl implements RequirementDao {
    @Override
    public Requirement selectProductById(Integer id) {
        return null;
    }

    @Override
    public List<Requirement> selectAllProduct() {
        return null;
    }

    @Override
    public boolean insertProduct(Requirement requirement) {
        return false;
    }

    @Override
    public boolean updateProduct(Integer id, Requirement requirement) {
        return false;
    }

    @Override
    public boolean deleteProduct(Integer id) {
        return false;
    }
}
