package service.controllers;




import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.dto.UsersDto;
import service.dto.HotelDto;
import service.repositories.UsersRepository;
import service.services.UsersService;
import service.services.HotelsService;
import service.forms.UserForm;
import service.services.webservlet;
import service.services.webservlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class UsersController {

/*    @Autowired
private WebServlet web;*/
    @Autowired
    private UsersService service;
    @Autowired
    private HotelsService hotelsService;

    private UsersRepository repository;

   // @GetMapping  ( value="/users", params = "check1")
   // public String getUsersPage234(ModelMap model) {
   //     public void createLeave(  @RequestParam(value = "check1") String check1)
  //  {
   //     System.out.println(check1);
       // return "UsersPage";
  // }

    /*public void action1()
    {
        System.out.println("Action1 block called");
    }*/


    @GetMapping("/users")
    public String getUsersPage(ModelMap model) {
        List<String> names = service.getAllNames();
        model.addAttribute("names", names);
        return "UsersPage";
    }


   @GetMapping("/list")
    public String getHotelPage(ModelMap model) {
        List<String> hot = hotelsService.getAllHotels();
        model.addAttribute("hot",hot );
        return "ListHotels";
    }

  @GetMapping("/buildlist")
    public String getHotelPage1(ModelMap model) {
        List<HotelDto> hot1 = hotelsService.getAllHotelsDump();
        model.addAttribute("hot1",hot1 );
        return "Build_Hotel";
    }


    /*@PostMapping("/users")
    public String addUser(UserForm user) {
        service.addUser(user);
        return "redirect:/users";
    }*/

    /*@PostMapping("/page")
    public String addUser(UserForm user) {
        service.addUser(user);
        return "redirect:/users";
    }*/

    @GetMapping("/page1")
    public String getUsersPage1(ModelMap model) {
        List<String> names = service.getAllNames();
        model.addAttribute("names", names);

        //List<String> surname = service.getAllSurname();
        //model.addAttribute("surname", surname);

        return "Page1";
    }



   /* @GetMapping("/listhotels")
    public String getUsersPage21(ModelMap model) {
        List<UsersDto> tabusers = service.getAllUsersDump();
        model.addAttribute("tabhotels", tabhotels);
        return "listhotels";
    }*/



   @GetMapping("/tabusers")
    public String getUsersPage22(ModelMap model) {
       List<UsersDto> tabusers = service.getAllUsersDump();
       model.addAttribute("tabusers", tabusers);
       return "tabusers";
   }

    @PostMapping("/users")
    public String addUser(UserForm user) {
        service.addUser(user);
        return "redirect:/tabusers";
    }

   /*@PostMapping("/hotel")

        return "hotel"*/

}