package com.arun.entity;

import javax.persistence.*;

/**
 * Created by arun on 10/02/19.
 */
@Entity(name = "player_personal_info")
public class PlayerPersonalInfoEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "photo")
    private String photo;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "flag")
    private String flag;

    @Column(name = "overall")
    private Integer overall;

    @Column(name = "potential")
    private Integer potential;

    @Column(name = "value")
    private String value;

    @Column(name = "wage")
    private String wage;

    @Column(name = "special")
    private Integer special;

    @Column(name = "club_id")
    private Long clubId;

    @OneToOne(mappedBy = "playerPersonalInfo")
    private PlayerPositionEntity playerPosition;

    @OneToOne(mappedBy = "playerPersonalInfo")
    private PlayerAttributeEntity playerAttribute;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Integer getOverall() {
        return overall;
    }

    public void setOverall(Integer overall) {
        this.overall = overall;
    }

    public Integer getPotential() {
        return potential;
    }

    public void setPotential(Integer potential) {
        this.potential = potential;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public Integer getSpecial() {
        return special;
    }

    public void setSpecial(Integer special) {
        this.special = special;
    }

    public Long getClubId() {
        return clubId;
    }

    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    public PlayerPositionEntity getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(PlayerPositionEntity playerPosition) {
        this.playerPosition = playerPosition;
    }

    public PlayerAttributeEntity getPlayerAttribute() {
        return playerAttribute;
    }

    public void setPlayerAttribute(PlayerAttributeEntity playerAttribute) {
        this.playerAttribute = playerAttribute;
    }
}
