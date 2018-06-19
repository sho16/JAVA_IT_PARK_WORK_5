package service.services;
import  java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import service.dto.HotelDto;
import service.models.User;

//import service.models.Hotel;
//import service.repositories.HotelRepository;

import service.dto.UsersDto;
import service.repositories.UsersRepository;
import service.forms.UserForm;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;







@Component
public class UsersServiceImpl implements UsersService {

    @Autowired

    private UsersRepository usersRepository;

    public List<String> getAllNames() {
        List<User> users = usersRepository.findAll();


        List<String> names = new ArrayList<String>();

        for (User user : users) {
            names.add(user.getName());

           // names.add(user.getSurname());
        }
        return names;
    }


    public List<String> getAllSurname() {
        List<User> users = usersRepository.findAll();

        List<String> surname = new ArrayList<String>();
        for (User user : users) {
            surname.add(user.getSurname());

        }
        return surname;
    }


    //Добавляю гостиницу

    public List<UsersDto> getAllUsersDump() {
        List<User> users = usersRepository.findAll();

        List<UsersDto> userDtos = new ArrayList<UsersDto>();
        for (User user : users) {
            userDtos.add(UsersDto.builder()

                    .name(user.getName())
                    .surname(user.getSurname())
                    .hotels(HotelDto.from(user.getHotels()))
                    .build());
        }
        return userDtos;
    }


    public void addUser(UserForm user) {
        User newUser = User.builder()
                .login(user.getLogin())
                .name(user.getName())
                //взяли фамилию
                .surname(user.getSurname())

                .build();

        usersRepository.save(newUser);

    }



   public void getUserById(User id){

       User iduser = User.builder()
               .id(id.getId())
               .build();


   }





}

