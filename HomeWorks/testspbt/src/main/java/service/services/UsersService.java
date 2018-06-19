package service.services;

import service.forms.UserForm;
import service.dto.UsersDto;
import service.models.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface UsersService {

    List<UsersDto> getAllUsersDump();
    List<String> getAllNames();
    //добавили фамилию
    List<String> getAllSurname();


    void addUser(UserForm user);
    void getUserById( User id);
    //void doGet(HttpServletRequest request,HttpServletResponse response);

   //List<String> getAllHotels();

}