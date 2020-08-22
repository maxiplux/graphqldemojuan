package blog.juanfrancisco.net.graphqdemojuan.queries;



import blog.juanfrancisco.net.graphqdemojuan.models.Vehicle;
import blog.juanfrancisco.net.graphqdemojuan.services.impl.VehicleServiceImpl;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;
@Component
public class VehicleQuery implements GraphQLQueryResolver {
    @Autowired
    private VehicleServiceImpl vehicleService;
    public List<Vehicle> getVehicles(final int count) {
        return this.vehicleService.getAllVehicles(count);
    }
    public Optional<Vehicle> getVehicle(final String id) {
        return this.vehicleService.getVehicle(id);
    }
}
