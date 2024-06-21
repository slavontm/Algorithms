public class FractionalKnapsack{
    public static void main(String[] args) {

    }
}


class Item{
    private int weigth;
    private int value;


    public Item(int weigth, int value) {
        this.weigth = weigth;
        this.value = value;
    }

    public int getWeigth() {
        return weigth;
    }

    public int getValue() {
        return value;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString(){
        return "{w:"+weigth+",v:"+value+"}";

    }
}