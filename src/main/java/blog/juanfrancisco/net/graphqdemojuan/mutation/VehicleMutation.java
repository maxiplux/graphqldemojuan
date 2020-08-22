package blog.juanfrancisco.net.graphqdemojuan.mutation;


import blog.juanfrancisco.net.graphqdemojuan.models.Vehicle;
import blog.juanfrancisco.net.graphqdemojuan.services.VehicleService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class VehicleMutation implements GraphQLMutationResolver {

    @Autowired
    private VehicleService vehicleService;

    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }
}
