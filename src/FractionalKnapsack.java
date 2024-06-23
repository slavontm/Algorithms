import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {

        final Item Item1 = new Item(4, 20);
        final Item Item2 = new Item(3, 18);
        final Item Item3 = new Item(2, 14);
        final Item[] items = {Item1, Item2, Item3}; // Nabor predmetov(massiv)


        Arrays.sort(items, Comparator.comparingDouble(Item::valueUnitOfWeigth).reversed()); // o(n*log(n))
        System.out.println(Arrays.toString(items));
        final int W = 7; // Vmestimost'
        int weigthSoFar = 0; //Nabranniy ves
        double valueSoFdar = 0; // Nabranny cennost'
        int currentItem = 0;  //
        while (currentItem < items.length && weigthSoFar != W) {
            if (weigthSoFar + items[currentItem].getWeigth() < W) {
                //Berem celikom
                valueSoFdar += items[currentItem].getValue();
                weigthSoFar += items[currentItem].getWeigth();

            } else {
                //Berem chast'
                valueSoFdar += ((W - weigthSoFar) / (double) items[currentItem].getWeigth()) * items[currentItem].getValue();
                weigthSoFar = W;
            }
            currentItem++;

        }

        System.out.println("Cennost:" + valueSoFdar);
    }

}
    class Item {
        private int weigth;
        private int value;

        public Item(int weigth, int value) {
            this.weigth = weigth;
            this.value = value;
        }

        public double valueUnitOfWeigth() {
            return value / (double) weigth;
        }

        public int getWeigth() {
            return weigth;
        }

        public int getValue() {
            return value;
        }

        /*public void setWeigth(int weigth) {
            this.weigth = weigth;
        }

        public void setValue(int value) {
            this.value = value;
        }*/

        public String toString() {
            return "{w:" + weigth + ",v:" + value + "}";

        }
    }
