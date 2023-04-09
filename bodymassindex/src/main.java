public class main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int myIndex = service.calculate(50, 1.7);
        System.out.println("Индекс массы тела" + myIndex);
    }
}
