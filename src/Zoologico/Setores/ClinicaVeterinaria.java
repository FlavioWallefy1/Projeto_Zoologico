package Zoologico.Setores;

import java.util.List;

import Zoologico.Animais.Animal;
import Zoologico.Pessoa.Visitante;

public class ClinicaVeterinaria extends Setores {

	List<Animal> animais;

	public ClinicaVeterinaria() {
		// TODO Auto-generated constructor stub

	}

	public ClinicaVeterinaria(List<Animal> animais) {
		super();
		this.animais = animais;
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

	public void setVisitante(Visitante visitante) {
		// TODO Auto-generated method stub


	}
}
