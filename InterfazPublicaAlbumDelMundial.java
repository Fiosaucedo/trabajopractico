import java.util.ArrayList;
import java.util.List;

public interface IAlbumDelMundial {
	ArrayList<Usuario> participantes= new ArrayList <Usuario>();
	/**
	 * Registra un nuevo participante y devuelve el codigo unico del album
	 * asociado.
	 * 
	 * Si el participante ya está registrado o el tipo de album es invalido, 
	 * se debe lanzar una excepcion.
	 */
	int registrarParticipante(int dni, String nombre, String tipoAlbum); throws Exception {
		if (!esta(dni)){
			throw new Exception ("el participante tiene que estar registrado");}
		Usuario participante= new Usuario ();
		participante.dni = dni;
		participante.nombre=nombre;
		participante.tipoalbum=tipoAlbum;
		participantes.add(participante);
		if (tipoAlbum.equals(web)){
		Fabrica.generaralbumweb;
		}
		if (tipoAlbum.equals(tradicional)){
			Fabrica.generaralbumtradicional;
		}
		if (tipoAlbum.equals(extendido))){
			Fabrica.generaralbumextendido;
		}
	}
	/**
	 * Se generan 4 figuritas al azar y 
	 * se asocia al participante correspondiente identificado por dni
	 * 
	 * Si el participante no está registrado, se debe lanzar una excepción.
	 */
	void comprarFiguritas(int dni); throws Exception{
		if (!esta(dni)){
			throw new Exception ("el participante tiene que estar registrado");
		for (int i = 0; i <4; i++){ 
			participantes.get(esta(dni)).coleccionfigus.add(fabrica.generarsobre(4));
		}
	}
	
	/**
	 * Se generan 4 figuritas top 10 al azar y 
	 * se asocia al participante correspondiente identificado por dni
	 * 
	 * Si el participante no está registrado, se debe lanzar una excepción.
	 * Si el participante no tiene album top10, se debe lanzar una excepción.
	 */
	void comprarFiguritasTop10(int dni);throws Exception{
		if (!esta(dni)){
			throw new Exception ("el participante tiene que estar registrado");}
		for (int i = 0; i <4; i++){ 
			participantes.get(esta(dni)).coleccionfigus.add(fabrica.generarsobretop10(4));
		}

	/**
	 * Compra por única vez un grupo de 4 figuritas con el codigo promocional 
	 * asociado a su album web. 
	 * 
	 * Si el participante no está registrado, se debe lanzar una excepción.
	 * Si el participante no tiene codigo de sorteo o el mismo ya fué usado,
	 * se debe lanzar una excepcion.
	 */
	void comprarFiguritasConCodigoPromocional(int dni);throws Exception{
		if (!esta(dni)){
			throw new Exception ("el participante tiene que estar registrado");}
		if (participante.codigopromusado==true) {
			throw new Exception ("ya utilizo este código");
		}
		for (int i = 0; i <4; i++){ 
			participantes.get(esta(dni)).coleccionfigus.add(fabrica.generarsobre(4));
		}
	}

	/**
	 * Busca entre las figuritas del participante cuales aún no están en el 
	 * album y las asocia.
	 * Devuelve una lista con las figuritas asociadas. 
	 * De cada figurita se devuelve un string "$pais-$numeroJugador"
	 * 
	 * Si el participante no está registrado, se debe lanzar una excepción.
	 */
	List<String> pegarFiguritas(int dni);

	/**
	 * Verifica si el participante identificado por dni ya completó el album.
	 * Devuelve true si está completo, sino false.
	 * Este metodo debe resolverse en O(1)
	 *  
	 * Si el participante no está registrado, se debe lanzar una excepción.
	 */
	boolean llenoAlbum(int dni);
	
	/**
	 * Realiza el sorteo instantaneo con el codigo asociado al album 
	 * tradicional del participante y devuelve algun premio al azar.
	 *  
	 * Si el participante no está registrado, se debe lanzar una excepción.
	 * Si no tiene codigo para el sorteo o ya fue sorteado, se debe lanzar
	 * una excepcion.
	 */
	String aplicarSorteoInstantaneo(int dni);

	/**
	 * Busca si el participante tiene alguna figurita repetida y devuelve 
	 * el codigo de la primera que encuentre.
	 * Si no encuentra ninguna, devuelve el codigo -1. 
	 *  
	 * Si el participante no está registrado, se debe lanzar una excepción.
	 */
	int buscarFiguritaRepetida(int dni);
	
	/**
	 * Dado el dni de un participante A y el codigo de una figurita, 
	 * se busca entre los participantes con mismo tipo de album 
	 * si alguno tiene repetida alguna figurita que le falte al participante A 
	 * con un valor menor o igual al de la figurita a cambiar.
	 * En caso de encontrar alguno, realiza el intercambio y devuelve true.
	 * Si no se encuentra ninguna para cambiar, devuelve false.
	 * 
	 * 
	 * Si el participante no está registrado o no es dueño de la figurita a 
	 * cambiar, se debe lanzar una excepción.
	 */
	boolean intercambiar(int dni, int codFigurita);
	
	/**
	 * Dado el dni de un participante, busca una figurita repetida e intenta 
	 * intercambierla
	 * Devuelve true si pudo intercambiarla. Sino, devuelve false.
	 * 
	 * Si el participante no está registrado, se debe lanzar una excepción.
	 */
	boolean intercambiarUnaFiguritaRepetida(int dni);
	
	/**
	 * Dado el dni de un participante, se devuelve el nombre del mismo.
	 * 
	 * Si el participante no está registrado, se debe lanzar una excepción.
	 */
	String darNombre(int dni);throws Exception{
		if (!esta(dni)){
			throw new Exception ("el participante tiene que estar registrado");}
			 for (participantes: participante) {
				 if (participante.dni.equals(dni))
					 return participante.get(dni).nombre;
			 }
			 return "";
		 }
	/**
	 * Dado el dni de un participante, devuelve el premio correspondiente 
	 * por llenar el album.
	 * 
	 * Si el participante no está registrado, se debe lanzar una excepcion.
	 * Si no tiene el album completo, se debe lanzar una excepcion.
	 */
	String darPremio(int dni);
		for (participantes: participante) {
			if (participante.dni.equals(dni)) {
				if (participante.)
			}
		}
	/**
	 * Devuelve un string con la lista de todos los participantes que 
	 * tienen su album completo y el premio que les corresponde.
	 * El listado debe respetar el siguiente formato para cada ganador:
	 *     " - ($dni) $nombre: $premio"
	 */
	String listadoDeGanadores();
	
	/**
	 * Devuelve una lista con todos los participantes que llenaron el pais
	 * pasado por parametro.
	 * 
	 * De cada participante se devuelve el siguiente String: 
	 *     "($dni) $nombre: $tipoAlbum"
	 */
	 List<String> participantesQueCompletaronElPais(String nombrePais);
	 
	static boolean esta (int dni) {
		 for (participantes : participante) {
		 if (participante.dni.equals(dni))
			 return true;
		 return false;
	 }
	 }
	 
}
