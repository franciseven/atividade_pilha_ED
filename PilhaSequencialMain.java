public class PilhaSequencialMain {

    public static void main(String[] args) {

        //instanciando a pilha vazia
        PilhaSequencial pilha = new PilhaSequencial();

        //colocando elementos na pilha
        pilha.push(5);
        pilha.push(2);
        pilha.push(4);
        pilha.push(7);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);
        pilha.push(60);
        
        //valor sobressalente que não entrará na lista porque excede o tamanho máximo
        pilha.push(70);

        //retirando elementos da pilha
        pilha.pop();
        pilha.pop();

        //mostrando o elemento presente no topo da pilha ou se não há elemento
        if(pilha.top() == -1) {
            System.out.println("\nNão há qualquer elemento no topo da");
        }
        else {
            System.out.println("\nvalor presente no topo da pilha: " + pilha.top());
        }
        
        //mostrando se a pilha está vazia ou não
        if(pilha.isEmpty() == true) {
            System.out.println("\na pilha está vazia");
        }
        else {
            System.out.println("\na pilha não está vazia");
        }

        //mostrando o tamanho da lista
        System.out.println("\ntamanho da lista: " + pilha.size() + "\n");

        //exibindo os valores presentes na lista
        pilha.show();
    }
}