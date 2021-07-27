
public class ComecaPorAqui {	
	public static void main(String[] args) {
		Carro objetoUm = new Carro(); // instanciação
		
		objetoUm.modelo = "Camaro";
		objetoUm.cor 	= "Amarelo";
		objetoUm.porta 	= 2;
		objetoUm.quilometragem = 200;
		objetoUm.novo	= true;
		
		System.out.println("Velocímetro: " + objetoUm.velocidade);  // 0
		objetoUm.acelerar();
		
		System.out.println("Velocímetro: " + objetoUm.velocidade); // 10
		objetoUm.acelerar();
		
		System.out.println("Velocímetro: " + objetoUm.velocidade); // 20
		objetoUm.acelerar();
		
		System.out.println("Velocímetro: " + objetoUm.velocidade); // 30
		objetoUm.acelerar();
		
		System.out.println("Velocímetro: " + objetoUm.velocidade); // 40
		
	}
}
