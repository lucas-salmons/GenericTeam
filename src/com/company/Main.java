package com.company;

public class Main {

    public static void main(String[] args) {
	    FootballPlayer joe = new FootballPlayer("Joe");
	    BaseballPlayer pat = new BaseballPlayer("Pat");
	    SoccerPlayer beckham = new SoccerPlayer("Beckham");

	    Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
	    adelaideCrows.addPlayer(joe);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this wont work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorne = new Team<>("Hawthorne");
		Team<FootballPlayer> fremantle = new Team<>("Fremantle");

		hawthorne.matchResult(fremantle, 1, 0);
		hawthorne.matchResult(adelaideCrows,3,8);

		adelaideCrows.matchResult(fremantle,2,1);

		System.out.println("Rankings");
		System.out.println(adelaideCrows.getName()+ ": "+ adelaideCrows.ranking());
		System.out.println(melbourne.getName()+ ": "+ melbourne.ranking());
		System.out.println(fremantle.getName()+ ": "+ fremantle.ranking());
		System.out.println(hawthorne.getName()+ ": "+ hawthorne.ranking());

		System.out.println(adelaideCrows.compareTo(melbourne));



    }
}
