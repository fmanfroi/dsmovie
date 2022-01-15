package com.manfactory.dsmovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.manfactory.dsmovie.dto.MovieDTO;
import com.manfactory.dsmovie.entities.Movie;
import com.manfactory.dsmovie.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;
	
	@Transactional
	public Page<MovieDTO> findAll(Pageable pageable) {
		Page<Movie> result = repository.findAll(pageable);
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		return page;			
	}
	
	@Transactional
	public MovieDTO findById(Long id) {
		Movie result = repository.findById(id).get();		
		return new MovieDTO(result);			
	}
}
