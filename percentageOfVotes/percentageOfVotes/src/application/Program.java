package application;

import entities.ElectionPercentage;

public class Program {

	public static void main(String[] args) {

		ElectionPercentage percentage = new ElectionPercentage(800, 150, 50);
		
		System.out.println("Percentual das Elei��os");
		System.out.println("Total de eleitores: " + percentage.totalVoters());
		System.out.println("Percentual de votos v�lidos: " + percentage.validVotes() + "%");
		System.out.println("Percentual de votos em branco: " + percentage.blankVotes() + "%");
		System.out.println("Percentual de votos nulos: " + percentage.nullVotes() + "%");
	}

}
