package th.mfu.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import th.mfu.Entity.RestStop;
import th.mfu.Service.RestStopService;
@RestController
@RequestMapping("/api/rest-stops")
public class RestStopController {

    @Autowired
    private RestStopService restStopService;

    @GetMapping
    public List<RestStop> getAllRestStops() {
        return restStopService.getAllRestStops();
    }

    @PostMapping
    public RestStop createRestStop(@RequestBody RestStop restStop) {
        return restStopService.createRestStop(restStop);
    }

    // Other endpoints for rest stops
}
