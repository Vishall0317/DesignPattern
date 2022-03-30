package com.gl;

public class StrategyDP{
	public static void main(String[] args) {
		Problem problem=new Problem("find the smalled path between two points");
		problem.solve(new Algorithm1());
		problem.solve(new Algorithm2());
	}
	
}
interface SolutionStrategy{
	public void solve();
}

class Algorithm1 implements SolutionStrategy{

	@Override
	public void solve() {
		System.out.println("solving the problem using algorithm1");
		
	}
	
}
class Algorithm2 implements SolutionStrategy{

	@Override
	public void solve() {
		System.out.println("solving the problem using algorithm2");
		
	}
	
}

class Problem{

	private String problemStatement;
	public Problem(String problemStatement) {
		this.problemStatement=problemStatement;
		
	}
	public String getProblemStatement() {
		return problemStatement;
	}
	public void setProblemStatement(String problemStatement) {
		this.problemStatement = problemStatement;
	}
	public void solve(SolutionStrategy solutionStrategy) {
		solutionStrategy.solve();
	}
}




