package pe.edu.cibertec.sw_async_hilos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SwAsyncHilosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwAsyncHilosApplication.class, args);
	}

}
