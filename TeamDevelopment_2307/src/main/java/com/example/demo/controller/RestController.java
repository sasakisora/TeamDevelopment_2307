package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.core.io.ResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

//画像表示用コントローラ//	
public class RestController {
	
	private ResourceLoader resourceLoader;
	
	public void imageController(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	
	@GetMapping(value = "/img{imageName}", produces = MediaType.IMAGE_JPEG_VALUE)

	@ResponseBody
	public Resource showimage(@PathVariable String imageName) {
		return (Resource) resourceLoader.getResource("classpath:/static/img/"+imageName);
	}
}
