package br.com.generation;
/*leonardo azevedo
 * Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
O número de pessoas calmas;	   OK
O número de mulheres nervosas; OK
O número de homens agressivos; OK
O número de outros calmos;	   OK
O número de pessoas nervosas com mais de 40 anos;OK
O número de pessoas calmas com menos de 18 anos. OK
*/
import java.util.Scanner;

public class ex4 {
public void main(String[] args) {
	
int cont_tentativas = 0, cont_pessoaCalma = 0, cont_mulherNervosa = 0, cont_homemAgressivo = 0, cont_outroCalmo = 0,
		cont_nervoso40 = 0, cont_calmo18 = 0, idade = 0, sexo = 0, perso = 0;

Scanner ler = new Scanner(System.in);


while(cont_tentativas < 150) {
	
	System.out.printf("TENTATIVA NUMERO %d",cont_tentativas);//mostrando o contador só pra eu saber aonde estou
	System.out.println("\nDigite sua idade");
	idade = ler.nextInt();
	sexo = 0; //limpando as 2 variaveis (sexo,perso) para o próximo loop não contar os valores que ficaram do loop anterior
    perso = 0;
    
	while(sexo!=1 && sexo!=2 && sexo!=3) { //enquanto usuario digitar algo diferente das 3 opçoes ele vai ficar pedindo novamente
	System.out.println("\nDigite seu sexo 1 = Masculino | 2 = Feminino | 3 = Outro ");
	sexo = ler.nextInt();
	}
	while(perso!=1 && perso!=2 && perso!=3) { //enquanto usuario digitar algo diferente das 3 opçoes ele vai ficar pedindo pra digitar novamente
	System.out.println("\nDigite sua personalidade 1 = Calmo | 2 = nervoso | 3 = agressivo ");
	perso = ler.nextInt();
	}
	//COMEÇANDO A AUMENTAR OS CONTADORES COM BASE NOS DADOS QUE O USUARIO INSERIU
	
	//contador das pessoas calmas
	if(perso == 1) { 
		cont_pessoaCalma++;
		}
	//contador das mulheres nervosas
	if(sexo==2 && perso==2) {
		cont_mulherNervosa++;
	}
	//contador dos homens agressivos
	if(sexo==1 && perso==3) {
		cont_homemAgressivo++;
	}
	//contador de outros calmos
	if(sexo==3 && perso==1) {
		cont_outroCalmo++;
		}
	//contador de mais de 40 anos nervosos
	if(idade>40 && perso==2) {
		cont_nervoso40++;
		}
	//contador de calmos menores que 18 anos
			if(idade<18 && perso==1) {
				cont_calmo18++;
				}
			
cont_tentativas++; //AUMENTA A TENTATIVA PRA A GENTE PODER SAIR DESSE WHILE DEPOIS QUE BATER A CONDICAO DELE
	
}
System.out.println("\nnumero de pessoas calmas: "+cont_pessoaCalma);
System.out.println("\nnumero de mulheres nervosas: "+cont_mulherNervosa);
System.out.println("\nnumero de homens agressivos: "+cont_homemAgressivo);
System.out.println("\nnumero de outros calmos: "+cont_outroCalmo);
System.out.println("\nnumero de mais de 40 anos nervosos: "+cont_nervoso40);
System.out.println("\nnumero de calmos menores que 18 anos: "+cont_calmo18);


   ler.close();
//fechamentos da classe e do main
}
}

