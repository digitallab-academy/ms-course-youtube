package academy.digitallab.store.shopping.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Date;

@Data
public class Product {
    private Long id;

    private String name;
    private String description;

    private Double stock;
    private Double price;
    private String status;

    private Category category;
}
