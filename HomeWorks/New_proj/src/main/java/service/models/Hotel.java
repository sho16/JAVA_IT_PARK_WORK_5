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
    private String lux;
    private String halflux;
    private String standart;
    private String condition;
    private Integer roomcounter;
    private String hotelname;
    private Date startvacation;
    private Date endvacation;



        /*@Column(name = "hash_password")
        private String hashPassword;*/

/*

        @OneToMany
        @JoinTable(
                name = "user_hotel",
                joinColumns = @JoinColumn(name = "owner_id", referencedColumnName = "ownerid"),
                inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
*/




       /*@ManyToOne
        @JoinColumn(name = "ownerid")
        private User userjoin;*/

/*

        @ManyToOne
        @JoinTable(
                name = "user_hotel",
                joinColumns = @JoinColumn(name = "hotel_id", referencedColumnName = "hotel_id"),
                inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))

        private List<User> users;
*/

        /*@ManyToOne
        @JoinColumn(name = "hotel_id",insertable=false, updatable=false)
        private User link;
*/

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}