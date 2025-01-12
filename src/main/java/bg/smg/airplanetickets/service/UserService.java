package bg.smg.airplanetickets.service;

import bg.smg.airplanetickets.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void addUser(User user);
    User getUser(long id);
    void deleteUser(long id);

}
