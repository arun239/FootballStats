package com.arun.repository;

import com.arun.entity.ClubInfoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by arun on 11/02/19.
 */
@Repository
public interface ClubInfoRepository extends CrudRepository<ClubInfoEntity,Long> {

    ClubInfoEntity findByName(String name);
}
