package service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.models.User;
import service.repositories.UsersRepository;
import service.forms.UserForm;

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
        }
        return names;
    }

    public void addUser(UserForm user) {
        User newUser = User.builder()
                .login(user.getLogin())
                .name(user.getName())
                .build();

        usersRepository.save(newUser);
    }
}