package sample

import com.vaadin.flow.component.page.AppShellConfigurator
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application implements AppShellConfigurator {

	static void main(String[] args) {
		SpringApplication.run(Application, args)

	}
}
