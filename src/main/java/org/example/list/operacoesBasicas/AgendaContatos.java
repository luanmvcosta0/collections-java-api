package org.example.list.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Luan", 998304453);
        agendaContatos.adicionarContato("Leticia", 824504453);
        agendaContatos.adicionarContato("Mario", 824556853);
        agendaContatos.adicionarContato("Kalina", 922035988);
        agendaContatos.adicionarContato("Lucca", 893458887);
        agendaContatos.exibirContato();

        agendaContatos.removerContato("Luan");
        agendaContatos.exibirContato();

        agendaContatos.pesquisarPorNome("Lucca");
    }

}
