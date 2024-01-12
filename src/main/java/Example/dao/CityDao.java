package Example.dao;

import Example.model.City;

import java.util.List;

public interface CityDao {
    City selectCityById(Integer id);
    List<City> selectAllCity();
    boolean insertCity(City city);
    boolean updateCity(Integer id,City city);
    boolean deleteCity(Integer id);
}
