package in.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	public WelcomeRestController() {
		logger.info("***** WelcomeRestController::Constructor *****");
	}

	@GetMapping
	public String welcomeMsg() {
		logger.info("***** welcomeMsg() execution start *****");
		String msg = "Welcome to Ashok IT - Software Training Institute (HYD) ..!!";
		logger.info("***** welcomeMsg() execution end was happen *****");
		return msg;
	}

<<<<<<< HEAD
	@GetMapping("/greet")
	public string greetMsg() {
		logger.info("***** greetMsg() execution start *******");
		String msg="Good Morning, Welcome to Ashok IT";
		System.out.println("Testing git collaboration");
		logger.info("***** greetMsg() execution end ******");
		return msg;
	}
=======
>>>>>>> d82d71ba8ea8c03adfc06448f57877e65ea8067c
}
