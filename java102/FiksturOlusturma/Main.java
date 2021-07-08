package dev.patika;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        FixtureGenerator<String> fixtureGenerator = new FixtureGenerator();

        List<String> teams = new LinkedList<>();
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");
        //teams.add("Boluspor");

        List<List<Fixture<String>>> rounds = fixtureGenerator.getFixtures(teams, true);
        for(int i=0; i<rounds.size(); i++){
            System.out.println("Round " + (i+1));
            List<Fixture<String>> round = rounds.get(i);
            for(Fixture<String> fixture: round){
                System.out.println(fixture.getHomeTeam() + " vs " + fixture.getAwayTeam());
            }
            System.out.println("");
        }

    }
}