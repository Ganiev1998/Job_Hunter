package Example.service.Impl;

import Example.dao.CountryDao;
import Example.model.Country;
import Example.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryDao countryDao;
    @Override
    public Country getCountryById(Integer id) {
        return countryDao.selectCountryById(id);
    }
    @Override
    public List<Country> getCountryList() {
        return countryDao.selectAllCountry();
    }
    @Override
    public boolean insertCountry(String name) {
        return countryDao.insertCountry(new Country(name));
    }

    @Override
    public boolean updateCountry(Integer id, String name) {
        return countryDao.updateCountry(id,new Country(name));
    }

    @Override
    public boolean deleteCountry(Integer id) {
        return countryDao.deleteCountry(id);
    }
}
