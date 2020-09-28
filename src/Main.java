public class Main {
   public static void main(String[] args) {

       BonusMilesService service = new BonusMilesService();
       int price = 10_000;
       int miles = service.calculate(142);
       System.out.println(miles);







       // double price = 115.53;
       // int miles =  (int) price /  20;
       //System.out.println(miles);
}

}
