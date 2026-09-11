import model.Project;

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("    SISTEMA DE PROJETOS");
        System.out.println("===========================");
        System.out.println("Bem-vindo ao sistema!");
        System.out.println("\nProjeto: Portifólio Acadêmico");
        System.out.println("Desenvolvido em Java");
        System.out.println("Versão: 1.0");

        Projeto projeto = new Projeto();

        Projeto.setId(1);
        Projeto.setNome("Sistema Acadêmico");
        Projeto.setDescricao("Sistema para gerenciamento acadêmico");
        Projeto.setCategoria("Software");
        Projeto.setStatus("Em desenvolvimento");

        // imprimir os dados do objeto


    }
}