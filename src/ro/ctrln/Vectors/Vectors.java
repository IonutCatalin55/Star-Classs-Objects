package ro.ctrln.Vectors;

import java.util.Arrays;

public class Vectors {

    public static void main(String[] args) {

        char[] source = {'a', 'b', 'b', 'c', 'd', 'e', 'f', 'g'}; //un mod de declara un vector cu 7 elemente
        char[] sourceOne = {'c', 'a', 'b', 'd', 'e', 'f'};
        char[] sourceTwo = {'z', 'w', 'b', 'd', 'v', 't'};
        char[] destination = new char[10]; //declaram un vector gol dar cu 10 poziti in el

        //Metoda arrayCopy din clasa System
        System.arraycopy(source, 2, destination, 0, 3);
        // (vector sursa,poz de unde incepe copierea ,
        // vect destinati, pozitia din vector de unde incepe sa completeze, numarul de elem copiate )

        System.out.println(destination);
        // Metoda copyOfRange din clasa util.Arrays

        char[] copyOfRange = Arrays.copyOfRange(source ,1 ,5);
        // din vect source copiaza de la pozitia 1 LA 5 = ultimul caractere ESTE EXCLUS
        System.out.println(copyOfRange);

        char[] anotherCopyOfRange = Arrays.copyOfRange(source, 2, 6);
        System.out.println(anotherCopyOfRange);

        //Test pentru copiere vector cu pozitii care nu exista
        copyOfRange = Arrays.copyOfRange(source, 0 ,20);
        System.out.println(copyOfRange);

        //Test copiere din sursa a ambelor pozitii care nu exista
        //copyOfRange = Arrays.copyOfRange(source ,15, 20);         < ======
        //System.out.println(copyOfRange);
        // CAND APARE O EXCEPTIE ,EA INTRERUPE TOATA EXECUTIA UNEI METODE ( SA COME TAT TOT CODUL DE MAI SUS)

        // Metoda Arrays.fill aceasta metoda umple un vector cu un anume caracter
        Arrays.fill(destination,'e');
        System.out.println(destination);

        // Arrays.bynariSearch face o cautare binara a vectorului pt un anume caracter
        //Pentru a putea folosi bynariSearch vectorul trebuie sa fie sortat
        //Returneaza pozitia primului element cautat
        System.out.println(Arrays.binarySearch(source, 'z'));
        System.out.println(Arrays.binarySearch(source, 'b'));

        //Test cautare bynariSearch intr un vector nesortat
        System.out.println(Arrays.binarySearch(sourceOne, 'b'));
        System.out.println(Arrays.binarySearch(sourceTwo, 'b'));
        System.out.println(Arrays.binarySearch(sourceTwo, 'z')); // nefiind sortat pt 'z' ne arata pe pozitiz  -7

        Arrays.sort(sourceTwo); //dupa sortare pozitia elmentelor in vector se schimba
        System.out.println(sourceTwo);
        System.out.println(Arrays.binarySearch(sourceTwo, 'z'));

    }
}
