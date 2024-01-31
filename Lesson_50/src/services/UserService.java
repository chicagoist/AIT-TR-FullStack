package services;

import lesson_49.classwork.model.User;

import java.util.List;

public interface UserService {

    public void createUser( String name, String email);
    public User getById(long id);
    public User getByEmail(String email);

    public List<User> getAllUsers();

    public void updateUser(User user);
    public void deleteById( long id);
}
