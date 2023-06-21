//Çağla Çağlayan 200315018
public class Main {

    public static void main(String[] args) {
            btree1 b = new btree1(10);

            for (int i = 0; i < 5; i++) {
                int value = (int) (Math.random()*50)+1;
                System.out.println("added : " + value);
                b.insert(value);1
                b.Show();
                System.out.println("");

            }

    }


}
