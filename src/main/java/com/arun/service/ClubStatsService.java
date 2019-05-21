package com.arun.service;

import com.arun.entity.ClubInfoEntity;
import com.arun.entity.PlayerPersonalInfoEntity;
import com.arun.pojo.PlayerPersonalInfo;
import com.arun.repository.ClubInfoRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by arun on 11/02/19.
 */
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClubStatsService {
    final DozerBeanMapper dozerBeanMapper;
    final ClubInfoRepository clubInfoRepository;

    public Set<PlayerPersonalInfo> getClubPlayerInfo(String clubName) {
        Set<PlayerPersonalInfoEntity> playerPersonalInfoEntityList = new HashSet<>();
        ClubInfoEntity clubInfoEntity = clubInfoRepository.findByName(clubName);
        if (clubInfoEntity != null) {
            playerPersonalInfoEntityList = clubInfoEntity.getPlayerInfo();
        }
        final Set<PlayerPersonalInfo> playerPersonalInfoSet = new HashSet<>();
        playerPersonalInfoEntityList.forEach(playerPersonalInfoEntity -> {
            playerPersonalInfoSet.add(this.dozerBeanMapper.map(playerPersonalInfoEntity, PlayerPersonalInfo.class));
        });
        return playerPersonalInfoSet;
    }

}
