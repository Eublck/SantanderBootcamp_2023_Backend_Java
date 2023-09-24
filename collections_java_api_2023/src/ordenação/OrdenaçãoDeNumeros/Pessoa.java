package ordenação.OrdenaçãoDeNumeros;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
		
		private String nome;
		private int idade;
		private double altura;
		
		
		public Pessoa(String nome, int idade, double altura) {
			this.nome = nome;
			this.idade = idade;
			this.altura = altura;
		}

		
		@Override
		public int compareTo(Pessoa o) {
			return Integer.compare(idade, getIdade());
		}
	
		
		
		public String getNome() {
			return nome;
		}


		public int getIdade() {
			return idade;
		}


		public double getAltura() {
			return altura;
		}


		@Override
		public String toString() {
			return "Pessoa: nome=" + nome 
					+ ", idade=" + idade 
					+ ", altura=" 
					+ altura + " // ";
		}				
}

class comparatorPorAltura implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getAltura(), p2.getAltura());
	}
	
}
