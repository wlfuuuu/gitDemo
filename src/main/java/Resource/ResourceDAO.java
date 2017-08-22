package Resource;

import org.springframework.stereotype.Repository;

@Repository
public class ResourceDAO {
	
	public void save() {
		System.out.println("This is a Resource!");
	}
}
