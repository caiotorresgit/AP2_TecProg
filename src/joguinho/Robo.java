package joguinho;

class Robo {
    private int numeroAlunosEncontrados;
    private int numeroBugsIdentificados;

    public Robo() {
        numeroAlunosEncontrados = 0;
        numeroBugsIdentificados = 0;
    }

    public void incrementarAlunosEncontrados() {
        numeroAlunosEncontrados++;
    }

    public void incrementarBugsIdentificados() {
        numeroBugsIdentificados++;
    }

    public int getNumeroAlunosEncontrados() {
        return numeroAlunosEncontrados;
    }

    public int getNumeroBugsIdentificados() {
        return numeroBugsIdentificados;
    }
}