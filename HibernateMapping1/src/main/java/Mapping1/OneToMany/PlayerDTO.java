package Mapping1.OneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Player")

public class PlayerDTO {

	public PlayerDTO(int no, String name, String role2, boolean isc) {
		// TODO Auto-generated constructor stub
	}
	@Id
	private int jerseyno;
	private String pname;
	private String role;
	private  boolean  iscaptain;
}
