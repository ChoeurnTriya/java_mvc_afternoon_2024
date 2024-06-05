package model.dao;

import model.User;

import java.util.List;

public interface UserDao {
    void addNewUser(User user);
    void deleteUserById(Integer id);
    void updateUser(User user);
    void removeUser(User user);
    List<User> getAllUser();
}