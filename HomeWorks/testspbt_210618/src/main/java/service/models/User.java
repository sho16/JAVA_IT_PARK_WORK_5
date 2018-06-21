package service.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "service_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private Integer age;
    private String login;

    @Column(name = "hash_password")
    private String hashPassword;

    @ElementCollection
    private List<String> authorities;


    //-------------------------------------------------------
   /* public static User fromuser(User name) {
        User getinfa = User.builder()
                .age(name.getAge())
                .surname(name.getSurname())
                .build();
        return getinfa;
    }*/
//---------------------------------------------------------------------------------



/*
    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_hotel",
            joinColumns = @JoinColumn(name = "user", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "user_id"))

    private List<Hotel> hotels;*/
//нужен hotel_id



   @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    private List<Hotel> hotels;
}
