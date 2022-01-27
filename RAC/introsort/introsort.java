public class introsort {

    public static void main(String[] args) {
        int[] tabela = { 145, 162, 159, 194, 51, 64, 160, 8, 16, 18, 126, 148, 74, 181, 164, 58, 68, 84, 43, 9, 103,
                161, 19, 146, 38, 121, 182, 49, 188, 44, 92, 71, 79, 198, 163, 57, 186, 97, 118, 48, 61, 46, 114, 37,
                40, 45, 119, 32, 106, 2, 55, 41, 78, 85, 10, 117, 34, 179, 109, 183, 54, 200, 80, 175, 59, 156, 133,
                137, 36, 6, 176, 25, 174, 138, 62, 77, 115, 141, 108, 170, 169, 191, 88, 130, 107, 28, 112, 165, 87, 73,
                149, 76, 69, 20, 105, 7, 147, 197, 135, 116 };
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
            System.out.println("heapify " + i);
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
            System.out.println("po zadnjem insertion sortu: ");
            izpis(tab);
            System.out.println();
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
            System.out.println("po zadnjem heap sortu: ");
            izpis(tab);
        }
    }

    static void introSort(int tab[], int neurejeni_konec) {
        int tmp[] = { tab[0], tab[neurejeni_konec / 2], tab[neurejeni_konec] };
        insertionSort(tmp, 0, 3);// tmp, celoten array z določeno dolžino
        tab[0] = tmp[0];
        tab[neurejeni_konec / 2] = tmp[1];
        tab[neurejeni_konec] = tmp[2];
        menjaj(tab, neurejeni_konec / 2, neurejeni_konec - 1);
        izpis(tab);
        System.out.println();
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
                System.out.println("i: " + i + " j: " + j);
                izpis(tab);
                i++;
                j--;
            }
        }
        menjaj(tab, i, neurejeni_konec - 1);// ko se i in j križata, je pivot na mestu
        System.out.println("i: " + i + " j: " + j);
        System.out.println("po intro sortu: ");
        izpis(tab);
        if (neurejeni_konec - i < 16) {
            insertionSort(tab, i, neurejeni_konec + 1);
            System.out.println("po insertion sortu: ");
            izpis(tab);
            System.out.println();

        } else {
            int delTabele[] = new int[neurejeni_konec - i + 1];
            for (int k = 0; k < delTabele.length; k++) {
                delTabele[k] = tab[i + k];
            }
            heapSort(delTabele);
            for(int k=0;k<delTabele.length;k++){
                tab[i+k]=delTabele[k];
            }
            //formiraj novo tabelo delTabele
            System.out.println("po heap sortu: ");
            izpis(tab);
            System.out.println();
        }
        System.out.println("pred ponovnim introsortom i: " + i + " j: " + j + " neurejeni konec: " + neurejeni_konec);
        leviDel(tab, i, neurejeni_konec);

    }

}
