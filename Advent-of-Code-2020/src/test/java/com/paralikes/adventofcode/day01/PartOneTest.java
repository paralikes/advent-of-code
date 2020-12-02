package com.paralikes.adventofcode.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import com.paralikes.adventofcode.ChallengeException;
import com.paralikes.adventofcode.ChallengeTest;
import com.paralikes.adventofcode.FileInput;
import com.paralikes.adventofcode.IChallenge;

class PartOneTest extends ChallengeTest<FileInput, Integer> {


	@Override
	public IChallenge<FileInput, Integer> getChallenge() {
		return new PartOne();
	}
	
	@Override
	public FileInput getInput() {
		return new FileInput("./src/test/resources/Day01/input.txt");
	}
	
	@Override
	public Integer getOutput() {
		return 63616;
	}
	
	
	@Override
	public void testRequirements() throws ChallengeException {
		PartOne challenge = new PartOne();
		
		assertEquals(514579, challenge.calculate(Arrays.stream(new int[] { 1721, 979, 366, 299, 675, 1456 })));
	}
	
}
