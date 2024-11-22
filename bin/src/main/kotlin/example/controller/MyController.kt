package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class MyController {
	@GetMapping("/")
	fun home1(): String {
		return "index"
	}
}