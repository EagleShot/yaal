import net.egork.utils.checker.Checker;
import net.egork.utils.io.inputreader.InputReader;

public class GraphsInEuclideanSpaceChecker extends Checker {
	@Override
	public String check(InputReader input, InputReader expectedOutput, InputReader actualOutput) {
		return tokenCheck(expectedOutput, actualOutput);
	}

	@Override
	public double getCertainty() {
		return 0;
	}
}
