package com.company;

public class Desenvolvedor extends Funcionario implements UsuarioAutenticavel{

    private DadosAutenticacao dadosAutenticacao;

    public Desenvolvedor(String nome, String sexo, double salario, String login, String pass) {
        super(nome,sexo,salario);
        dadosAutenticacao = new DadosAutenticacao(login, pass);
    }


    @Override
    public boolean autentica(String login, String senha) {
        if(login.equals(dadosAutenticacao.getLogin()) && senha.equals(dadosAutenticacao.getSenha()))
            return true;
        else return false;
    }
}
