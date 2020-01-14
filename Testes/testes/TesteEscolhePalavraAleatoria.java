package testes;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import palavrasEmbaralhadas.BancoDePalavras;

public class TesteEscolhePalavraAleatoria {

	@Test
	public void testEscolhePalavraAleatoria() throws IOException {
		BancoDePalavras bp = new BancoDePalavras();
		bp.carregaInicialBancoDePalavrasArquivo();
		String palavraFornecida = bp.retiraPalavraAleatoriaDoBanco();
		
		
		// teste se a palavra fornecida está contida no banco de palavras
		assertEquals(true, bp.getBancoDePalavrasHashMap().containsValue(palavraFornecida));
		
		// teste para ver se a palavra fornecida foi excluída do banco atual (para que o jogo não repita as palavras do banco
		int tamanhoHashMapAtual = bp.getBancoDePalavrasHashMap().size() - 1;
		assertEquals(tamanhoHashMapAtual,bp.getBancoDePalavrasAtualizadoHashMap().size(),0);
		assertEquals(false, bp.getBancoDePalavrasAtualizadoHashMap().containsValue(palavraFornecida));
		
		
	}

}
