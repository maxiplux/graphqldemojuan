package blog.juanfrancisco.net.graphqdemojuan.models;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@EqualsAndHashCode
@Document
public class Vehicle implements Serializable {

    @Id
    private String id;

    private String type;

    private String modelCode;

    private String brandName;

    private LocalDate launchDate;
}
