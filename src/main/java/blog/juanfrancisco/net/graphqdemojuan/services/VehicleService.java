package blog.juanfrancisco.net.graphqdemojuan.services;

import blog.juanfrancisco.net.graphqdemojuan.models.Vehicle;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface VehicleService {

    Vehicle createVehicle(String type, String modelCode, String brandName, String launchDate);


    List<Vehicle> getAllVehicles(int count);


    Optional<Vehicle> getVehicle(String id);
}
