# Albus
Football Stats HomeLane


### Requirements:
> mysql (with DB name footballstats)
(For seed data, please refer resouces/seed_data/football_stats.sql)



### USAGE:

To build the project; use this command inside main directory
> mvn clean install

To Run the project; use this command inside main directory
> mvn spring-boot:run -Dspring.config.location=src/main/resources/ -Duser.timezone=GMT

To Access the SwaggerAPI documentation :
> http://localhost:8080/swagger-ui.html


### PS :
> All the APIs are under Authentication API Key. (Key with HeaderName can be found in application.properties)
> Implemented APIs
    >get_player_info(player_name)
     This API should take player_name as the input and retrieve extensive data about that player from the database.
     The data should contain the player’s personal details , stats, affiliations, traits  and overall potential.

    >get_club_player_list(club_name)
     This API retrieves the names of all the players who play for a specific club.
     It should take club_name as the input and retrieve extensive data about all the players who play for that club.
     The data should contain all the player’s personal details, stats, affiliations, traits and overall potential.

     [Brownie points]
    >For get_player_info (player_name) API
     If more than one players match the player_name, sort the retrieved entries in the order of (1) Years of experience, and further sorted by (2) Number of matches played and (3) Overall potential.

