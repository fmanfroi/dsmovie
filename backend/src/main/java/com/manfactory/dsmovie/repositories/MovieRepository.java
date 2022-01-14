package com.manfactory.dsmovie.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.manfactory.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepositoryImplementation<Movie, Long>{

}
