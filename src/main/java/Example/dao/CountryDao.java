package Example.dao;

import Example.model.Country;

import java.util.List;

public interface CountryDao {
    Country selectCountryById(Integer id);
    List<Country> selectAllCountry();
    boolean insertCountry(Country country);
    boolean updateCountry(Integer id, Country country);
    boolean deleteCountry(Integer id);
}
