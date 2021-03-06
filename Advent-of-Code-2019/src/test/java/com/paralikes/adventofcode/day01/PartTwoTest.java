package com.paralikes.adventofcode.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.paralikes.adventofcode.ChallengeException;
import com.paralikes.adventofcode.ChallengeTest;
import com.paralikes.adventofcode.FileInput;
import com.paralikes.adventofcode.IChallenge;

class PartTwoTest extends ChallengeTest<FileInput, Integer> {


	@Override
	public IChallenge<FileInput, Integer> getChallenge() {
		return new PartTwo();
	}

	@Override
	public FileInput getInput() {
		return new FileInput("./src/test/resources/Day01/input.txt");
	}

	@Override
	public Integer getOutput() {
		return 4896902;
	}

	
	@Override
	public void testRequirements() throws ChallengeException {
		PartTwo challenge = new PartTwo();
		
		assertEquals(2, challenge.calculateFuel(14));
		assertEquals(966, challenge.calculateFuel(1969));
		assertEquals(50346, challenge.calculateFuel(100756));
	}

}
