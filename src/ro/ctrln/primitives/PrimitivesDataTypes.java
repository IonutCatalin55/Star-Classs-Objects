package ro.ctrln.primitives;

public class PrimitivesDataTypes {

    public static void main(String[] args) {

        byte b1 = -128; //val minima
        byte b2 = 127;  //val maxima
        byte b3 = 30;
        byte b4 = (byte) 130; // dac depasim range ul se fac cast si se pierd biti rezultatul este - 126
        System.out.println(b4);

        short s1 = -32768;  // val minima
        short s2 = 32767;  //val max

        int i1 = 456777876;
        int i2 = -345976123;
        long i3 = 123456789123L; //pt LONG se adauga la finalul nr litera L


        float f1 = 567890;
        float f2 = 123456789123F;  //pt LONG se adauga la finalul nr litera F
        float f3 = -25.67F;  // in mod automat java vede orice numar zecimal ca DOUBLE = trebuie declarat float cu litera F la final

        double d1 = -25.789;
        double d = 12345678899012.12D; //pt DOUBLE se adauga la finalul nr ului litera D

        boolean ax1 = true;
        boolean ax2 = false;
        // boolean ax3 = 3.4; FALS ia valoarea doar true sau false

        char ch1 = 'a'; //un singur caracter
        // char ch2 = 'cf3'; FALS = UN SIR DE CARACTERE ESTE STRING

    }



}
