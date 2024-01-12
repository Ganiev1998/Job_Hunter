package Example.dao;

import Example.model.Requirement;

import java.util.List;

public interface RequirementDao {
    Requirement selectProductById(Integer id);
    List<Requirement> selectAllProduct();
    boolean insertProduct(Requirement requirement);
    boolean updateProduct(Integer id, Requirement requirement);
    boolean deleteProduct(Integer id);
}
