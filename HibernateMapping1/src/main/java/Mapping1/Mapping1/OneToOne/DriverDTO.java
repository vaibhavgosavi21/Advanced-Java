package Mapping1.Mapping1.OneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class DriverDTO {
	
	@Id
	private int did;
	private String name;
	private long mobile;
	private String location;
}
