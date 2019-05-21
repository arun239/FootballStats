package com.arun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * Created by arun on 10/02/19.
 */
@Entity(name = "player_position_data")
public class PlayerPositionEntity extends BaseEntity {
    @Column(name = "CAM")
    private Integer cam;

    @Column(name = "CB")
    private Integer cb;

    @Column(name = "CDM")
    private Integer cdm;

    @Column(name = "CF")
    private Integer cf;

    @Column(name = "CM")
    private Integer cm;

    @Column(name = "LAM")
    private Integer lam;

    @Column(name = "LB")
    private Integer lb;

    @Column(name = "LCB")
    private Integer lcb;

    @Column(name = "LCM")
    private Integer lcm;

    @Column(name = "LDM")
    private Integer ldm;

    @Column(name = "LF")
    private Integer lf;

    @Column(name = "LM")
    private Integer lm;

    @Column(name = "LS")
    private Integer ls;

    @Column(name = "LW")
    private Integer lw;

    @Column(name = "LWB")
    private Integer lwb;

    @Column(name = "PREF_POS")
    private String preferredPosition;

    @Column(name = "RAM")
    private Integer ram;

    @Column(name = "RB")
    private Integer rb;

    @Column(name = "RCB")
    private Integer rcb;

    @Column(name = "RCM")
    private Integer rcm;

    @Column(name = "RDM")
    private Integer rdm;

    @Column(name = "RF")
    private Integer rf;

    @Column(name = "RM")
    private Integer rm;

    @Column(name = "RS")
    private Integer rs;

    @Column(name = "RW")
    private Integer rw;

    @Column(name = "RWB")
    private Integer rwb;

    @Column(name = "ST")
    private Integer st;

//    @Column(name = "PLAYER_ID")
//    private Long playerId;
    @OneToOne
    @JoinColumn(name = "PLAYER_ID")
    private PlayerPersonalInfoEntity playerPersonalInfo;

    public Integer getCam() {
        return cam;
    }

    public void setCam(Integer cam) {
        this.cam = cam;
    }

    public Integer getCb() {
        return cb;
    }

    public void setCb(Integer cb) {
        this.cb = cb;
    }

    public Integer getCdm() {
        return cdm;
    }

    public void setCdm(Integer cdm) {
        this.cdm = cdm;
    }

    public Integer getCf() {
        return cf;
    }

    public void setCf(Integer cf) {
        this.cf = cf;
    }

    public Integer getCm() {
        return cm;
    }

    public void setCm(Integer cm) {
        this.cm = cm;
    }

    public Integer getLam() {
        return lam;
    }

    public void setLam(Integer lam) {
        this.lam = lam;
    }

    public Integer getLb() {
        return lb;
    }

    public void setLb(Integer lb) {
        this.lb = lb;
    }

    public Integer getLcb() {
        return lcb;
    }

    public void setLcb(Integer lcb) {
        this.lcb = lcb;
    }

    public Integer getLcm() {
        return lcm;
    }

    public void setLcm(Integer lcm) {
        this.lcm = lcm;
    }

    public Integer getLdm() {
        return ldm;
    }

    public void setLdm(Integer ldm) {
        this.ldm = ldm;
    }

    public Integer getLf() {
        return lf;
    }

    public void setLf(Integer lf) {
        this.lf = lf;
    }

    public Integer getLm() {
        return lm;
    }

    public void setLm(Integer lm) {
        this.lm = lm;
    }

    public Integer getLs() {
        return ls;
    }

    public void setLs(Integer ls) {
        this.ls = ls;
    }

    public Integer getLw() {
        return lw;
    }

    public void setLw(Integer lw) {
        this.lw = lw;
    }

    public Integer getLwb() {
        return lwb;
    }

    public void setLwb(Integer lwb) {
        this.lwb = lwb;
    }

    public String getPreferredPosition() {
        return preferredPosition;
    }

    public void setPreferredPosition(String preferredPosition) {
        this.preferredPosition = preferredPosition;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getRb() {
        return rb;
    }

    public void setRb(Integer rb) {
        this.rb = rb;
    }

    public Integer getRcb() {
        return rcb;
    }

    public void setRcb(Integer rcb) {
        this.rcb = rcb;
    }

    public Integer getRcm() {
        return rcm;
    }

    public void setRcm(Integer rcm) {
        this.rcm = rcm;
    }

    public Integer getRdm() {
        return rdm;
    }

    public void setRdm(Integer rdm) {
        this.rdm = rdm;
    }

    public Integer getRf() {
        return rf;
    }

    public void setRf(Integer rf) {
        this.rf = rf;
    }

    public Integer getRm() {
        return rm;
    }

    public void setRm(Integer rm) {
        this.rm = rm;
    }

    public Integer getRs() {
        return rs;
    }

    public void setRs(Integer rs) {
        this.rs = rs;
    }

    public Integer getRw() {
        return rw;
    }

    public void setRw(Integer rw) {
        this.rw = rw;
    }

    public Integer getRwb() {
        return rwb;
    }

    public void setRwb(Integer rwb) {
        this.rwb = rwb;
    }

    public Integer getSt() {
        return st;
    }

    public void setSt(Integer st) {
        this.st = st;
    }

    public PlayerPersonalInfoEntity getPlayerPersonalInfo() {
        return playerPersonalInfo;
    }

    public void setPlayerPersonalInfo(PlayerPersonalInfoEntity playerPersonalInfo) {
        this.playerPersonalInfo = playerPersonalInfo;
    }
}
