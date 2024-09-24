package dolist;

import java.util.Scanner;

public class DoList {
    
    public static void main(String[] args) {
        Lista l = new Lista();
        Scanner scanner = new Scanner(System.in);
        int aux = 1;

        do
        {
            System.out.println("-=-=-=-MENU-=-=-=-");
            System.out.println("-1 Adicionar tarefas");
            System.out.println("-2 Visualizar tarefas");
            System.out.println("-3 Concluir tarefa");
            System.out.println("-4 Excluir tarefa");
            aux = scanner.nextInt();
            scanner.nextLine();
            
            switch(aux)
            {
                case 0:
                    System.out.println("Bye bye");
                    break;
                case 1:
                    System.out.println(">>>Entre com a nome da tarefa: ");
                    String nome = scanner.nextLine();

                    System.out.println(">>>Entre com a descricao da tarefa: ");
                    String desc = scanner.nextLine();

                    l.addTarefa(new Tarefa(nome,desc));
                    System.out.println("Tarefa add com sucesso");
                    break;
                case 2:
                    System.out.println(l);
                    break;
                case 3:
                    System.out.println(l);
                    System.out.println(">>>Digite o numero da tarefa concluida(0...): ");
                    int tarefaConcluida = scanner.nextInt();
                    l.concluirTarefa(tarefaConcluida);
                    System.out.println("Tarefa concluida");
                    break;
                case 4:
                    System.out.println(l);
                    System.out.println(">>>Informe o index que deseja excluir (0...): ");
                    int index = scanner.nextInt();
                    l.excluirTarefa(index);
                    
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }

        }while(aux != 0);
        
        scanner.close();
    }
    
}
