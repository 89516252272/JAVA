public class Main {
    public static void main(String[] args) {

        int count = 100;
          int addCount = 1100;
          int bonus = 0;
         if (addCount > 0) {
            if (addCount > 1000) {
                bonus = addCount / 100;
            }
            count = count + bonus + addCount;
            System.out.println("На вашем счёте: " + count + " рублей. " + "Ваш бонус: " + bonus + " рублей.");
         } else {
            System.out.println("Сумма пополнения не может быть отрицательной или равна нулю!");
        }
    }
}