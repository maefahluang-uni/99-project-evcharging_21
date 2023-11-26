package th.mfu.Entity;



import javax.persistence.*;

@Entity
@Table(name = "RestStops")
public class RestStop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long restStopId;

    private String name;

    private String location;

    // Other rest stop fields and relationships

    public RestStop() {
        // Default constructor
    }

    public RestStop(String name, String location) {
        this.name = name;
        this.location = location;
        // Other fields can be initialized here if needed
    }

    // Getters and setters

    public Long getRestStopId() {
        return restStopId;
    }

    public void setRestStopId(Long restStopId) {
        this.restStopId = restStopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Other getters and setters for additional fields and relationships
}
