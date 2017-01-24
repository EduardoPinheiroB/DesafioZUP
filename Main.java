import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int Xmax, Ymax, X, Y, i;
        char P, P_aux;
        String Seq;

        Scanner S = new Scanner(System.in);
        //System.out.println("Tamanho da grade:");
        Xmax = S.nextInt();
        Ymax = S.nextInt();

        //System.out.println("Posição inicial:");
        X = S.nextInt();
        Y = S.nextInt();
        P = S.nextLine().charAt(1);

        //System.out.println("Sequencia de comandos:");
        Seq = S.nextLine();

        for (i = 0; i < Seq.length(); i++)
        {
            P_aux = Seq.charAt(i);
            
            if (P_aux == 'L') {
                P = Virar_esquerda(P);
            }
            else if (P_aux == 'R') {
                P = Virar_direita(P);
            }
            else if (P_aux == 'M')
            {
                switch (P)
                {
                    case 'N':
                        if(Y < Ymax)
                            Y++;
                        break;
                    case 'W':
                        if(X > 0)
                            X--;
                        break;
                    case 'S':
                        if(Y > 0)
                            Y--;
                        break;
                    case 'E':
                        if(X < Xmax)
                            X++;
                        break;
                }
            }
            
        }
        System.out.println("Saida igual = ");
        System.out.println(X+" "+Y+" "+P);
        S.close();
    }
	
	public static char Virar_direita(char p) {
        switch (p) {
            case 'N':
                return 'E';
            case 'E':
                return 'S';
            case 'S':
                return 'W';
            case 'W':
                return 'N';
        }
        return '\0';
    }

	public static char Virar_esquerda(char p) {
        switch (p) {
            case 'N':
                return 'W';
            case 'W':
                return 'S';
            case 'S':
                return 'E';
            case 'E':
                return 'N';
        }
        return '\0';
    }
}
