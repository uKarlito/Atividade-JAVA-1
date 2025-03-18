public class Principal {

    //Método principal, por onde o programa comça
    public static void main(String[] args) {

        //Criar um objeto a partir da classe Piloto

        Piloto bortoleto = new Piloto();
        bortoleto.nome = "Gabriel Bortoleto";
        bortoleto.equipe = "Sauber";
        bortoleto.peso = 45;
        bortoleto.vitorias = 0;

        //Criar um outro objeto do Piloto

        Piloto hamilton = new Piloto();
        hamilton.nome = "Lewis Hamilton";
        hamilton.equipe = "Ferrari";
        hamilton.peso = 73.5f;
        hamilton.vitorias = 105;

        //Exibir os valores

        System.out.println(bortoleto.nome);
        System.out.println(bortoleto.vitorias);

        System.out.println(hamilton.nome + " " + hamilton.peso);
        System.out.println(hamilton.vitorias);

        System.out.println(bortoleto);
        System.out.println(hamilton);


    }
}
