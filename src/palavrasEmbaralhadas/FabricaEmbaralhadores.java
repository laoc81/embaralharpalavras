package palavrasEmbaralhadas;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public class FabricaEmbaralhadores {
	
	
	// QUANTIDADE DE IMPLEMENTAÇÕES DA INTERFACE
	int numEmbaralhadores = 3;
	String modoEmbaralhamento;
	String palavraNormal;
	String palavraEmbaralhada; 
	boolean cargaInicial;
	BancoDePalavras bp;
	HashMap<Integer, String> bancoDePalavrasAtualizadoHashMap;
	String palavraDaRodada;
	
	Random ale = new Random();
	
	// Método que retorna palavra embaralhada aleatoriamente
	public String embaralharAPalavraDaRodadaAleatoriamente(String palavra) throws IOException {
			int i = ale.nextInt(numEmbaralhadores);
			if (i==0) {
				EmbaralhadorInverter emb = new EmbaralhadorInverter();
				palavraEmbaralhada = emb.pegarEembaralharAPalavraPega(palavra);
				modoEmbaralhamento = emb.modoEmbaralhamento;
				return palavraEmbaralhada;
			}else {
				if (i==1) {
					EmbaralhadorRandomicoExcetoDuasPrimeiras emb = new EmbaralhadorRandomicoExcetoDuasPrimeiras();
					palavraEmbaralhada = emb.pegarEembaralharAPalavraPega(palavra);
					modoEmbaralhamento = emb.modoEmbaralhamento;
					return palavraEmbaralhada;
				}else {
					if (i==2) {
						EmbaralhadorRandomicoTudo emb = new EmbaralhadorRandomicoTudo();
						palavraEmbaralhada = emb.pegarEembaralharAPalavraPega(palavra);
						modoEmbaralhamento = emb.modoEmbaralhamento;
						return palavraEmbaralhada;
					}else {
						return "Erro no embaralhamento da palavra, checar o código";
					}
				}	
			}
	}
	
	
	public int getNumEmbaralhadores() {
		return numEmbaralhadores;
	}


	public String getPalavraNormal() {
		return palavraNormal;
	}


	public String getPalavraEmbaralhada() {
		return palavraEmbaralhada;
	}
	
	public String pegaModoEmbaralhamento() {
		return modoEmbaralhamento;
	}
	
	
	

}