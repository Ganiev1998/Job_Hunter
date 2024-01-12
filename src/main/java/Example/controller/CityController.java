package Example.controller;

import Example.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CityController {
    @Autowired
    private CityService cityService;
    @RequestMapping(value = "/select_city",method = RequestMethod.GET)
    public ModelAndView cityList() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("city/select_city");
        mv.addObject("city", cityService.getCityList());
        return mv;
    }
    @RequestMapping(value = "/create_cities",method = RequestMethod.GET)
    public ModelAndView create(@RequestParam("name") String name, @RequestParam("country id") int country_id){
        cityService.insertCity(name,country_id);
        return cityList();
    }
    @GetMapping("/create_city")
    public String addCity(){
        return "city/create_city";
    }




    @RequestMapping(value = "/update_city",method = RequestMethod.GET)
    public ModelAndView updateCity(){
        ModelAndView mv = new ModelAndView("city/update_city");
        mv.addObject("city",cityService.getCityList());
        return mv;
    }

    @RequestMapping(value = "/update_city2/{id}",method = RequestMethod.GET)
    public ModelAndView updateCity2(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("city/update_city2");
        mv.addObject("city", cityService.getCityById(id));
        return mv;
    }
    @RequestMapping(value = "/update_cit/{id}")
    public ModelAndView update(@PathVariable("id") int id, @RequestParam("name") String name, @RequestParam("country_id") int country_id) {
        cityService.updateCity(id, name, country_id );
        return updateCity();
    }




    @RequestMapping(value = "/delete_city",method = RequestMethod.GET)
    public ModelAndView cityList2() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("city/delete_city");
        mv.addObject("city", cityService.getCityList());
        return mv;
    }
    @RequestMapping(value = "delete_cit/{id}",method = RequestMethod.GET)
    public ModelAndView delete_city(@PathVariable("id")Integer id){
        cityService.deleteCity(id);
        return cityList2();
    }
}
