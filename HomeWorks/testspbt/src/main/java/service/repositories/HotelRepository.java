package service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import service.models.Hotel;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

   // List<Hotel> findAllByOwnerid(Integer ownerid);
    //List<Hotel> findAllByNameContains(String part);

    /*@Query(nativeQuery = true, value = "SELECT * from service_user su WHERE su.age > ?1")
    List<Hotel> findAllWhereAgeMoreThan(int age);*/
}
