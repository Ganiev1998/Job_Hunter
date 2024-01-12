package Example.service;

import Example.model.Vacancy;
import Example.model.Vacancy_Requirement;

import java.util.List;

public interface Vacancy_RequirementService {
    Vacancy_Requirement getProductById(Integer id);
    List<Vacancy_Requirement> getProductList();
    boolean insertProduct(Integer vacancy_id,Integer requirement_id);
    boolean updateProduct(Integer id,Integer vacancy_id,Integer requirement_id);
    boolean deleteProduct(Integer id);
}
