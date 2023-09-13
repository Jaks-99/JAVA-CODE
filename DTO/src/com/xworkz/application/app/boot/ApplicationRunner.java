package com.xworkz.application.app.boot;
import com.xworkz.application.app.dto.ApplicationDTO;
import com.xworkz.application.app.repository.ApplicationRepository;
import com.xworkz.application.app.repository.ApplicationRepositoryImpl;
import com.xworkz.application.app.service.ApplicationService;
import com.xworkz.application.app.service.ApplicationServiceImpl;

public class ApplicationRunner {
	
	public static void main(String[] args) {
		System.out.println("Running main ....");
		ApplicationRepository applRepo = new ApplicationRepositoryImpl();
		ApplicationService service = new ApplicationServiceImpl(applRepo);
		ApplicationDTO appDto = new ApplicationDTO(4, "Amazon", "Jeff bezos", "Amazon", "Amazon 8.1");
		boolean persisted = service.validateAndSave(appDto);
		System.out.println("Persisted " + persisted);

		ApplicationDTO appDto2 = new ApplicationDTO(4, "Facebook", "Zuck", "Meta", "fb 5.5");
		service.validateAndSave(appDto2);

	}

}
