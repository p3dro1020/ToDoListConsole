package dolist;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Tarefa> tarefas;
    
    public Lista()
    {
        tarefas = new ArrayList<Tarefa>();
    }
    
    public void addTarefa(Tarefa tarefa)
    {
        tarefas.add(tarefa);
    }

    public void concluirTarefa(int index)
    {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.get(index).setConcluida(true);
        } else {
            System.out.println("Indice invalido.");
        }
    }
    
    public void excluirTarefa(int index)
    {
        tarefas.remove(index);
    }
    
    @Override
    public String toString() {
        return "" + tarefas;
    }

    
 
}
