package blog.juanfrancisco.net.graphqdemojuan.services.impl;


import blog.juanfrancisco.net.graphqdemojuan.models.Vehicle;
import blog.juanfrancisco.net.graphqdemojuan.repositories.VehicleRepository;
import blog.juanfrancisco.net.graphqdemojuan.services.VehicleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class VehicleServiceImpl implements VehicleService {
    private final VehicleRepository vehicleRepository ;
    public VehicleServiceImpl(final VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository ;
    }
    @Transactional
    @Override
    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        final Vehicle vehicle = new Vehicle();
        vehicle.setType(type);
        vehicle.setModelCode(modelCode);
        vehicle.setBrandName(brandName);
        vehicle.setLaunchDate(LocalDate.parse(launchDate));
        return this.vehicleRepository.save(vehicle);
    }
    @Transactional(readOnly = true)
    @Override
    public List<Vehicle> getAllVehicles(final int count) {
        return this.vehicleRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }
    @Transactional(readOnly = true)
    @Override
    public Optional<Vehicle> getVehicle(final String id) {
        return this.vehicleRepository.findById(id);
    }
}
