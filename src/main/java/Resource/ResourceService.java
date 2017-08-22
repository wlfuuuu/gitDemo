package Resource;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class ResourceService {

//	@Resource
	@Inject
	private ResourceDAO resourceDAO;

	public void save() {
		resourceDAO.save();
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("destory");
	}
}
