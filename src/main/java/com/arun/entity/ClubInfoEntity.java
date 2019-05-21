package com.arun.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by arun on 10/02/19.
 */
@Entity(name = "club_info")
public class ClubInfoEntity extends BaseEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "logo")
    private String logo;

    @JoinColumn(name = "club_id")
    @OneToMany(fetch = FetchType.EAGER)
    private Set<PlayerPersonalInfoEntity> playerInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }


    public Set<PlayerPersonalInfoEntity> getPlayerInfo() {
        return playerInfo;
    }

    public void setPlayerInfo(Set<PlayerPersonalInfoEntity> playerInfo) {
        this.playerInfo = playerInfo;
    }
}
