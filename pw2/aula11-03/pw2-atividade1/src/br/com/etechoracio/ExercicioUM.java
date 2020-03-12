package br.com.etechoracio;

public class ExercicioUM {

	public static boolean ehdiasemana(String dia) {
		return !(dia.equalsIgnoreCase("domingo")|| dia.equalsIgnoreCase("sabado") || 
				dia.equalsIgnoreCase("segunda") || dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("quarta")||
				dia.equalsIgnoreCase("quinta") || dia.equalsIgnoreCase("sexta"));
		
	
	}

	public static void main(String[] args) {
		boolean diavalido = ehdiasemana("domingo");
		System.out.println("é dia da semana " + diavalido);
	}
}