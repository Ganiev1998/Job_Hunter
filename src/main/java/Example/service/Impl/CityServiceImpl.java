package Example.service.Impl;

import Example.dao.CityDao;
import Example.model.City;
import Example.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;
    @Override
    public City getCityById(Integer id) {
        return cityDao.selectCityById(id) ;
    }

    @Override
    public List<City> getCityList() {
        return cityDao.selectAllCity();
    }

    @Override
    public boolean insertCity(String name, Integer country_id) {
        return cityDao.insertCity(new City(name,country_id));
    }

    @Override
    public boolean updateCity(Integer id, String name, Integer country_id) {
        return cityDao.updateCity(id,new City(name,country_id));
    }

    @Override
    public boolean deleteCity(Integer id) {
        return cityDao.deleteCity(id);
    }
}
