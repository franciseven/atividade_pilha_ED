public class PilhaSequencial {

    //instanciando variáveis para o uso da pilha
    private int[] elementos;
    private int topo = -1;
    private int tamMax = 10;

    //instanciação do construtor
    public PilhaSequencial() {
        elementos = new int[tamMax];
    }

    //verificando se a pilha está vazia
    public boolean isEmpty() {
        return (topo == -1);
    }

    //verificando se a pilha está cheia
    public boolean isFull() {
        return (topo == 9);
    }

    //método que colocará elementos na  caso a pilha não esteja cheia
    public void push(int a) {
        if (isFull() == false) {
            topo++;
            elementos[topo] = a;
        }
    }

    //método que irá retirar elementos da pilha
    public int pop() {

        //lançando uma exceção caso a pilha esteja vazia
        if(isEmpty()) {
            throw new RuntimeException("Não há elementos para retirar");
        }

        int a;
        a = elementos[topo];
        topo--;
        return a;
    }

    //método que retornará o elemento presente no topo da lista, assim como também irá retornar -1 caso a lista esteja vazia
    public int top() {
        
        if(isEmpty()) {
            return -1;
        }
        
        return elementos[topo];
    }

    //método que retornará o tamanho da lista
    public int size() {
        return topo+1;
    }

    //exibindo os valores da lista
    public void show() {
        for(int i = 0; i < size(); i++) {
            System.out.println("valores presentes na pilha: " + elementos[i]);
        }
    }

}
