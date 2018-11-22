package com.herreriasjose.reactspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TimeController {
	@GetMapping("/api/time")
	public String time() {
		return new Date() + "\n";
	}
}