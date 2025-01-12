package bg.smg.airplanetickets.service;

import bg.smg.airplanetickets.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public User getUser(long id) {
        return null;
    }

    @Override
    public void deleteUser(long id) {

    }
}
