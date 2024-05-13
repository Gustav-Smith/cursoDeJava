public class Decisao {
    public static void main(String[] args) {

        int pos = 6;

        switch (pos) {
            case 1:
                System.out.println("Primeiro Lugar");
                break;
            case 2:
                System.out.println("Segundo Lugar");
                break;
            case 3:
                System.out.println("Terceiro Lugar");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Premio de participação");
                break;
            default:
                System.out.println("Não ganhou");
                break;
        }

        /*
         * res = (nota >= media ? 1 : 0);
         * System.out.println("Resultado: " + (res == 1 ? "Aprovado" : "Reprovado"));
         */

        /*
         * 
         * res = (nota >= media ? "Aprovado" : "Reprovado");
         * System.out.println("Resultado: " + res);
         * 
         */

        /*
         * if ((nota >= media) && (faltas <= maxFaltas)) {
         * System.out.println("Aprovado");
         * } else if (nota >= 40) {
         * System.out.println("Recuperação");
         * } else {
         * System.out.println("Reprovado");
         * }
         * System.out.println("Fim do Programada");
         */
    }
}
