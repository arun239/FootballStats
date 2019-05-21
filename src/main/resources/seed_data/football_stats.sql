

INSERT INTO `club_info` (`id`, `name`, `logo`, `createdat`, `updatedat`, `deletedat`)
VALUES
	(1,'Real Madrid CF','https://cdn.sofifa.org/24/18/teams/243.png','2018-09-30 04:52:26','2018-09-30 04:52:26',NULL),
	(2,'FC Barcelona','https://cdn.sofifa.org/24/18/teams/241.png','2018-09-30 04:52:26','2018-09-30 04:52:26',NULL),
	(3,'Paris Saint-Germain','https://cdn.sofifa.org/24/18/teams/73.png','2018-09-30 04:52:26','2018-09-30 04:52:26',NULL),
	(4,'FC Bayern Munich','https://cdn.sofifa.org/24/18/teams/21.png','2018-09-30 04:52:26','2018-09-30 04:52:26',NULL);


INSERT INTO `player_personal_info` (`id`, `name`, `age`, `photo`, `nationality`, `flag`, `overall`, `potential`, `value`, `wage`, `special`, `club_id`,  `createdat`, `updatedat`, `deletedat`)
VALUES
	('20801', 'Cristiano Ronaldo',	32,	'https://cdn.sofifa.org/48/18/players/20801.png',	'Portugal',	'https://cdn.sofifa.org/flags/38.png',	94,	94, '€95.5M', '€565K',	2228, 1, '2018-09-30 04:52:26','2018-09-30 04:52:26',NULL),
    ('158023', 'L. Messi',	30,	'https://cdn.sofifa.org/48/18/players/158023.png',	'Argentina', 'https://cdn.sofifa.org/flags/52.png',	93,	93, '€105M',	'€565K',	2154, 2, '2018-09-30 04:52:26','2018-09-30 04:52:26',NULL),
    ('190871', 'Neymar',	25,	'https://cdn.sofifa.org/48/18/players/190871.png',	'Brazil',	'https://cdn.sofifa.org/flags/54.png',	92,	94, '€123M',	'€280K',	2100, 3, '2018-09-30 04:52:26','2018-09-30 04:52:26',NULL),
    ('176580', 'L. Suárez',	30,	'https://cdn.sofifa.org/48/18/players/176580.png',	'Uruguay',	'https://cdn.sofifa.org/flags/60.png',	92,	92, '€97M',	'€510K',	2291, 2, '2018-09-30 04:52:26','2018-09-30 04:52:26',NULL),
    ('167495', 'M. Neuer',	31,	'https://cdn.sofifa.org/48/18/players/167495.png',	'Germany',	'https://cdn.sofifa.org/flags/21.png',	92,	92, '€61M',	'€230K',	1493, 4, '2018-09-30 04:52:26','2018-09-30 04:52:26',NULL),
    ('188545', 'R. Lewandowski',	28,	'https://cdn.sofifa.org/48/18/players/188545.png',	'Poland',	'https://cdn.sofifa.org/flags/37.png',	91,	91, '€92M',	'€355K', 2143, 4, '2018-09-30 04:52:26','2018-09-30 04:52:26',NULL);

