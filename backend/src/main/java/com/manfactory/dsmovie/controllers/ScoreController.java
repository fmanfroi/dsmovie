package com.manfactory.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manfactory.dsmovie.dto.MovieDTO;
import com.manfactory.dsmovie.dto.ScoreDTO;
import com.manfactory.dsmovie.service.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

	@Autowired
	private ScoreService service;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto){
		return service.saveScore(dto);
	}
}
