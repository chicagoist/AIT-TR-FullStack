package lesson_49.classwork.repositories;

import lesson_49.classwork.model.User;

public interface UserRepository extends CrudRepository<User>{
    public User findByEmail(String email);
}
