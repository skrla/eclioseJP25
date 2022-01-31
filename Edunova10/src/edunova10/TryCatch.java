package edunova10;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class TryCatch {

	private Date datum;

	public TryCatch() {
		//primjer1();
		//primjer2();
		//primjer3();
		//primjer4();
		//primjer5();
		//System.out.println(primjer6());
		try {
			primjer7();
		} catch (EdunovaException e) {
			System.out.println(e.getPoruka());
		}
	}
	
	private void primjer7() throws EdunovaException {
		throw new EdunovaException("Krivi podaci");
	}
	
	private Integer primjer6() {
		
		Scanner ulaz = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("Unesi cijeli broj: ");
				var i = Integer.parseInt(ulaz.nextLine());
				if(i<0) {
					System.out.println("Dozvoljeni su samo pozitivni brojevi");
					continue;
				}
				ulaz.close();
				return i;
			} catch (Exception e) {
				System.out.println("Niste unijeli cijeli broj!");
			}
		}
	}

	private void primjer5() {
		//spajanje na bazu
		Connection veza = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			veza = DriverManager.getConnection(
					"jdbc:mariadb://127.0.0.1/edunovajp25", 
					"edunova",
					"edunova");
			
			PreparedStatement izraz = veza.prepareStatement("select * from smjer");
			
			
			ResultSet rs = izraz.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("naziv") + " " + rs.getBigDecimal("cijena"));
			}
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (veza != null) {
				try {
					veza.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} 
		}
	
	private void primjer4() {
		
		int i = 0;
		
		try {
			i = Integer.parseInt("s");
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("Greška: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Greška: " + e.getMessage());
		}
	}

	private void primjer3() {
		int[] niz = new int[2];

		Scanner scanner = new Scanner(System.in);

		System.out.println("Unesi cijeli broj");
		try {
			niz[0] = Integer.parseInt(scanner.nextLine());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Greška indeksa niza");
		} catch (NumberFormatException e) {
			System.out.println("Nisi unio broj");
		} catch (Exception e) {
			System.out.println("Greška: " + e.getMessage());
		}

	}

	private void primjer2() {
		try {
			System.out.println(datum.getTime());
		} catch (NullPointerException e) {
			System.out.println("datum je null");
		}
	}

	private void primjer1() {
		System.out.println(datum.getTime());
	}

	public static void main(String[] args) {
		new TryCatch();
	}
}
