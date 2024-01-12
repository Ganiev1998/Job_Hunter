package Example.service;

import Example.model.City;

import java.util.List;

public interface CityService {
    City getCityById(Integer id);
    List<City> getCityList();
    boolean insertCity(String name,Integer country_id);
    boolean updateCity(Integer id, String name,Integer country_id);
    boolean deleteCity(Integer id);
}
