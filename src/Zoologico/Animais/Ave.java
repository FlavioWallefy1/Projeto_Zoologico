package Zoologico.Animais;

public class Ave extends Animal {

	private boolean migratoria;

	public Ave() {
		// TODO Auto-generated constructor stub
	}

	public Ave(boolean migratoria) {
		super();
		this.migratoria = migratoria;
	}

	public boolean isMigratoria() {
		return migratoria;
	}

	public void setMigratoria(boolean migratoria) {
		this.migratoria = migratoria;
	}
	
	private boolean machucado;

    @Override
    public boolean isMachucado() {
        return machucado;
    }

    public void setMachucado(boolean machucado) {
        this.machucado = machucado;
    }
}
