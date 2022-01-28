public class introsort {

    public static void main(String[] args) {
        int[] tabela = { 145, 162, 159, 194, 51, 64, 160, 8, 16, 18, 126, 148 };
        introSort(tabela, tabela.length - 1);
        izpis(tabela);
    }

    static void izpis(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    static void menjaj(int tab[], int a, int b) {
        int temp = tab[a];
        tab[a] = tab[b];
        tab[b] = temp;
    }

    static void heapSort(int[] tab) {// NE DELA
        int n=tab.length;
        // preuredi da bo "max heap"
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(tab, n, i);
        }
        // sortiraj
        for (int i = n - 1; i > 0; i--) {
            menjaj(tab, 0, i);
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
            menjaj(tab, i, najvecji);
            heapify(tab, n, najvecji);
        }
    }

    static void insertionSort(int[] tab, int zacetek, int konec) {
        for (int i = 1; i < konec; i++) {
            int temp = tab[i];
            int j = i - 1;// konec neurejenega dela
            while ((j >= zacetek) && (tab[j] > temp)) {
                tab[j + 1] = tab[j];
                j--;
            }
            tab[j + 1] = temp;// vrednost zapiše na ustrezno mesto
        }
    }

    static void leviDel(int tab[], int i, int neurejeni_konec) {
        if (i > 1) // ponovi funkcijo za levi del
            introSort(tab, i - 1);
        else if (neurejeni_konec - i < 16) {
            insertionSort(tab, 0, neurejeni_konec + 2);
        } else {
            //naredi novo tabelo delTabele
            int delTabele[] = new int[neurejeni_konec - i + 2];
            for (int k = 0; k < delTabele.length; k++) {
                delTabele[k] = tab[i + k];
            }
            heapSort(delTabele);
            for(int k=0;k<delTabele.length;k++){
                tab[i+k]=delTabele[k];
            }
        }
    }

    static void introSort(int tab[], int neurejeni_konec) {
        int tmp[] = { tab[0], tab[neurejeni_konec / 2], tab[neurejeni_konec] };
        insertionSort(tmp, 0, 3);// tmp, celoten array z določeno dolžino
        tab[0] = tmp[0];
        tab[neurejeni_konec / 2] = tmp[1];
        tab[neurejeni_konec] = tmp[2];
        menjaj(tab, neurejeni_konec / 2, neurejeni_konec - 1);
        int pivot = tab[neurejeni_konec - 1];
        int i = 0;
        int j = neurejeni_konec - 2;// začni enomesto levo od pivota
        while (i < j) {
            while (tab[i] < pivot)
                i++;
            while (tab[j] > pivot)
                j--;
            if (i <= j) {// dokler se i in j ne križata
                menjaj(tab, i, j);
                i++;
                j--;
            }
        }
        menjaj(tab, i, neurejeni_konec - 1);// ko se i in j križata, je pivot na mestu
        if (neurejeni_konec - i < 16) {
            insertionSort(tab, i, neurejeni_konec + 1);
        } else {
            int delTabele[] = new int[neurejeni_konec - i + 1];
            for (int k = 0; k < delTabele.length; k++) {
                delTabele[k] = tab[i + k];
            }
            heapSort(delTabele);
            for(int k=0;k<delTabele.length;k++){
                tab[i+k]=delTabele[k];
            }
        }
        leviDel(tab, i, neurejeni_konec);
    }
}
