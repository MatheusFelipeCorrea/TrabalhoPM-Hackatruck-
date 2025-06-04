package src.View;


import src.Controller.*;
import src.Model.*;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EquipeController equipeCtrl = new EquipeController();
        ProjetoController projetoCtrl = new ProjetoController();
        ApresentacaoController apresentacaoCtrl = new ApresentacaoController();

        // Criando universidades
        Universidade puc = new Universidade("PUC Minas", "1234567890001");
        Universidade ufmg = new Universidade("UFMG", "9876543210001");

        // Criando equipes
        Equipe equipe1 = equipeCtrl.criarEquipe("Alpha");
        Equipe equipe2 = equipeCtrl.criarEquipe("Beta");

        // Adicionando estudantes às equipes
        for (int i = 1; i <= 5; i++) {
            equipeCtrl.adicionarEstudante(equipe1, new Estudante("Aluno A" + i, "1111111111" + i, puc, "A" + i));
            equipeCtrl.adicionarEstudante(equipe2, new Estudante("Aluno B" + i, "2222222222" + i, ufmg, "B" + i));
        }

        // Criando orientadores
        Profissional orientador1 = new Profissional("Prof. João", "33333333333", puc, "Orientador");
        Profissional orientador2 = new Profissional("Prof. Maria", "44444444444", ufmg, "Orientadora");

        // Criando projetos
        Projeto projeto1 = projetoCtrl.criarProjeto(orientador1, equipe1, "Sistema de Votação", "Projeto para eleições online");
        Projeto projeto2 = projetoCtrl.criarProjeto(orientador2, equipe2, "App de Eventos", "Aplicativo para gestão de eventos");

        // Criando bancas
        Banca banca1 = new Banca();
        Banca banca2 = new Banca();

        for (int i = 1; i <= 4; i++) {
            banca1.adicionarJurado("Jurado A" + i, puc, "Avaliador", "5555555555" + i);
            banca2.adicionarJurado("Jurado B" + i, ufmg, "Avaliador", "6666666666" + i);
        }

        // Simulando notas dos jurados
        for (Jurado j : banca1.getJurados()) {
            banca1.setNota(j, (int) (Math.random() * 3 + 7)); // entre 7 e 9
        }
        for (Jurado j : banca2.getJurados()) {
            banca2.setNota(j, (int) (Math.random() * 3 + 6)); // entre 6 e 8
        }

        // Criando salas
        Sala sala1 = new Sala("101", 30);
        Sala sala2 = new Sala("102", 25);

        // Criando apresentações
        Apresentacao ap1 = apresentacaoCtrl.criarApresentacao(projeto1, banca1, sala1, LocalDateTime.now());
        Apresentacao ap2 = apresentacaoCtrl.criarApresentacao(projeto2, banca2, sala2, LocalDateTime.now().plusHours(1));

        // Avaliando projetos
        apresentacaoCtrl.avaliarProjeto(ap1);
        apresentacaoCtrl.avaliarProjeto(ap2);

        // Listar projetos aprovados
        System.out.println("PROJETOS APROVADOS:");
        List<Projeto> aprovados = EquipesSingleton.getInstancia().listarProjetosAprovados();
        for (Projeto p : aprovados) {
            System.out.printf("- %s (Nota: %.2f)\n", p.getTitulo(), p.getNotaFinal());
        }

        //Nome dos integrantes do trabalho

        System.out.println("Feito por: Matheus Felipe Correa e Alice Shikida");
    }
}
