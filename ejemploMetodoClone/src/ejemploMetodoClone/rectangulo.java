package ejemploMetodoClone;

/*La clase objeto de la clonación deberá de implementar la interfaz cloneable.
Si no se implementa esta interfaz, el programa lanzará una excepción del tipo
CloneNotSupportedException. Se ha implementado el método clone que hace una
llamada al método clone( ) de su clase base. 
 */

public class rectangulo implements Cloneable {
	private int ancho;
	private int alto;
	private String nombre;

	public Object clone( ) {
		Object objeto = null;
		try {
			objeto = super.clone( );
		} catch (CloneNotSupportedException ex) {
			System.out.println("Error al duplicar");
		}
		return objeto;
	}
	
	rectangulo (int an, int al) {
		ancho = an;
		this.alto = al;
	}

		public int getAncho ( ) {
			return this.ancho;
		}

		public int getAlto ( ) {
			return alto;
		}
		
		public void setNombre(String name){
			nombre = name;
		}

		public String getNombre( ){
			return nombre;
		}

		public rectangulo incrementarAncho ( ) {
			ancho++;
			return this;
		}

		public rectangulo incrementarAlto ( ) {
			this.alto++;
			return this;
		}
		
		public static void main(String[ ] args) {
			rectangulo r1 = new rectangulo(5, 7);
			rectangulo r2 = (rectangulo)
			r1.clone( );
			r2.incrementarAncho( );
			r2.incrementarAlto( );
			r1.setNombre("Chiquito" );
			r2.setNombre("Grande" );
			System.out.println("R1: nombre: "+r1.getNombre());
			System.out.println("R1: alto: "+r1.getAlto());
			System.out.println("R1: ancho: "+r1.getAncho());
			System.out.println("R2: nombre: "+r2.getNombre());
			System.out.println("R2: alto: "+r2.getAlto());
			System.out.println("R2: ancho: "+r2.getAncho());
		}
}