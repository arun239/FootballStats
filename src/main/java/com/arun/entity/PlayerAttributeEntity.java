package com.arun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * Created by arun on 10/02/19.
 */
@Entity(name = "player_attribute_data")
public class PlayerAttributeEntity extends BaseEntity {
    @Column(name = "acceleration")
    private Integer acceleration;

    @Column(name = "aggression")
    private Integer aggression;

    @Column(name = "agility")
    private Integer agility;

    @Column(name = "balance")
    private Integer balance;

    @Column(name = "ballControl")
    private Integer ballControl;

    @Column(name = "composure")
    private Integer composure;

    @Column(name = "crossing")
    private Integer crossing;

    @Column(name = "curve")
    private Integer curve;

    @Column(name = "dribbling")
    private Integer dribbling;

    @Column(name = "finishing")
    private Integer finishing;

    @Column(name = "freeKickAccuracy")
    private Integer freeKickAccuracy;

    @Column(name = "gkDiving")
    private Integer gkDiving;

    @Column(name = "gkHandling")
    private Integer gkHandling;

    @Column(name = "gkKicking")
    private Integer gkKicking;

    @Column(name = "gkPositioning")
    private Integer gkPositioning;

    @Column(name = "gkReflexes")
    private Integer gkReflexes;

    @Column(name = "headingAccuracy")
    private Integer headingAccuracy;

    @Column(name = "interceptions")
    private Integer interceptions;

    @Column(name = "jumping")
    private Integer jumping;

    @Column(name = "longPassing")
    private Integer longPassing;

    @Column(name = "longShots")
    private Integer longShots;

    @Column(name = "marking")
    private Integer marking;

    @Column(name = "penalties")
    private Integer penalties;

    @Column(name = "positioning")
    private Integer positioning;

    @Column(name = "reactions")
    private Integer reactions;

    @Column(name = "shortPassing")
    private Integer shortPassing;

    @Column(name = "shotPower")
    private Integer shotPower;

    @Column(name = "slidingTackle")
    private Integer slidingTackle;

    @Column(name = "sprintSpeed")
    private Integer sprintSpeed;

    @Column(name = "stamina")
    private Integer stamina;

    @Column(name = "standingTackle")
    private Integer standingTackle;

    @Column(name = "strength")
    private Integer strength;

    @Column(name = "vision")
    private Integer vision;

    @Column(name = "volleys")
    private Integer volleys;

//    @Column(name = "player_id")
//    private Integer playerId;

    @OneToOne
    @JoinColumn(name = "player_id")
    private PlayerPersonalInfoEntity playerPersonalInfo;


    public PlayerPersonalInfoEntity getPlayerPersonalInfo() {
        return playerPersonalInfo;
    }

    public void setPlayerPersonalInfo(PlayerPersonalInfoEntity playerPersonalInfo) {
        this.playerPersonalInfo = playerPersonalInfo;
    }

    public Integer getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Integer acceleration) {
        this.acceleration = acceleration;
    }

    public Integer getAggression() {
        return aggression;
    }

    public void setAggression(Integer aggression) {
        this.aggression = aggression;
    }

    public Integer getAgility() {
        return agility;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getBallControl() {
        return ballControl;
    }

    public void setBallControl(Integer ballControl) {
        this.ballControl = ballControl;
    }

    public Integer getComposure() {
        return composure;
    }

    public void setComposure(Integer composure) {
        this.composure = composure;
    }

    public Integer getCrossing() {
        return crossing;
    }

    public void setCrossing(Integer crossing) {
        this.crossing = crossing;
    }

    public Integer getCurve() {
        return curve;
    }

    public void setCurve(Integer curve) {
        this.curve = curve;
    }

    public Integer getDribbling() {
        return dribbling;
    }

    public void setDribbling(Integer dribbling) {
        this.dribbling = dribbling;
    }

    public Integer getFinishing() {
        return finishing;
    }

    public void setFinishing(Integer finishing) {
        this.finishing = finishing;
    }

    public Integer getFreeKickAccuracy() {
        return freeKickAccuracy;
    }

    public void setFreeKickAccuracy(Integer freeKickAccuracy) {
        this.freeKickAccuracy = freeKickAccuracy;
    }

    public Integer getGkDiving() {
        return gkDiving;
    }

    public void setGkDiving(Integer gkDiving) {
        this.gkDiving = gkDiving;
    }

    public Integer getGkHandling() {
        return gkHandling;
    }

    public void setGkHandling(Integer gkHandling) {
        this.gkHandling = gkHandling;
    }

    public Integer getGkKicking() {
        return gkKicking;
    }

    public void setGkKicking(Integer gkKicking) {
        this.gkKicking = gkKicking;
    }

    public Integer getGkPositioning() {
        return gkPositioning;
    }

    public void setGkPositioning(Integer gkPositioning) {
        this.gkPositioning = gkPositioning;
    }

    public Integer getGkReflexes() {
        return gkReflexes;
    }

    public void setGkReflexes(Integer gkReflexes) {
        this.gkReflexes = gkReflexes;
    }

    public Integer getHeadingAccuracy() {
        return headingAccuracy;
    }

    public void setHeadingAccuracy(Integer headingAccuracy) {
        this.headingAccuracy = headingAccuracy;
    }

    public Integer getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(Integer interceptions) {
        this.interceptions = interceptions;
    }

    public Integer getJumping() {
        return jumping;
    }

    public void setJumping(Integer jumping) {
        this.jumping = jumping;
    }

    public Integer getLongPassing() {
        return longPassing;
    }

    public void setLongPassing(Integer longPassing) {
        this.longPassing = longPassing;
    }

    public Integer getLongShots() {
        return longShots;
    }

    public void setLongShots(Integer longShots) {
        this.longShots = longShots;
    }

    public Integer getMarking() {
        return marking;
    }

    public void setMarking(Integer marking) {
        this.marking = marking;
    }

    public Integer getPenalties() {
        return penalties;
    }

    public void setPenalties(Integer penalties) {
        this.penalties = penalties;
    }

    public Integer getPositioning() {
        return positioning;
    }

    public void setPositioning(Integer positioning) {
        this.positioning = positioning;
    }

    public Integer getReactions() {
        return reactions;
    }

    public void setReactions(Integer reactions) {
        this.reactions = reactions;
    }

    public Integer getShortPassing() {
        return shortPassing;
    }

    public void setShortPassing(Integer shortPassing) {
        this.shortPassing = shortPassing;
    }

    public Integer getShotPower() {
        return shotPower;
    }

    public void setShotPower(Integer shotPower) {
        this.shotPower = shotPower;
    }

    public Integer getSlidingTackle() {
        return slidingTackle;
    }

    public void setSlidingTackle(Integer slidingTackle) {
        this.slidingTackle = slidingTackle;
    }

    public Integer getSprintSpeed() {
        return sprintSpeed;
    }

    public void setSprintSpeed(Integer sprintSpeed) {
        this.sprintSpeed = sprintSpeed;
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public Integer getStandingTackle() {
        return standingTackle;
    }

    public void setStandingTackle(Integer standingTackle) {
        this.standingTackle = standingTackle;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getVision() {
        return vision;
    }

    public void setVision(Integer vision) {
        this.vision = vision;
    }

    public Integer getVolleys() {
        return volleys;
    }

    public void setVolleys(Integer volleys) {
        this.volleys = volleys;
    }

}
