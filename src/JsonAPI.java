import Model.CovidStatus;
import Network.ConnectURI;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class JsonAPI {
        //main programnya
        public static void main(String[] args) throws IOException {
            String Id;
            int Rank;
            String TwoLetterSymbol;
            String ThreeLetterSymbol;
            int InfectionRisk;
            int CaseFatalityRate;
            int RecoveryProporation;
            int TotalCases;
            int NewCases;
            int TotalDeaths;
            int TotalRecovered;
            int NewRecovered;
            int ActiveCases;
            int TotalTest;
            int Population;
            int oneCaseevery_x_ppl;
            int oneTestevery_x_ppl;
            int Deaths_1M_pop;
            int SeriousCritical;

            ArrayList<CovidStatus> CovidVirus = new ArrayList<>();
            try {
                //for (int i = 0; i<3; i++) {
                CovidStatus s = new CovidStatus();
                Scanner _input = new Scanner(System.in);
                System.out.println("Masukan Id : ");
                Id = _input.nextLine();
                System.out.println("Masukkan Rank : ");
                Rank = _input.nextInt();
                System.out.println("Masukkan TwoLetterSymbol : ");
                TwoLetterSymbol = _input.nextLine();
                System.out.println("Masukkan ThreeLetterSymbol : ");
                ThreeLetterSymbol = _input.nextLine();
                System.out.println("Masukkan InfectionRisk : ");
                InfectionRisk = _input.nextInt();
                System.out.println("Masukkan CaseFatalityRate: ");
                CaseFatalityRate = _input.nextInt();


                s.set_Id(Id);
                s.set_Rank(Rank);
                s.set_TwoLetterSymbol(TwoLetterSymbol);
                s.set_ThreeLetterSymbol(ThreeLetterSymbol);
                CovidStatus.add(s);
                //}
            } catch (Exception e){
                e.printStackTrace();
            }

            for(int j = 0; !(j >= CovidStatus.size()); j++)
                System.out.println(CovidStatus.get(j).get_nim() + " - " + CovidStatus.get(j).get_name() + " - "
                        + CovidStatus.get(j).get_address() + " - " + CovidStatus.get(j).get_phone() + " - ");

            String[] arrayme = {"a","b"};
            //mengubah Arraylist menjadi format json
            JSONArray jsonStudent = new JSONArray();
            //for (int u = 0; u < _studentTI.size(); u++){
            JSONObject myJOBject = new JSONObject();
            myJOBject.put("id", CovidStatus.get(0).get_Id());
            myJOBject.put("rank",CovidStatus.get(0).get_Rank());
            myJOBject.put("TwoLetterSymbol", CovidStatus.get(0).get_TwoLetterSymbol());
            myJOBject.put("ThreeLetterSymbol", CovidStatus.get(0).get_ThreeLetterSymbol());
            jsonStudent.put(myJOBject);

            //}
            System.out.println(jsonStudent.toString());

            // send student data to database cloud
            ConnectURI myUriBuilder = new ConnectURI();
            URL myAddress = myUriBuilder.buildURL("https://vaccovid-coronavirus-vaccine-and-treatment-tracker.p.rapidapi.com/api/npm-covid-data/asia");
            myUriBuilder.postJSON(myAddress,jsonStudent.toString());


        }

    private static class JSONArray {
    }

    private static class JSONObject {
    }
}
}
