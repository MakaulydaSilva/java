import java.util.Scanner;

public class Continuacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		String s1, s2, s3;
        
		x = sc.nextInt();
		sc.nextLine(); //Faço um nextLine vazio para consumir a linha e assim a próxima leitura não ficará pendente
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
