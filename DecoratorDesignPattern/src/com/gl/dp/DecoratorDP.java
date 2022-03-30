package com.gl.dp;

public class DecoratorDP {

	public static void main(String[] args) {
		Computer computer=new GamingComputer(new BasicComputer());
		computer.assembleComputer();
		System.out.println("-------------------------");
		Computer scomputer=new SuperComputer(new GamingComputer(new BasicComputer()));
		scomputer.assembleComputer();
	}
}

interface Computer{
	public void assembleComputer();
}

class BasicComputer implements Computer{
	public void assembleComputer() {
		System.out.println("basic computer assmbled");
	}
}
class ComputerDecorator implements Computer{
	protected Computer computer;

	public ComputerDecorator(Computer computer) {
		this.computer=computer;
		
	}

	@Override
	public void assembleComputer() {
		this.computer.assembleComputer();
		
	}
	
}
class GamingComputer extends ComputerDecorator{
	protected Computer computer;

	public GamingComputer(Computer computer) {
		super(computer);
		
	}

	@Override
	public void assembleComputer() {
		super.assembleComputer();
		System.out.println("adding the features of gaming computer");
	}
	
}

class SuperComputer extends ComputerDecorator{
	protected Computer computer;

	public SuperComputer(Computer computer) {
		super(computer);
		
	}

	@Override
	public void assembleComputer() {
		super.assembleComputer();
		System.out.println("adding the features of super computer");
	}
	
}