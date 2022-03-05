package projects.tic.tac.toe;

import lombok.Getter;

public class UserStatistics {
    @Getter int numberOfGamesPlayed;
    @Getter int numberOfMatchesWon;

    public void updateUserStatistics(Boolean isWon){
        numberOfGamesPlayed++;
        if(isWon){
            numberOfMatchesWon++;
        }
    }

}
