//Riprendi uno degli esercizi già svolti e corretti
//Aggiungi Junit al progetto
//Crea una funzione di test che non dia errori

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
    }

    public static String testDataOra(boolean isBefore, boolean isAfter, boolean isEqual) {
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        boolean primaDataPrecedeData2 = data1.isBefore(data2);
        boolean secondaDataSuccesivaData1 = data2.isAfter(data1);
        boolean data1UgualeData2 = data1.isEqual(data2);


        System.out.println("PrimaData Dopo Data2 :" + primaDataPrecedeData2);
        System.out.println("SecondaData è succesiva Data1 :" + secondaDataSuccesivaData1);
        System.out.println(" Data1 è uguale a Data2 :" + data1UgualeData2);


        return null;
    }

}