package palavrasEmbaralhadas;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	static int dificuldade;
	static MecanicaDoJogo mj;
	static Scanner in;
	static Scanner palavraTela;
	static Scanner jogarNovamente;
	
	public static void main(String[] args) throws IOException {
		
		boolean desejaJogar = true;
			do {
			String tentativa;
			int numDesejaJogar;
	
			System.out.println("--------------------------------------");
			System.out.println("JOGO ADIVINHAR PALAVRAS EMBARALHADAS");
			System.out.println("INSTRUÇÕES:");
			System.out.println("- Para ganhar o jogo, você deve acertar 3 (três) palavras sem zerar suas vidas.");
			System.out.println("- A cada erro, você perde 1 vida.");
			System.out.println("");
			System.out.println("Que tipo de jogo deseja jogar?!");
			System.out.println("");
			System.out.println("1 -> Jogo fácil   (6 vidas) -  1 ponto a cada acerto");
			System.out.println("2 -> Jogo médio   (4 vidas) -  3 pontos a cada acerto");
			System.out.println("3 -> Jogo difícil (2 vidas) - 10 pontos a cada acerto");
			System.out.println("");
			System.out.println("Digite o número da dificuldade abaixo:");
			in = new Scanner(System.in);
			System.out.println("");
		
				try {
				dificuldade = in.nextInt();		
				System.out.println("");
						try {
						mj = FabricaMecanicaDoJogo.escolheModalidadeDaMecanicaDoJogo(dificuldade);
									do {
									System.out.println("Vidas: "+mj.retornaVidas());
									System.out.println("Pontuação atual: "+mj.retornaPontuacaoAtual());
									System.out.println("");
									System.out.println("_____________________________________________________");
									System.out.println("");
									System.out.println("");
									mj.escolhePalavraDaRodada();
									System.out.println("Palavra embaralhada: "+mj.embaralhaPalavraDaRodada());
									System.out.println("Digite sua tentativa: ");
									palavraTela = new Scanner(System.in);
									tentativa = palavraTela.nextLine();
									mj.acertouAPalavra(tentativa);
									mj.jogoTermina();
									}while(!mj.retornaJogoTerminou());
						
						System.out.println("Deseja jogar novamente?");
						System.out.println("");
						System.out.println("qualquer tecla -> SIM");
						System.out.println("             2 -> NÃO");
						System.out.println("");
						System.out.println("Digite");
						jogarNovamente = new Scanner(System.in);
						numDesejaJogar = jogarNovamente.nextInt();
						
										try {
												if(numDesejaJogar == 1) {
													desejaJogar = true;
												}else {
													if (numDesejaJogar == 2) {
														desejaJogar = false;
													}
												}
										} catch (InputMismatchException d) {
											System.out.println("");
										} catch (NullPointerException e) {	
											System.out.println("");
										}
									
								
						} catch (InputMismatchException d) {
							System.out.println("Você escolheu dificuldade inválida. APRENDA A LER!!! Digite novamente ");
						} catch (NullPointerException e) {	
							System.out.println("Você escolheu dificuldade inválida. APRENDA A LER!!! Digite novamente ");
						}
						
				
				} catch (InputMismatchException d) {
					System.out.println("Você escolheu opção inválida. APRENDA A LER!!! Digite novamente ");
				} catch (NullPointerException e) {	
					System.out.println("Você escolheu opção inválida. APRENDA A LER!!! Digite novamente ");
				}
				
				
			}while(desejaJogar);
		
		
		in.close();
		
		palavraTela.close();
		
	}

	
}
