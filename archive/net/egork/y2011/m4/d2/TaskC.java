package net.egork.y2011.m4.d2;

import net.egork.utils.solver.Solver;
import net.egork.utils.io.inputreader.InputReader;

import java.io.PrintWriter;

public class TaskC implements Solver {
	public void solve(int testNumber, InputReader in, PrintWriter out) {
		int n = in.readInt();
		int m = in.readInt();
		long result = ((long)(n + 2) / 3) * ((m + 2) / 3);
		out.println(result);
	}
}

