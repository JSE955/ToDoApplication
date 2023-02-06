package com.edenterprises.springboot.todoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
		
		@RequestMapping("say-hello")
		@ResponseBody
		public String sayHello() {
			return "Hello!";
		}
		
		@RequestMapping("say-hello-html")
		@ResponseBody
		public String sayHelloHtml() {
			StringBuffer sb = new StringBuffer();
			sb.append("<html>\r\n"
					+ "<head>\r\n"
					+ "<title> HTML Page</title>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "HTML Page Body\r\n"
					+ "</body>\r\n"
					+ "</html>");
			return sb.toString();
		}
		
		@RequestMapping("say-hello-jsp")
		public String sayHelloJsp() {
			return "sayHello";
		}
}
