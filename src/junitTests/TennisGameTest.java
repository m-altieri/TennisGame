package junitTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tennis.GameAlreadyFinishedException;
import tennis.InvalidPlayerException;
import tennis.TennisGame;
import junit.framework.Assert;

public class TennisGameTest {

	private TennisGame game;
	
	@Before
	public void setUp() {
		
	}
	
	@After
	public void tearDown() {
		
	}
	
	@Test
	public void match1() throws InvalidPlayerException, GameAlreadyFinishedException {
		game = new TennisGame();
		
		assertEquals("Score: 15 - Love", game.scored(game.getPlayer(1)));
		assertEquals("Score: 30 - Love", game.scored(game.getPlayer(1)));
		assertEquals("Score: 40 - Love", game.scored(game.getPlayer(1)));
		assertEquals("Player 1 wins!", game.scored(game.getPlayer(1)));
	}
	
	@Test
	public void match2() throws InvalidPlayerException, GameAlreadyFinishedException {
		game = new TennisGame();
		
		assertEquals("Score: 15 - Love", game.scored(game.getPlayer(1)));
		assertEquals("Score: 30 - Love", game.scored(game.getPlayer(1)));
		assertEquals("Score: 40 - Love", game.scored(game.getPlayer(1)));
		assertEquals("Player 1 wins!", game.scored(game.getPlayer(1)));
	}
	
	@Test
	public void match3() throws InvalidPlayerException, GameAlreadyFinishedException {
		game = new TennisGame();
		
		assertEquals("Score: 15 - Love", game.scored(game.getPlayer(1)));
		assertEquals("Score: 30 - Love", game.scored(game.getPlayer(1)));
		assertEquals("Score: 30 - 15", game.scored(game.getPlayer(2)));
		assertEquals("Score: 30 - 30", game.scored(game.getPlayer(2)));
		assertEquals("Score: 40 - 30", game.scored(game.getPlayer(1)));
		assertEquals("Score: Deuce", game.scored(game.getPlayer(2)));
		assertEquals("Score: Advantage - 40", game.scored(game.getPlayer(1)));
		assertEquals("Score: Deuce", game.scored(game.getPlayer(2)));
		assertEquals("Score: 40 - Advantage", game.scored(game.getPlayer(2)));
		assertEquals("Player 2 wins!", game.scored(game.getPlayer(2)));
	}
	
}
