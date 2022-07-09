public class VotosEleitores {
    static String percentiauisValidos(){
        int votosValidos = 800;
        int votosTotais = 1000;
        return (votosValidos * 100) / votosTotais + "%";
    }
    static String percentualBranco(){
        int votosBrancos = 150;
        int votosTotais = 1000;
        return (votosBrancos * 100) / votosTotais + "%";
    }
    static String percentualNulos(){
        int votosNulos = 50;
        int votosTotais = 1000;
        return (votosNulos * 100) / votosTotais + "%";
    }
    public static void main(String[] args){
        System.out.println("Percentual votos Validos: " + percentiauisValidos());
        System.out.println("Percentual votos em Brancos: " + percentualBranco());
        System.out.println("Percentual votos em Brancos: " + percentualNulos());
    }
}
