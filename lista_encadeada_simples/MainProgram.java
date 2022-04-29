package lista_encadeada_simples;

import java.util.Scanner;

public class MainProgram {


    public static void main(String[] args) {
        /*
        Professor ou aluno sera apagado 
        vamos deixar só uma lista de aluno ou professor pra facilitar 
        Codificar o metodo imprimirLista dentro de Lista_Simples
        Criar um metodo para exibir o tamanho da lista
        Criar um metodo para exibir o primeiro elemento da lista
        */
        Lista_Simples listaProfessores = new Lista_Simples();
        Lista_Simples listaAlunos= new Lista_Simples();

        while(true) {
            System.out.println("Escolha a ação que deseja executar:"
                    + "\n1-Cadastrar Professor" // aluno
                    + "\n2-Cadastrar Aluno" // imprimir lista de alunos
                    + "\n3-Editar dados do Aluno"); // imprimir total de alunos
                    // imprimir primeiro aluno da lista
            System.out.println("Digite o número da ação que deseja executar: ");
            Scanner menu = new Scanner(System.in);
            int acao = menu.nextInt();
    
            Alunos a = new Alunos();
    
    
            switch(acao) {
                case 1: // aqui sera a criação aluno
                    int fim2 = 0;
    
                    Scanner nomeA = new Scanner(System.in);
                    System.out.println("\nDigite o nome do Professor:");
                    String nomeProfessor = nomeA.nextLine();
                    a.setNome(nomeProfessor);
                    System.out.println("\nO nome é "+a.getNome());
    
                    Scanner matriculaM = new Scanner(System.in);
                    System.out.println("\nDigite a Matrícula do Professor:");
                    int matricula = matriculaM.nextInt();
                    a.setMatricula(matricula);
                    System.out.println("\na Matriucla é "+ a.getMatricula());
    
                    int fim;
                    do {
                        listaProfessores.inserirPrimeiro(a);
                        fim2++;
                        break;
                    }while(fim2 != 0);
    
                    //System.out.println(listaProfessores.imprimirLista(a));
    
                    break;
    
                case 2: // aqui sera impresso a lista de alunos
                   
                    System.out.println("\nDigite a sua Matrícula: ");
                    Scanner editar = new Scanner(System.in);
                    int matriculaExiste = editar.nextInt();
                   
                    while (listaAlunos.a.getMatricula() != matriculaExiste) {
                        if (matriculaExiste != listaAlunos.a.getMatricula()){
                            
                            System.out.println();
                            listaAlunos.getAux().getProx();
                            System.out.println(listaAlunos.getAux());
                            
                        }
                        else {
                            //M2.getListademdc().pesquisarNo(crmexiste);
                            System.out.println("\nDigite a sua Matrícula: ");
                            Scanner nova = new Scanner(System.in);
                            int novaMatricula = nova.nextInt();
                            listaAlunos.a.setMatricula(novaMatricula);
                        }
                    }
                    break;
    
            }
        }
    }
    
        
    
    
}
