package com.br.students.list;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arlist = new ArrayList<String>();
        boolean run = true;

        do {
            System.out.println("\n");
            System.out.println("Menu");
            System.out.println("Digite 1 para inserir o estudante ");
            System.out.println("Digite 2 para imprimir a lista ");
            System.out.println("Digite 3 para sair do Menu ");
            System.out.println("\n");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Digite o nome do aluno: ");

                String name = scanner.nextLine();
                if (!arlist.contains(name)) {
                    arlist.add(name);
                } else {
                    System.out.println("O aluno já esta cadastrado!");
                }

            } else if (option.equals("2")) {
                System.out.println("Listando ...");
                //for (String student : arlist) {
                  //  System.out.println(student);
                //}
                arlist.forEach(e -> System.out.println(e));
            } else if (option.equals("3")) {
                break;
            }else
                System.out.println("Digite uma opção válida");

        }while (run);
        
        scanner.close();
    }
}
