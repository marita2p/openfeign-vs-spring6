package com.next.demo.controller;

import com.next.demo.dto.ResponseDto;
import com.next.demo.dto.RequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest-service")
public class RestServiceController {
	
	@PostMapping
	public ResponseDto simple (@RequestHeader("header") String header, @RequestBody RequestDto requestDto) {
		return new ResponseDto(requestDto);
	}
	
	@PostMapping("/complex/{pathParam}")
	public ResponseDto complex (@RequestHeader("header0") String header0, @RequestHeader("header1") String header1,
	                            @RequestHeader("header2") String header2, @RequestParam String param,
	                            @PathVariable String pathParam, @RequestBody RequestDto requestDto) {
		return new ResponseDto(requestDto);
	}
}
