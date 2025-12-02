package hibernate1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StudentDTO {
	
	@Id
	private int rollno;
	private String sname;
	private double marks;

}
