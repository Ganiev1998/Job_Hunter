package Example.service;

import Example.model.Country;

import java.util.List;

public interface CountryService {
    Country getCountryById(Integer id);
    List<Country> getCountryList();
    boolean insertCountry(String name);
    boolean updateCountry(Integer id, String name);
    boolean deleteCountry(Integer id);
}
