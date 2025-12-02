package hibernate2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data

public class StudentDTO {

	@Id
	private int rollno;
	private String sname;
	private double marks;
}
