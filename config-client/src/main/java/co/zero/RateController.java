package co.zero;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateController {
	private static final String FORMAT = "%s - %s - %s";
	@Value("${rate1}")
	private String rate1;
	
	@Value("${rate2}")
	private String rate2;
	
	@Value("${rate3}")
	private String rate3;
	
	@GetMapping
	public String getRate() {
		return String.format(FORMAT, rate1, rate2, rate3);
	}
}
