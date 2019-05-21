-- start standalone

create table club_info (
    id bigint(20) PRIMARY KEY,
    name varchar(50) NOT NULL,
    logo varchar(500) NOT NULL,
    createdat TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updatedat TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deletedat DATETIME DEFAULT NULL
);


create table player_personal_info (
    id bigint(20) PRIMARY KEY,
    name varchar(50) NOT NULL,
    age bigint(10) NOT NULL,
    photo varchar(500) NOT NULL,
    nationality varchar(500) NOT NULL,
    flag varchar(500) NOT NULL,
    overall bigint(10) NOT NULL,
    potential bigint(10) NOT NULL,
    value varchar(500) NOT NULL,
    wage varchar(500) NOT NULL,
    special bigint(10) NOT NULL,
    club_id bigint(20) NOT NULL,
    createdat TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updatedat TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deletedat DATETIME DEFAULT NULL,
    CONSTRAINT `club_id_fk_1` FOREIGN KEY (`club_id`) REFERENCES `club_info` (`id`)
);



create table player_position_data (
     id bigint(20) PRIMARY KEY,
     CAM bigint(10) not null,
     CB	bigint(10) not null,
     CDM bigint(10) not null,
     CF	bigint(10) not null,
     CM	bigint(10) not null,
     PLAYER_ID	bigint(20) not null,
     LAM bigint(10) not null,
     LB	bigint(10) not null,
     LCB bigint(10) not null,
     LCM bigint(10) not null,
     LDM bigint(10) not null,
     LF	bigint(10) not null,
     LM	bigint(10) not null,
     LS	bigint(10) not null,
     LW	bigint(10) not null,
     LWB bigint(10) not null,
     PREF_POS varchar(500) not null,
     RAM bigint(10) not null,
     RB	bigint(10) not null,
     RCB bigint(10) not null,
     RCM bigint(10) not null,
     RDM bigint(10) not null,
     RF	bigint(10) not null,
     RM	bigint(10) not null,
     RS	bigint(10) not null,
     RW	bigint(10) not null,
     RWB bigint(10) not null,
     ST bigint(10) not null,
     createdat TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
     updatedat TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
     deletedat DATETIME DEFAULT NULL,
     CONSTRAINT `player_id_fk_1` FOREIGN KEY (`PLAYER_ID`) REFERENCES `player_personal_info` (`id`)
);

create table player_attribute_data (
   id bigint(20) PRIMARY KEY,
        acceleration bigint(10) not null,
        aggression bigint(10) not null,
        agility	bigint(10) not null,
        balance	bigint(10) not null,
        ballControl	bigint(10) not null,
        composure	bigint(10) not null,
        crossing	bigint(10) not null,
        curve	bigint(10) not null,
        dribbling	bigint(10) not null,
        finishing	bigint(10) not null,
        freeKickAccuracy	bigint(10) not null,
        gkDiving	bigint(10) not null,
        gkHandling	bigint(10) not null,
        gkKicking	bigint(10) not null,
        gkPositioning	bigint(10) not null,
        gkReflexes	bigint(10) not null,
        headingAccuracy	bigint(10) not null,
        interceptions	bigint(10) not null,
        jumping	bigint(10) not null,
        longPassing	bigint(10) not null,
        longShots	bigint(10) not null,
        marking	bigint(10) not null,
        penalties	bigint(10) not null,
        positioning	bigint(10) not null,
        reactions	bigint(10) not null,
        shortPassing	bigint(10) not null,
        shotPower	bigint(10) not null,
        slidingTackle	bigint(10) not null,
        sprintSpeed	bigint(10) not null,
        stamina	bigint(10) not null,
        standingTackle	bigint(10) not null,
        strength	bigint(10) not null,
        vision	bigint(10) not null,
        volleys bigint(10) not null,
        player_id	bigint(20) not null,
        createdat TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
        updatedat TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
        deletedat DATETIME DEFAULT NULL,
          CONSTRAINT `player_id_fk_2` FOREIGN KEY (`player_id`) REFERENCES `player_personal_info` (`id`)
);

-- end standalone




