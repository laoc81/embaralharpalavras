package palavrasEmbaralhadas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public class BancoDePalavras {
	
	private HashMap<Integer, String> bancoDePalavrasHashMap= new HashMap<Integer, String>();
	public static HashMap<Integer, String> bancoDePalavrasAtualizadoHashMap = new HashMap<Integer, String>();
	private BufferedReader bufferDeArquivo;
	public int radSorteado;
	String palavraAleatoria;
	
	public HashMap<Integer, String> carregaInicialBancoDePalavrasArquivo() throws IOException  {
		
		String linha = new String();
		String caminhoArquivo = "D:\\DESENVOLVIMENTO\\Curso JAVA ITA\\Trabalho semana 6\\Trabalho final\\PalavrasTrabalho.txt";
		FileReader leitorDeArquivo = new FileReader(caminhoArquivo);
		bufferDeArquivo = new BufferedReader(leitorDeArquivo);
		int i = 1;
		while(true) {
			linha = bufferDeArquivo.readLine();
			if (linha == null) {
				break;
			}
			bancoDePalavrasHashMap.put(i, linha);
			i++;
		}
		bufferDeArquivo.close();
		leitorDeArquivo.close();
		bancoDePalavrasAtualizadoHashMap.putAll(bancoDePalavrasHashMap);
		return bancoDePalavrasHashMap;
		
	}
	
	public String retiraPalavraAleatoriaDoBanco() {
		Random rad = new Random();
		radSorteado = rad.nextInt(bancoDePalavrasAtualizadoHashMap.size());
		while (((radSorteado != 0) && (bancoDePalavrasAtualizadoHashMap.containsKey(radSorteado))) == false) {
			radSorteado = rad.nextInt(bancoDePalavrasAtualizadoHashMap.size());
		}
			palavraAleatoria = bancoDePalavrasAtualizadoHashMap.get(radSorteado);
			bancoDePalavrasAtualizadoHashMap.remove(radSorteado);
		
		return palavraAleatoria;
	}
	
	public HashMap<Integer, String> getBancoDePalavrasHashMap() {
		return bancoDePalavrasHashMap;
	}
	
	public HashMap<Integer, String> getBancoDePalavrasAtualizadoHashMap() {
		return bancoDePalavrasAtualizadoHashMap;
	}

	public void imprimeBancoEmHashMap() {
		System.out.println(bancoDePalavrasHashMap.clone());
	}
	
	public void imprimeBancoEmHashMapAtualizado() {
		System.out.println(bancoDePalavrasAtualizadoHashMap.clone());
	}
	
	
}
