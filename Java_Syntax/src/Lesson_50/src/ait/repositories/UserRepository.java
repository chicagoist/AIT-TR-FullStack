package ait.repositories;

import ait.model.*;

public interface UserRepository extends CrudRepository<User> {
    public User findByEmail(String email);
}
