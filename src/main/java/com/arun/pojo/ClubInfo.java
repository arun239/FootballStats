package com.arun.pojo;

import com.arun.entity.PlayerPersonalInfoEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * Created by arun on 11/02/19.
 */
@Getter
@Setter
public class ClubInfo {
    private String name;
    private String logo;
    private Set<PlayerPersonalInfo> playerInfo;
}
