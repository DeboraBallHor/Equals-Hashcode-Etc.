package br.com.digitalhouse;

public class Aluno {

    private int ra;
    private String nome;
    private String sobreNome;
    private Curso curso;

    public Aluno() {
    }

    public Aluno(int ra, String nome, String sobreNome, Curso curso) {
        this.ra = ra;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.curso = curso;

    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public int hashCode() {
        return ra + nome.hashCode();
    }

    @Override
    public String toString() {
        return "RA: " + getRa() + "\nNome" + getNome() + "\nsobrenome: " + getSobreNome() + "\nCurso: " +getCurso().getNome();
    }
}