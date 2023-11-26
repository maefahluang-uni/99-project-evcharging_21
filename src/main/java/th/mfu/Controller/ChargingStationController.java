package th.mfu.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import th.mfu.Service.ChargingStationService;

@RestController
@RequestMapping("/api/charging-stations")
public class ChargingStationController {

    @Autowired
    private ChargingStationService chargingStationService;

    @GetMapping
    public List<th.mfu.Entity.ChargingStation> getAllChargingStations() {
        return chargingStationService.getAllChargingStations();
    }

    @PostMapping
    public th.mfu.Entity.ChargingStation createChargingStation(@RequestBody th.mfu.Entity.ChargingStation chargingStation) {
        return chargingStationService.createChargingStation(chargingStation);
    }

    // Other endpoints for charging stations
}

