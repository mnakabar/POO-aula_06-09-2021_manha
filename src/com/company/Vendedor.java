package com.company;

public class Vendedor extends Funcionario{

    private double faturamento;

    public Vendedor(String nome, String sexo, double salario, double fataturamento) {
        super(nome,sexo,salario);
        this.faturamento = fataturamento;
    }

    public double getComissao() {
        return faturamento * 0.05;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + getComissao();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "      " + getComissao() + "     " + getSalario();
    }
}