package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();

    void add(User user);

    User show(Long id);

    void update(User updatedUser);

    void delete (Long id);

}
