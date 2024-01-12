package Example.controller;

import Example.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CountryController {
    @Autowired
    private CountryService countryService;
    @RequestMapping(value = "/select_country",method = RequestMethod.GET)
    public ModelAndView countryList() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("country/select_country");
        mv.addObject("country", countryService.getCountryList());
        return mv;
    }
    @RequestMapping(value = "/create_countries",method = RequestMethod.GET)
    public ModelAndView create(@RequestParam("name") String name){
        countryService.insertCountry(name);
        return countryList();
    }
    @GetMapping("/create_country")
    public String addCountry(){
        return "country/create_country";
    }




    @RequestMapping(value = "/update_country",method = RequestMethod.GET)
    public ModelAndView updateCountry(){
        ModelAndView mv = new ModelAndView("country/update_country");
        mv.addObject("country",countryService.getCountryList());
        return mv;
    }

    @RequestMapping(value = "/update_country2/{id}",method = RequestMethod.GET)
    public ModelAndView updateCountry2(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("country/update_country2");
        mv.addObject("city",countryService.getCountryById(id));
        return mv;
    }
    @RequestMapping(value = "/update_count/{id}")
    public ModelAndView update(@PathVariable("id") int id, @RequestParam("name") String name) {
        countryService.updateCountry(id, name);
        return updateCountry();
    }

    @RequestMapping(value = "/delete_country",method = RequestMethod.GET)
    public ModelAndView deleteCountry() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("country/delete_country");
        mv.addObject("country", countryService.getCountryList());
        return mv;
    }
    @RequestMapping(value = "/delete_count/{id}",method = RequestMethod.GET)
    public ModelAndView delete_country(@PathVariable("id")Integer id){
        countryService.deleteCountry(id);
        return deleteCountry();
    }
}
