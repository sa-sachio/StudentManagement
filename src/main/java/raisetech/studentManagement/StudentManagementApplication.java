package raisetech.studentManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

	public static void main(String[] args) {
		// localhost:8080
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@GetMapping("/calculation_01")
	public int calculation_01() {
		return 17 * ( 20 + 35 );
	}
}

//テスト
