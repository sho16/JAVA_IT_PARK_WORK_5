package service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import service.dto.HotelDto;
import service.models.User;

//import service.models.Hotel;
//import service.repositories.HotelRepository;

import service.dto.UsersDto;
import service.repositories.UsersRepository;
import service.forms.UserForm;
import java.util.ArrayList;
import java.util.List;

@Component
public class UsersServiceImpl implements UsersService {

    @Autowired

    // private HotelRepository hotelRepository;

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


    public User getnamsur(User user) {
        User getnamsur = User.builder()
                .login(user.getLogin())
                .name(user.getName())
                .build();
                return getnamsur;


    }

}

