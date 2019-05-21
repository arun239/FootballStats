package com.arun.repository;

import com.arun.entity.PlayerPersonalInfoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by arun on 11/02/19.
 */
@Repository
public interface PlayerInfoRepository extends CrudRepository<PlayerPersonalInfoEntity,Long> {

    Iterable<PlayerPersonalInfoEntity> findByNameOrderByAgeAscOverallAscPotentialAsc(String name);
}
