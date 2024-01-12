package Example.dao.impl;

import Example.dao.VacancyDao;
import Example.model.Vacancy;

import java.util.List;

public class Vacancy_RequirementDaoImpl implements VacancyDao {

    @Override
    public Vacancy selectProductById(Integer id) {
        return null;
    }

    @Override
    public List<Vacancy> selectAllProduct() {
        return null;
    }

    @Override
    public boolean insertProduct(Vacancy vacancy) {
        return false;
    }

    @Override
    public boolean updateProduct(Integer id, Vacancy vacancy) {
        return false;
    }

    @Override
    public boolean deleteProduct(Integer id) {
        return false;
    }
}
