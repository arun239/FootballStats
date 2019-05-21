package com.arun.controller;

import com.arun.pojo.PlayerPersonalInfo;
import com.arun.pojo.SimpleMessageResponse;
import com.arun.service.PlayerStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by arun on 11/02/19.
 */
@RestController
@RequestMapping("player")
public class PlayerStatsController {

    @Autowired
    PlayerStatsService playerStatsService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getPlayerInfo(@RequestParam("name") String playerName) {

        List<PlayerPersonalInfo> playerPersonalInfoList = playerStatsService.getPlayers(playerName);

        if (playerPersonalInfoList != null)
            return new ResponseEntity<>(playerPersonalInfoList, HttpStatus.OK);
        else
            return new ResponseEntity<>(new SimpleMessageResponse("player's information doesn't exist"), HttpStatus.NOT_FOUND);
    }
}
