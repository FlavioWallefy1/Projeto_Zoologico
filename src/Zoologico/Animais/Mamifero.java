package Zoologico.Animais;

public class Mamifero extends Animal {

	private String tipoDePelagem;
	private boolean machucado;

	public Mamifero() {
		// TODO Auto-generated constructor stub
	}

	public Mamifero(String tipoDePelagem) {
		super();
		this.tipoDePelagem = tipoDePelagem;
	}

	public String getTipoDePelagem() {
		return tipoDePelagem;
	}

	public void setTipoDePelagem(String tipoDePelagem) {
		this.tipoDePelagem = tipoDePelagem;
	}
	
    @Override
    public boolean isMachucado() {
        return machucado;
    }

    public void setMachucado(boolean machucado) {
        this.machucado = machucado;
    }
}
