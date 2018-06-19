package service.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sun.util.calendar.BaseCalendar;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "service_hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String capacity;
    private String rezerved;
    private String standart;
    private String yourchoice;
    private Integer roomcounter;
    private String hotelname;
    private Date startvacation;
    private Date endvacation;
    private Integer price;
    private String checkname;


        /*@Column(name = "hash_password")
        private String hashPassword;*/








/*@ManyToMany (fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_hotel",
            joinColumns = @JoinColumn(name = "hotel_id", referencedColumnName = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "user", referencedColumnName = "id"))

    private List<User> user;*/

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}