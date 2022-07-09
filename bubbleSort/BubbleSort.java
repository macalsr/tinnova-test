
    public class BubbleSort {
        public static void main(String[] args) {
            int[] vetor = {5, 3, 2, 4, 7, 1, 0, 6};
            BubbleSort bubbleSort = new BubbleSort();
            bubbleSort.ordenar(vetor);
            for(int num : vetor) {
                System.out.print(num + " ");
            }
        }
        public void ordenar(int[] vetor) {
            for(int i = 0; i < vetor.length - 1; i++) {
                boolean isOrdenado = true;
                for(int j = 0; j < vetor.length - 1 - i; j++) {
                    if(vetor[j] > vetor[j + 1]) {
                        int aux = vetor[j];
                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = aux;
                        isOrdenado = false;
                    }
                }
                if(isOrdenado)
                    break;
            }
        }
    }
