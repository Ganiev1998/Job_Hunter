package Example.dao;

import Example.model.Vacancy_Requirement;

import java.util.List;

public interface Vacancy_RequirementDao {
    Vacancy_Requirement selectProductById(Integer id);
    List<Vacancy_Requirement> selectAllProduct();
    boolean insertProduct(Vacancy_Requirement vacancyRequirement);
    boolean updateProduct(Integer id, Vacancy_Requirement vacancyRequirement);
    boolean deleteProduct(Integer id);
}
