package application;

import entities.Produto;
import util.ProdutoServico;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
   public static void main(String[] args) {

       List<Produto> lista = new ArrayList<>();

       lista.add(new Produto("Notebook",1500.60));
       lista.add(new Produto("Fone de ouvido",50.00));
       lista.add(new Produto("Tv 29 Lg",3650.54));
       lista.add(new Produto("Armario Itatiaia",2506.30));
       lista.add(new Produto("Tablet Asus",3500.00));

       ProdutoServico ps = new ProdutoServico();
       double soma = ps.somaProdutos(lista, p -> p.getPreco() > 2500.00);
       System.out.println("Soma " + String.format("%.2f",soma));

    }
}