public class Fatorial {

    public int fatorialRecurasivo(int num) {

        if (num == 0)

            return 1;

        return num*fatorialRecurasivo(num-1);

    }

}