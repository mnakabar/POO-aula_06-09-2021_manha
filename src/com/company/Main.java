package com.company;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        Funcionario kenyo = new Funcionario("Kenyo", "m", 3000.198);
        Funcionario mauri = new Funcionario("Mauri", "m", 5000.198);
        Funcionario joice = new Funcionario("Joice", "f", 7000.198);
        Funcionario filipe = new Funcionario("Filipe", "m", 10000.198);
        Gerente thiago = new Gerente("Thiago", "m", 13000);
        Vendedor ana = new Vendedor("Ana Carolina", "f", 20000, 100000);
        Desenvolvedor mauricio = new Desenvolvedor("Mauricio", "m", 20000, "mauricio@mail.com","passPort");
        Cliente cliente = new Cliente("cliente@mail.com", "123456");


        boolean autenticacaoMauricio = mauricio.autentica("mauricio@mail.com", "passPort");
        boolean autenticacaoCliente = cliente.autentica("cliente@mail.com", "123456");

        System.out.println("autenticacao do Mauricio: " + autenticacaoMauricio);
        System.out.println("autenticacao do cliente: " + autenticacaoCliente);

        Funcionario[] array = new Funcionario[7];
        array[0] = kenyo;
        array[1] = mauri;
        array[2] = joice;
        array[3] = filipe;
        array[4] = thiago;
        array[5] = ana;
        array[6] = mauricio;

        CalculadorFolha folha = new CalculadorFolha();
        double total = folha.calcula(array);

        System.out.println("total da folha de pagamento: " + total);


        FileOutputStream fos = new FileOutputStream("funcionarios.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.append(kenyo.toString());
        bw.newLine();
        bw.append(mauri.toString());
        bw.newLine();
        bw.append(joice.toString());
        bw.newLine();
        bw.append(filipe.toString());
        bw.newLine();
        bw.append(thiago.toString());
        bw.newLine();
        bw.append(ana.toString());
        bw.newLine();
        bw.append(mauricio.toString());

        bw.close();
    }
}