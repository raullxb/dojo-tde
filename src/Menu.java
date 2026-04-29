import java.util.ArrayList;

public class Menu{

    public void inicio(){
        ArrayList<Contato> contatos = new ArrayList<>();
        int opcao;
        do {
            IO.println("Menu");
            IO.println("Digite opcao desejada: ");
            IO.println("1- Adicionar contato ");
            IO.println("2- Editar contato ");
            IO.println("3- Remover contato ");
            IO.println("0 - Sair ");
            opcao = Integer.parseInt(IO.readln("Opção escolhida"));
            switch (opcao){
                case 1:
                    this.adicionarContato(contatos);
                    break;
                case 2:
                    this.editarContato(contatos);
                    break;
                case 3:
                    this.removerContato(contatos);
                    break;
                case 4:
                    this.listarContatos(contatos);
                    break;
                case 0:
                    break;
                default:
                    break;
            }

        } while (opcao != 0);

    }
    public void adicionarContato(ArrayList<Contato> contatos){
        String nome = IO.readln("Qual o nome do contato: ");
        String email = IO.readln("Qual o email do contato: ");

        Contato contato = new Contato(nome, email);
        contatos.add(contato);
    }
    public void editarContato(ArrayList<Contato> contatos){
        IO.println("Escolha um contato para editar: ");
        for (int i = 0; i < contatos.size(); i++) {
            System.out.println("indice"+ i +contatos.get(i));

        }
        int indiceEscolhindo = Integer.parseInt(IO.readln("Digite o indice: "));

        String nome = IO.readln("Qual o nome do contato: ");
        String email = IO.readln("Qual o email do contato: ");

        contatos.get(indiceEscolhindo).setNome(nome);
        contatos.get(indiceEscolhindo).setEmail(email);

    }
    public void removerContato(ArrayList<Contato> contatos){
            IO.println("Escolha um contato para remover: ");
            for (int i = 0; i < contatos.size(); i++) {
                System.out.println("indice" + i + contatos.get(i));
            }
            int indiceEscolhindo = Integer.parseInt(IO.readln("Digite o indice: "));
            Contato contato = contatos.get(indiceEscolhindo);
            contatos.remove(contato);
    }
    public void listarContatos(ArrayList<Contato> contatos){
        IO.println("Lista de contatos: ");
        for (int i = 0; i < contatos.size(); i++) {
            System.out.println(contatos.get(i).toString());
        }
    }
}