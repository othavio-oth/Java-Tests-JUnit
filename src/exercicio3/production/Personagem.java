package exercicio3.production;

import java.util.Random;

abstract class Personagem {
	
	String nome;
	int vida = 100;
	int mana = 100;
	int inteligencia, forca; 
	int level = 1;
	float xp = 0;	
	
	

	public Personagem(String nome, int inteligencia, int forca) {
		this.nome = nome;
		this.inteligencia = inteligencia;
		this.forca = forca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public float getXp() {
		return xp;
	}

	public void setXp(float xp) {
		this.xp = xp;
	}
	
	
	
	
	public void attack(int atributo) {
		Random aleatorio = new Random();
		int numeroAleatorio = aleatorio.nextInt(300);
		int ataque = (atributo*level)+numeroAleatorio;
		System.out.printf("%s lancou um ataque de dano %s!\n  ", this.nome, ataque);
	}

	public void lvlUp(int atributo1, int atributo2) {
		this.level++;
		atributo1+=20;
		atributo2+=35;
		
		System.out.printf("Agora o nivel de %s e %s! \n",nome, level);
		
	}

	
	
}
