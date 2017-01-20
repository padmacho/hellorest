package org.eduami.hellorest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@RequestMapping("/hello")
	public Message sayHello() {
		return new Message("Hello Welcome to REST World!!!");
	}

}
