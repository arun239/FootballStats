package com.arun.service;

import com.arun.entity.PlayerPersonalInfoEntity;
import com.arun.pojo.PlayerPersonalInfo;
import com.arun.repository.PlayerInfoRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arun on 11/02/19.
 */
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PlayerStatsService {
    final DozerBeanMapper dozerBeanMapper;
    final PlayerInfoRepository playerInfoRepository;


    public List<PlayerPersonalInfo> getPlayers(String playerNmae) {
        Iterable<PlayerPersonalInfoEntity> playerPersonalInfoEntityList = playerInfoRepository.findByNameOrderByAgeAscOverallAscPotentialAsc(playerNmae);
        final List<PlayerPersonalInfo> playerPersonalInfoList = new ArrayList<>();
        playerPersonalInfoEntityList.forEach(playerPersonalInfoEntity -> {
            playerPersonalInfoList.add(this.dozerBeanMapper.map(playerPersonalInfoEntity, PlayerPersonalInfo.class));
        });
        return playerPersonalInfoList;
    }
}
