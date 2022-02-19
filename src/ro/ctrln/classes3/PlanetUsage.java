package ro.ctrln.classes3;

public class PlanetUsage {

    public static void main(String[] args) {

        Planet mercury = new Planet();
        System.out.println(mercury.getPlanetName());  // pt planetname care este metoda String se va returna null,pt primitive returneaza 0
        System.out.println(mercury.getNumberOfMoons());  // < ====== valoriel pt obiectul mercury
        System.out.println(mercury.getNumberOfOceans());
        System.out.println(mercury.getMass());

        mercury.setPlanetName("Mercur");
        mercury.setNumberOfMoons((short)10);  //   <=========acum se seteaza valori pt parametri planetei mercur cu seteri
        mercury.setNumberOfOceans(5);
        mercury.setMass(100d);

        System.out.println(mercury.getPlanetName());
        System.out.println(mercury.getNumberOfMoons());  // < ====== valoriel pt obiectul mercury dupa setare
        System.out.println(mercury.getNumberOfOceans());
        System.out.println(mercury.getMass());

        System.out.println(mercury); //  <==== Afisarea obiectului

        Planet venus = new Planet("venus", 5, 444d, (short) 5);// <=== setarea parametrilor cu constructorul cu parametri
        System.out.println(venus);

        System.out.println("Venus hascode " + venus.hashCode());
        System.out.println("Mercury hashcode " + mercury.hashCode());

        System.out.println("mercury.equals(venus) " + mercury.equals(venus));

    }
}
