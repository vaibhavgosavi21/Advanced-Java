package Mapping1.Mapping1.OneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class CarDTO {
	
	@Id
	private int cid;
	private String modelname;
	private int noofseats;
	private String color;
	
	@OneToOne
	private DriverDTO driver;

}
