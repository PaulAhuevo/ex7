public class ZahlPasstNicht extends IndexOutOfBoundsException {

    public ZahlPasstNicht(int a, int b, int c) {

    }

    public int untereGrenze() {
        return 0;
    }

    public int obereGrenze() {
        return 0;
    }

    public String getMessage() {
        System.out.println("Print something.");
        return "hallO";
    }

    public int istWert() {
        return 0;
    }

}
