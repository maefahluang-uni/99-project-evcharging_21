package th.mfu.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.mfu.Entity.RestStop;
import th.mfu.Repository.RestStopRepository;

@Service
public class RestStopService {

    private final RestStopRepository restStopRepository;

    @Autowired
    public RestStopService(RestStopRepository restStopRepository) {
        this.restStopRepository = restStopRepository;
    }

    public List<RestStop> getAllRestStops() {
        return restStopRepository.findAll();
    }

    public RestStop getRestStopById(Long id) {
        return restStopRepository.findById(id).orElse(null);
    }

    public RestStop createRestStop(RestStop restStop) {
        // Additional logic for creating a rest stop, validation, etc.
        return restStopRepository.save(restStop);
    }

    public RestStop updateRestStop(RestStop restStop) {
        // Additional logic for updating rest stop details
        // Make sure the rest stop exists in the database before updating
        return restStopRepository.save(restStop);
    }

    public void deleteRestStopById(Long id) {
        // Additional logic for deleting a rest stop
        restStopRepository.deleteById(id);
    }

    // Other service methods for rest stops
}
