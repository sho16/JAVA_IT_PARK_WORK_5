package service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import service.models.User;
import java.util.List;

public interface UsersRepository extends JpaRepository<User, Long> {
    List<User> findAllByAge(int age);
    List<User> findAllByNameContains(String part);
    List<User> findAllByNameNotNull(User user);

    @Query(nativeQuery = true, value = "SELECT * from service_user su WHERE su.age > ?1")
    List<User> findAllWhereAgeMoreThan(int age);
}
