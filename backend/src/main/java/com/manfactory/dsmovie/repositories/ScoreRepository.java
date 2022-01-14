package com.manfactory.dsmovie.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.manfactory.dsmovie.entities.Score;
import com.manfactory.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepositoryImplementation<Score, ScorePK>{

}
