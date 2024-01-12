package Example.dao;

import Example.model.Vacancy;

import java.util.List;

public interface VacancyDao {
    Vacancy selectProductById(Integer id);
    List<Vacancy> selectAllProduct();
    boolean insertProduct(Vacancy vacancy);
    boolean updateProduct(Integer id, Vacancy vacancy);
    boolean deleteProduct(Integer id);
}
