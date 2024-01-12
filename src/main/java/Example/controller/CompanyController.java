package Example.controller;

import Example.service.CityService;
import Example.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    @RequestMapping(value = "/select_company",method = RequestMethod.GET)
    public ModelAndView companyList() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("company/select_company");
        mv.addObject("company", companyService.getCompanyList());
        return mv;
    }
    @RequestMapping(value = "/create_companies",method = RequestMethod.GET)
    public ModelAndView create(@RequestParam("name") String name, @RequestParam("city id") Integer city_id,
                               @RequestParam("description") String description,@RequestParam("telNumber") String telNumber,
                               @RequestParam("webSite") String webSite){
        companyService.insertCompany(name,city_id,description,telNumber,webSite);
        return companyList();
    }
    @GetMapping("/create_company")
    public String addCity(){
        return "company/create_company";
    }


    @RequestMapping(value = "/update_company",method = RequestMethod.GET)
    public ModelAndView updateCompany(){
        ModelAndView mv = new ModelAndView("company/update_company");
        mv.addObject("company",companyService.getCompanyList());
        return mv;
    }

    @RequestMapping(value = "/update_company2/{id}",method = RequestMethod.GET)
    public ModelAndView updateCompany2(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("company/update_company2");
        mv.addObject("company", companyService.getCompanyById(id));
        return mv;
    }
    @RequestMapping(value = "/update_comp/{id}")
    public ModelAndView update(@PathVariable("id") int id, @RequestParam("name") String name,
                               @RequestParam("city_id") int city_id,@RequestParam("description")String description,
                               @RequestParam("telNumber")String telNumber,@RequestParam("webSite")String webSite) {
        companyService.updateCompany(id, name, city_id,description,telNumber,webSite );
        return updateCompany();
    }

    @RequestMapping(value = "/delete_company",method = RequestMethod.GET)
    public ModelAndView delete_company() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("company/delete_company");
        mv.addObject("company", companyService.getCompanyList());
        return mv;
    }
    @RequestMapping(value = "/delete_comp/{id}",method = RequestMethod.GET)
    public ModelAndView delete_company(@PathVariable("id")Integer id){
        companyService.deleteCompany(id);
        return delete_company();
    }
}
