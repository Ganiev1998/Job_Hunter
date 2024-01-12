package Example.service;

import Example.model.Vacancy;

import java.util.List;

public interface VacancyService {
    Vacancy getProductById(Integer id);
    List<Vacancy> getProductList();
    boolean insertProduct(String title,Integer company_id,Integer salary,String Description);
    boolean updateProduct(Integer id,String title,Integer company_id,Integer salary,String Description);
    boolean deleteProduct(Integer id);
}
