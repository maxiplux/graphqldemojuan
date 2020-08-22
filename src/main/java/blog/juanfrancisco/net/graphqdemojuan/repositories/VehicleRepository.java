package blog.juanfrancisco.net.graphqdemojuan.repositories;


import blog.juanfrancisco.net.graphqdemojuan.models.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends MongoRepository<Vehicle, String> {
}
