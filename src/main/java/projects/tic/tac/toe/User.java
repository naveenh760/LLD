package projects.tic.tac.toe;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class User {
    @Getter @Setter public String name;
    @Getter @Setter public String emailId;

    @Builder
    private User(String name, String emailId) {
        this.name = name;
        this.emailId = emailId;
    }

    @Getter @Setter public UserStatistics gameStatistics;
}
