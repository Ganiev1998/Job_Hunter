package Example.service;

import Example.model.Requirement;

import java.util.List;

public interface RequirementService {
    Requirement getProductById(Integer id);
    List<Requirement> getProductList();
    boolean insertProduct(String name);
    boolean updateProduct(Integer id, String name);
    boolean deleteProduct(Integer id);
}
