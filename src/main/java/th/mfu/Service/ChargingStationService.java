package th.mfu.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.mfu.Entity.ChargingStation;
import th.mfu.Repository.ChargingStationRepository;

@Service
public class ChargingStationService {

    private final ChargingStationRepository chargingStationRepository;

    @Autowired
    public ChargingStationService(ChargingStationRepository chargingStationRepository) {
        this.chargingStationRepository = chargingStationRepository;
    }

    public List<ChargingStation> getAllChargingStations() {
        return chargingStationRepository.findAll();
    }

    public ChargingStation getChargingStationById(Long stationId) {
        return chargingStationRepository.findById(stationId).orElse(null);
    }

    public ChargingStation createChargingStation(ChargingStation chargingStation) {
        // Additional logic for creating a charging station, validation, etc.
        return chargingStationRepository.save(chargingStation);
    }

    public ChargingStation updateChargingStation(ChargingStation chargingStation) {
        // Additional logic for updating charging station details
        // Make sure the charging station exists in the database before updating
        return chargingStationRepository.save(chargingStation);
    }

    public void deleteChargingStationById(Long stationId) {
        // Additional logic for deleting a charging station
        chargingStationRepository.deleteById(stationId);
    }

    // Other service methods for charging stations
}