INSERT INTO `player_attribute_data` (`id`,`acceleration`,`aggression`,`agility`,`balance`,`ballControl`,`composure`,`crossing`,`curve`,`dribbling`,`finishing`,`freeKickAccuracy`,`gkDiving`,`gkHandling`,`gkKicking`,`gkPositioning`,`gkReflexes`,`headingAccuracy`,`interceptions`,`jumping`,`longPassing`,`longShots`,`marking`,`penalties`,`positioning`,`reactions`,`shortPassing`,`shotPower`,`slidingTackle`,`sprintSpeed`,`stamina`,`standingTackle`,`strength`,`vision`,`volleys`,`player_id`,`createdat`,`updatedat`,`deletedat`)
VALUES
    (1, 89, 63,	89,	63,	93,	95,	85,	81,	91,	94,	76,	7,	11,	15,	14,	11,	88,	29,	95,	77,	92,	22,	85,	95,	96,	83,	94,	23,	91,	92,	31,	80,	85,	88, 20801, '2018-09-30 04:52:26','2018-09-30 04:52:26',NULL),
    (2, 89, 63,	89,	63,	93,	95,	85,	81,	91,	94,	76,	7,	11,	15,	14,	11,	88,	29,	95,	77,	92,	22,	85,	95,	96,	83,	94,	23,	91,	92,	31,	80,	85,	88, 158023, '2018-09-30 04:52:26','2018-09-30 04:52:26',NULL),
    (3, 89, 63,	89,	63,	93,	95,	85,	81,	91,	94,	76,	7,	11,	15,	14,	11,	88,	29,	95,	77,	92,	22,	85,	95,	96,	83,	94,	23,	91,	92,	31,	80,	85,	88, 190871, '2018-09-30 04:52:26','2018-09-30 04:52:26',NULL),
    (4, 89, 63,	89,	63,	93,	95,	85,	81,	91,	94,	76,	7,	11,	15,	14,	11,	88,	29,	95,	77,	92,	22,	85,	95,	96,	83,	94,	23,	91,	92,	31,	80,	85,	88, 176580, '2018-09-30 04:52:26','2018-09-30 04:52:26',NULL),
    (5, 89, 63,	89,	63,	93,	95,	85,	81,	91,	94,	76,	7,	11,	15,	14,	11,	88,	29,	95,	77,	92,	22,	85,	95,	96,	83,	94,	23,	91,	92,	31,	80,	85,	88, 167495, '2018-09-30 04:52:26','2018-09-30 04:52:26',NULL),
    (6, 89, 63,	89,	63,	93,	95,	85,	81,	91,	94,	76,	7,	11,	15,	14,	11,	88,	29,	95,	77,	92,	22,	85,	95,	96,	83,	94,	23,	91,	92,	31,	80,	85,	88, 188545, '2018-09-30 04:52:26','2018-09-30 04:52:26',NULL);

INSERT INTO `player_position_data` (`id`,`CAM`,`CB`,`CDM`,`CF`,`CM`,`PLAYER_ID`,`LAM`,`LB`,`LCB`,`LCM`,`LDM`,`LF`,`LM`,`LS`,`LW`,`LWB`,`PREF_POS`,`RAM`,`RB`,`RCB`,`RCM`,`RDM`,`RF`,`RM`,`RS`,`RW`,`RWB`,`ST`,`createdat`,`updatedat`,`deletedat`)
VALUES
    (1, 89, 53,	62,	91,	82,	20801,	89,	61,	53,	82,	62,	91,	89,	92,	91,	66,	'ST LW', 89, 61, 53,	82,	62,	91,	89,	92,	91,	66,	92, '2018-09-30 04:52:26','2018-09-30 04:52:26',NULL),
    (2, 89, 53,	62,	91,	82,	158023,	89,	61,	53,	82,	62,	91,	89,	92,	91,	66,	'ST LW', 89, 61, 53,	82,	62,	91,	89,	92,	91,	66,	92, '2018-09-30 04:52:26','2018-09-30 04:52:26',NULL),
    (3, 89, 53,	62,	91,	82,	190871,	89,	61,	53,	82,	62,	91,	89,	92,	91,	66,	'ST LW', 89, 61, 53,	82,	62,	91,	89,	92,	91,	66,	92, '2018-09-30 04:52:26','2018-09-30 04:52:26',NULL),
    (4, 89, 53,	62,	91,	82,	176580,	89,	61,	53,	82,	62,	91,	89,	92,	91,	66,	'ST LW', 89, 61, 53,	82,	62,	91,	89,	92,	91,	66,	92, '2018-09-30 04:52:26','2018-09-30 04:52:26',NULL),
    (5, 89, 53,	62,	91,	82,	167495,	89,	61,	53,	82,	62,	91,	89,	92,	91,	66,	'ST LW', 89, 61, 53,	82,	62,	91,	89,	92,	91,	66,	92, '2018-09-30 04:52:26','2018-09-30 04:52:26',NULL),
    (6, 89, 53,	62,	91,	82,	188545,	89,	61,	53,	82,	62,	91,	89,	92,	91,	66,	'ST LW', 89, 61, 53,	82,	62,	91,	89,	92,	91,	66,	92, '2018-09-30 04:52:26','2018-09-30 04:52:26',NULL);
