package Mapi2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Random;
import java.util.Scanner;

import com.google.gson.Gson;



public class Methods {
	
	public static void ReadFromApi() throws IOException, InterruptedException {

		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://restcountries.com/v3.1/all"))
				.method("GET", HttpRequest.BodyPublishers.noBody()).build();
		HttpResponse<String> response = null;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
		}

		System.out.println(response.body());
		
		System.out.println("*****************************************************************" );


		Gson gson = new Gson();

		ApiInformation []apiInformation = gson.fromJson(response.body().toString(), ApiInformation[].class);
		for(ApiInformation s:apiInformation) {
			
			System.out.println("Area:" +"  "+ s.getArea());
			System.out.println("Cca2:" +"  "+s.getCca2());
			System.out.println("Cca3:" + "  "+s.getCca3());
			System.out.println("Ccn3:" +"  "+ s.getCcn3());
			System.out.println("Cioc:" +"  "+ s.getCioc());
			System.out.println("Fifa:" +"  "+ s.getFifa());
			System.out.println("Flag:" + "  "+s.getFlag());
			System.out.println("Population:" + "  "+s.getPopulation());
			System.out.println("Region:" + "  "+s.getRegion());
			System.out.println("StartOfWeek:" + "  "+s.getStartOfWeek());
			System.out.println("Status:" + "  "+s.getStatus());
			System.out.println("Subregion:" + "  "+s.getSubregion());
			System.out.println("Spellings:" + "  "+s.getAltSpellings()[0]);
			System.out.println("Capital:" + "  "+s.getCapital());
			System.out.println("Continents:" + "  "+s.getContinents()[0]);
			System.out.println("Latlng:" + "  "+s.getLatlng()[0]);
			System.out.println("Timezones:" + "  "+s.getTimezones()[0]);
			//System.out.println("Tld:" + "  "+s.getTld()[0]);
			//System.out.println("CapitalInfo:" + "  "+s.getCapitalInfo().getLatlng()[0]);
//			System.out.println("Car:" + "  "+s.getCar().getSigns()[0]);
	System.out.println("Car:" + "  "+s.getCar().getSide());
			System.out.println("CoatOfArms:" + "  "+s.getCoatOfArms().getPng());
			System.out.println("CoatOfArms:" + "  "+s.getCoatOfArms().getSvg());
			//System.out.println("Currencies:" + "  "+s.getCurrencies().getXCD().getName());
			//System.out.println("Currencies:" + "  "+s.getCurrencies().getXCD().getSymbol());
			//System.out.println("Demonyms:" + "  "+s.getDemonyms().getEng().getF());
			//System.out.println("Demonyms:" + "  "+s.getDemonyms().getEng().getM());
//			System.out.println("Demonyms:" + "  "+s.getDemonyms().getFra().getF());
//			System.out.println("Demonyms:" + "  "+s.getDemonyms().getFra().getM());
			System.out.println("Flags:" + "  "+s.getFlags().getPng());
			System.out.println("Flags:" + "  "+s.getFlags().getSvg());
			//System.out.println("Idd:" + "  "+s.getIdd().getSuffixes()[0]);
			System.out.println("Idd:" + "  "+s.getIdd().getRoot());
			//System.out.println("Languages:" + "  "+s.getLanguages().getEng());
			System.out.println("Maps:" + "  "+s.getMaps().getGoogleMaps());
			System.out.println("Maps:" + "  "+s.getMaps().getOpenStreetMaps());
			System.out.println("Name:" + "  "+s.getName());
			System.out.println("Name:" + "  "+s.getName().getCommon());
			System.out.println("Name:" + "  "+s.getName().getOfficial());
//			System.out.println("Name:" + "  "+s.getName().getNativeName().getEng().getOfficial());
//			System.out.println("Name:" + "  "+s.getName().getNativeName().getEng().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getAra().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getAra().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getBre().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getBre().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getCes().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getCes().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getCym().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getCym().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getDeu().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getDeu().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getEst().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getEst().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getFin().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getFin().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getFra().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getFra().getCommon());
//			System.out.println("Translations:" + "  "+s.getTranslations().getHrv().getOfficial());
//			System.out.println("Translations:" + "  "+s.getTranslations().getHrv().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getHun().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getHun().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getIta().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getIta().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getIta().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getIta().getCommon());
//			System.out.println("Translations:" + "  "+s.getTranslations().getJpn().getOfficial());
//			System.out.println("Translations:" + "  "+s.getTranslations().getJpn().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getKor().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getKor().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getNld().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getNld().getCommon());
//			System.out.println("Translations:" + "  "+s.getTranslations().getPer().getOfficial());
//			System.out.println("Translations:" + "  "+s.getTranslations().getPer().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getPol().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getPol().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getPor().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getPor().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getRus().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getRus().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getSlk().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getSlk().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getSpa().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getSpa().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getSwe().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getSwe().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getTur().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getTur().getCommon());
			System.out.println("Translations:" + "  "+s.getTranslations().getUrd().getOfficial());
			System.out.println("Translations:" + "  "+s.getTranslations().getUrd().getCommon());
//			System.out.println("Translations:" + "  "+s.getTranslations().getZho().getOfficial());
//			System.out.println("Translations:" + "  "+s.getTranslations().getZho().getCommon());
			
			

		}
	
	}
	
	
	
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////




	public static void CreateApiTable() {
		
		String url = "jdbc:mysql://localhost:3306/Mapi2";
		String user = "root";
		String pass = "root";
		String sqlDB = "CREATE TABLE Country "+
		"(name VARCHAR(225) not NULL, "
				+ " region  VARCHAR(225)not NULL, "
				
				+ " flags  TEXT not NULL, " +
				" idd  TEXT not NULL," +
				"flag TEXT not NULL , " +
				" timezones TEXT not NULL)";
		java.sql.Connection conn = null;
		
		try {
			Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, user, pass);
			java.sql.Statement st = conn.createStatement();
			int m = st.executeUpdate(sqlDB);
			if (m >= 1) {
				System.out.println("Created table in given database...");
				return;
			} else {
				System.out.println(" table already Created in given database...");
			}
			conn.close();
		}
		catch (Exception ex) {
			System.err.println(ex);
		}
		
		
	}
	
	
	
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////


	
public static void InsertValue() throws InstantiationException, IllegalAccessException, Exception {
		
		Scanner sa = new Scanner(System.in);

		System.out.println("How many number of rows you want to add?");
		int a = sa.nextInt();

		String url = "jdbc:mysql://localhost:3306/Mapi2";

		String user = "root";
		String pass = "root";
		Random rn = new Random();
		Integer numberToAdd = rn.nextInt(100);
		
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://restcountries.com/v3.1/all"))
				.method("GET", HttpRequest.BodyPublishers.noBody()).build();
		HttpResponse<String> response = null;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
		}

		
		
		System.out.println("*****************************************************************" );


		Gson gson = new Gson();

		ApiInformation []apiInformation = gson.fromJson(response.body().toString(), ApiInformation[].class);
		java.sql.Connection conn = null;
		
		Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
		DriverManager.registerDriver(driver);
		conn = DriverManager.getConnection(url, user, pass);
		
		for(ApiInformation s:apiInformation) {
			
			String sql = "INSERT INTO  Country (name,region,flags,idd,timezones)VALUES('"+ s.getName().getCommon()+
					                                                                        "','"+s.getRegion()+
					                                                                        "','"+ s.getFlags().getSvg()
					                                                                       +"','"+s.getIdd().getRoot()
					                                                                   
					                                                                       +"','"+s.getTimezones()[0]+"'"+")";

			try {

				java.sql.Statement st = conn.createStatement();
				System.out.println(sql);
				int m = st.executeUpdate(sql);
				if (m >= 1) {
					System.out.println("inserted data successfuly...");

				} else {
					System.out.println(" faild inserted data...");
				}
			} catch (Exception ex) {
				System.err.println(ex);
			}

		}
		conn.close();


	}
	

}
