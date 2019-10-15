package is.hi.hbv501.videoleiga.videoleiga.Entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public String uName;
    public String password;

    @OneToMany(mappedBy = "user")
    private List<RentalLog> rentals = new ArrayList<>();

    public List<RentalLog> getRentals() {
        return rentals;
    }

    public void setRentals(List<RentalLog> rentals) {
        this.rentals = rentals;
    }

    public User() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return uName;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String uName, String password) {
        this.uName = uName;
        this.password = password;
    }
}