package th.mfu.Entity;

import javax.persistence.*;

@Entity
@Table(name = "ChargingStations")
public class ChargingStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stationId;

    private String name;

    private String location;

    private String chargerType;

    // Other charging station fields and relationships

    public ChargingStation() {
        // Default constructor
     

    }

    public ChargingStation(String name, String location, String chargerType) {
        this.name = name;
        this.location = location;
        this.chargerType = chargerType;
        // Other fields can be initialized here if needed
    }

    // Getters and setters

    public Long getStationId() {
        return stationId;
    }

    public void setStationId(Long stationId) {
        this.stationId = stationId;
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

    public String getChargerType() {
        return chargerType;
    }

    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }

    // Other getters and setters for additional fields and relationships
}
