package Mapping1.ManyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Data
@AllArgsConstructor
public class CustomerDTO {
	
	@Id
	private int cid;
	private String cname;
	private long mobile;
	private String loc;
	
	@ManyToMany
	List<ProductDTO> products;
	

}
