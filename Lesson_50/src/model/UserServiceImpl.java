package model;

import lesson_49.classwork.model.User;
import repositories.UserRepository;
import services.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private static final String MSG_BLANK_ARG_ERROR = "The name or " +
            "email cannot be empty or consist only of spaces";

    private static final String MSG_EMAIL_NOT_CORRECT_ERROR = "Invalid email " +
            "format";
    private static final String MSG_EMAIL_ALREADY_EXISTS_ERROR =
            "A user with this email is already exists";

    private static final String MSG_USER_DOSNT_EXISTS =
            "A user does not exists";

    private UserRepository repository;


    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createUser(String name, String email) {
        try {
            checkUserParameters(name, email);
            repository.save(new User(name, email));
        } catch(Exception e) {
            String message = String.format("Error creating user: user:%s " +
                    "email:%s%n%s%n ", name, email, e.getMessage());
            throw new RuntimeException(message);

        }
    }

    private void checkUserParameters(String name, String email) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(MSG_BLANK_ARG_ERROR);
        }

        if(email == null || !email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9" +
                ".-]+\\.[a-zA-Z]{2,}") || email.trim().isBlank()) {
            throw new IllegalArgumentException(MSG_EMAIL_ALREADY_EXISTS_ERROR);
        }

        if(repository.findByEmail(email) != null) {
            throw new IllegalArgumentException(MSG_EMAIL_ALREADY_EXISTS_ERROR);
        }
    }

    @Override
    public User getById(long id) {
        User foundUser = repository.findById(id);

        if(foundUser == null) {
            throw new IllegalArgumentException(MSG_USER_DOSNT_EXISTS);
        } else {
            return foundUser;
        }
    }

    @Override
    public User getByEmail(String email) {
        User foundUser = repository.findByEmail(email);

        if(foundUser == null) {
            throw new IllegalArgumentException(MSG_USER_DOSNT_EXISTS);
        } else {
            return foundUser;
        }
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public void updateUser(User user) {

        try {
            checkUserParameters(user.getName(), user.getEmail());
            repository.update(user);
        } catch(Exception e) {
            String message = String.format("Error updating user: user:%s " +
                            "email:%s%n%s%n ", user.getName(), user.getEmail(),
                    e.getMessage());
            throw new RuntimeException(message);

        }

    }

    @Override
    public void deleteById(long id) {
        try {
            repository.deleteById(id);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
