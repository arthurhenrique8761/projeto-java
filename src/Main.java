import model.Projeto;

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("    SISTEMA DE PROJETOS");
        System.out.println("===========================");
        System.out.println("Bem-vindo ao sistema!");
        System.out.println("\nProjeto: Portifólio Acadêmico");
        System.out.println("Desenvolvido em Java");
        System.out.println("Versão: 1.0");

        Projeto projeto1 = new Projeto(
            1,
            "Sistema Acadêmico",
            "Software para gerenciamento acadêmico",
            "Software",
            "Em desenvolvimento"
        );

        Projeto projeto2 = new Projeto(
            2,
            "Site Institucional",
            "Web site de uma instituição",
            "Web",
            "Concluído"
        );
        
        projeto1.exibirDados();
        projeto2.exibirDados();

    }
}
