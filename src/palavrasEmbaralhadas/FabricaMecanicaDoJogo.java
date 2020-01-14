package palavrasEmbaralhadas;

public class FabricaMecanicaDoJogo {
	
	public static MecanicaDoJogo escolheModalidadeDaMecanicaDoJogo(int dificuldade) {
			if(dificuldade == 1) { 
				return new MecanicaDoJogoFacil();
			}else {
				if(dificuldade == 2) {
					return new MecanicaDoJogoMedia();
				}else {
					if(dificuldade == 3) {
						return new MecanicaDoJogoDificil();
					}else {
						return null;
					}
				}
			}
	}
	
	
}
