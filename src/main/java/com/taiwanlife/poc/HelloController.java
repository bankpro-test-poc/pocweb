package com.taiwanlife.poc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	
	RestTemplate ocrClient = new RestTemplate();
	RestTemplate nlpClient = new RestTemplate();
	
    @GetMapping("/hello")
    public String hello() {
        return "Container Cluster POC!!! uat";
    }
    
    @GetMapping("/nlp")
    public String nlp() {
    	String nlpString="NLP api is waiting!!!";
    	nlpString = nlpClient.getForObject("http://localhost:8090/api/nlp", String.class);
        return nlpString;
    }
    
    @GetMapping("/ocr")
    public String ocr() {
    	String ocrString="OCR api is waiting!!!";
    	ocrString = ocrClient.getForObject("http://localhost:8100/api/ocr", String.class);
        return ocrString;
    }
    
}
