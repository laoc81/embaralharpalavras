package palavrasEmbaralhadas;

import java.io.IOException;
import java.util.HashMap;

public abstract class EmbaralhadorSuper implements Embaralhador {

	public String modoEmbaralhamento;
	public String palavraDaRodada;
	public String embaralhadaFinal;
	public BancoDePalavras bp = new BancoDePalavras();
	public HashMap<Integer, String> bancoDePalavrasAtualizadoHashMap = new HashMap<Integer, String>(BancoDePalavras.bancoDePalavrasAtualizadoHashMap);
	public boolean cargaInicial;
	
	@Override
	public String pegarPalavra() throws IOException {
		if (cargaInicial = false) {
			bancoDePalavrasAtualizadoHashMap.putAll(bp.carregaInicialBancoDePalavrasArquivo());
			cargaInicial = true;
		}
		palavraDaRodada = bp.retiraPalavraAleatoriaDoBanco();
		bancoDePalavrasAtualizadoHashMap.remove(bp.radSorteado);
		BancoDePalavras.bancoDePalavrasAtualizadoHashMap.putAll(bancoDePalavrasAtualizadoHashMap);
		return palavraDaRodada;
	}

	@Override
	public String pegarEembaralharAPalavraPega(String palavra) {
		return "null";
	}
	
	@Override
	public HashMap<Integer, String> bancoDeDadosAtualizado() {
		return bancoDePalavrasAtualizadoHashMap;
	}

}
