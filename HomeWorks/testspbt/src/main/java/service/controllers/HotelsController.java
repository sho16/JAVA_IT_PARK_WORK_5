package service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.dto.UsersDto;
import service.details.UserDetailsImpl;
import service.models.User;
import service.services.UsersService;

@Controller
public class HotelsController {
   /* @PostMapping("hotels/{hotel-id}/reserved")
    @ResponseBody
    public ResponseEntity<Object> reserveHotel(@PathVariable("hotel-id") Long hotelId,
                                               Authentication authentication) {
        UserDetailsImpl details = authentication.getPrincipal();
    }*/
   @Autowired
   private UsersService service;
    @GetMapping("/hotels/{hotel-id}")
    public String getHotelPage(ModelMap model, @PathVariable("hotel-id") Long hotelId, Authentication authentication) {
        UserDetailsImpl details = (UserDetailsImpl)authentication.getPrincipal();
        Long id = details.getId();
        UsersDto user = service.getUserById(id);
        model.addAttribute("currentUser", user);
    }
}
