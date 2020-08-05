package ejemplo;

public class FuncionAdvanced {

	public static void main(String[] args) {
			
		Campo LaptopCnew = new Ventilador (new Soporte(new Laptop()));
		Mostrar(LaptopCnew);
	}
	
	static void Mostrar(Campo componente) {
		System.out.println(componente.name() );
		System.out.println(componente.price());
		System.out.println("----------");
	}

	
}
