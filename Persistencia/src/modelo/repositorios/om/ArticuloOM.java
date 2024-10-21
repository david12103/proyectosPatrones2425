package modelo.repositorios.om;

import java.util.ArrayList;
import java.util.List;
import modelo.dominio.Articulo;
import modelo.repositorios.Populable;

public class ArticuloOM implements Populable<Articulo>{
	public int cantidad=50;

    private static final String[] DESCRIPCIONES_FERRETERIA = {
        "Martillo de acero", "Destornillador plano", "Taladro inal�mbrico", "Caja de clavos", 
        "Llave inglesa", "Cinta m�trica", "Tornillos de acero", "Broca de taladro", 
        "Alicates multiusos", "Sierra manual", "Juego de llaves Allen", "Cinta aislante", 
        "Nivel de burbuja", "Papel de lija", "Tuber�a de PVC", "Junta de goma", 
        "Llave de tubo", "Cutter retr�ctil", "Escuadra met�lica", "Mango de rodillo", 
        "Lijadora el�ctrica", "Masilla para juntas", "Pistola de silicona", "Cerradura de seguridad", 
        "Candado de acero", "Bisagras de puerta", "Pletinas met�licas", "Perforadora de pared", 
        "Guantes de trabajo", "Gafas de protecci�n", "Mascarilla antipolvo", "Tornillo de banco", 
        "Pala de jardiner�a", "Cepillo de alambre", "Esponja de acero", "Grapadora industrial", 
        "Mango de destornillador", "Broca de percusi�n", "Sargento de presi�n", "Alicate de presi�n", 
        "Juego de puntas de destornillador", "Tubo de silicona", "Cepillo para metal", 
        "Taladro percutor", "Cinta de embalar", "Grapas industriales", "Rodillo para pintura", 
        "Esp�tula met�lica", "Tijeras de podar", "Tijeras multiusos", "Malla met�lica"
    };

    private List<Articulo> createArticulos(int cantidad) {
        List<Articulo> articulos = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            Long id = (long) i;
            String descripcion = DESCRIPCIONES_FERRETERIA[i % DESCRIPCIONES_FERRETERIA.length];
            float precio = 5.0f + (i % 10) * 1.5f; // Precios variados
            articulos.add(new Articulo(id, descripcion, precio));
        }
        return articulos;
    }

   	@Override
	public List<Articulo> getElementos() {
		return createArticulos(cantidad);
	}
}
