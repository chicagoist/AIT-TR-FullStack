package ait.repositories;

import ait.model.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryList implements UserRepository {

    private long currentId = 1;
    private final List<User> users = new ArrayList<>();


    @Override
    public void save(User user) {
        user.setId(currentId++);
        users.add(user);
    }

    @Override
    public User findById(Long id) {
        for(User user : users) {
            if(user.getId().equals(id)) {
                return user;
            }
        }
        return null;
        //return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    @Override
    public void deleteById(Long id) {
        users.removeIf(user -> user.getId() == id);
    }

    @Override
    public void update(User item) {
        User existgUser = findById(item.getId());
        if(existgUser != null) {
            existgUser.setName(item.getName());
            existgUser.setEmail(item.getEmail());
        }
    }

    @Override
    public boolean existsByEmail(String email) {
        for(User user : users) {
            if(user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public User findByEmail(String email) {
        for(User user : users) {
            if(user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }
}

