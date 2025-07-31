p[]package in.ashokit.rest;

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
		logger.info("***** welcomeMsg() execution end was happen now *****");
		logger.info("***** welcomeMsg() execution end was happen *****");
		logger.info("*******************************************");
    logger.info("+++++++++++++++++++++++++++++++++++++++++++");
		logger.info("############################################");
		String s = "Hello, this is a test message for checking git collaboration";
		System.out.println(s);
		logger.info("////////////////////////////////////////////");
		String booleanValue = "true";
		return msg;
	}

	//Task - 321

	public void m2() {
		logger.info("***** m2() execution start *****");
		String msg = "This is a test method for git collaboration";
		logger.info("***** m2() execution end was happen now *****");
		System.out.println(msg);
	}
	
	@GetMapping("/greet")
	public string greetMsg() {
		logger.info("***** greetMsg() execution start *******");
		String msg="Good Morning, Welcome to Ashok IT";
		System.out.println("Testing git collaboration");
		logger.info("****** greetMsg() execution end happen currently ******");
		int j=50;
		int k=100;
		int sum = j + k;
		System.out.println("value of k is :"+k);
		System.out.println("value of j is :"+j);
		System.out.println("Sum of j and k is: " + sum);
		return msg;
	}

	//Task - 320

	public void m1(){
		logger.info("***** m1() execution start *****");
		String msg = "This is a test method for Task 320";
		logger.info("***** m1() execution end *****");
		System.out.println(msg);
		logger.info("*******************************************");
		logger.info("+++++++++++++++++++++++++++++++++++++++++++");
		logger.info("############################################");
		System.out.println("Testing git collaboration in m1 method");
		logger.info("////////////////////////////////////////////");
	}
}
