public class introsort {

    public static void main(String[] args) {
        int[] tabela = { 5, 4, 3, 8, 312, 4134, 4576, 4, 242, 545, 65, 25, 6, 64, 46, 656, 887, 424, 53, 56, 74, 624 };
        introSort(tabela);
        izpis(tabela);
    }

    static void izpis(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    static void menjaj(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void heapSort(int[] tab) {
        int n = tab.length;
        // preuredi da bo "max heap"
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(tab, n, i);
        }
        // sortiraj
        for (int i = n - 1; i >= 0; i--) {
            menjaj(tab[0], tab[i]);
            heapify(tab, i, 0);
        }
    }

    static void heapify(int tab[], int n, int i) {
        // poišči največji "root" element in njegova otroka (levi in desni)
        int najvecji = i;
        int levi = 2 * i + 1;
        int desni = 2 * i + 2;
        if ((levi < n) && (tab[levi] > tab[najvecji]))
            najvecji = levi;
        if ((desni < n) && (tab[desni] > tab[najvecji]))
            najvecji = desni;
        // zamenjaj in ponovi heapify, če "root" ni največji
        if (najvecji != i) {
            menjaj(tab[i], tab[najvecji]);
            heapify(tab, n, najvecji);
        }
    }

    static void insertionSort(int[] tab) {
        int n = tab.length;
        for (int i = 1; i < n; i++) {
            int temp = tab[i];
            int j = i - 1;// konec neurejenega dela
            while ((j >= 0) && (tab[j] > temp)) {// dokler je števiprvi večje ali ni prvi element
                tab[j + 1] = tab[j];
                j--;
            }
            tab[j + 1] = temp;// vrednost zapiše na ustrezno mesto
        }
    }

    static int mediana_treh_stevil(int prvi,int sredina,  int zadnji) {
        int mediana;
        if (sredina < prvi) {
            if (zadnji < sredina) {
                mediana = sredina;
            } else {
                mediana = (zadnji < prvi) ? zadnji : prvi;
            }
        } else {
            if (zadnji < sredina) {
                mediana = (zadnji < prvi) ? prvi : zadnji;
            } else {
                mediana = sredina;
            }
        }
        return mediana;
    }

    static void introSort(int[] tab) {

    }

}
