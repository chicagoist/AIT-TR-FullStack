package repositories;

import lesson_49.classwork.model.User;

public interface UserRepository extends CrudRepository<User> {
    public User findByEmail(String email);
}
