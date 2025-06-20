public class Main {

    public static void bubblesort(Order order[]){
        int a=order.length;
        for(int i=0;i<a-1;i++){
            for(int j=0;j<a-1-i;j++){
                if(order[j].totalPrice>order[j+1].totalPrice){
                    Order temp=order[j];
                    order[j]=order[j+1];
                    order[j+1]=temp;
                }
            }
        }

    }
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
             quickSort(orders, pi + 1, high);
        }
    }

    public static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice < pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Order order[]={
            new Order(101, "Alice", 250.0),
            new Order(102, "Bob", 150.0),
            new Order(103, "Charlie", 300.0),
            new Order(104, "Diana", 200.0),
            new Order(105, "Evan", 180.0)        
        };
        System.out.println("Before Sorting");
        for(Order o:order){
            System.err.println(o);
        }
        System.out.println("After Bubble sorting");
        bubblesort(order);
      
        for(Order o:order){
            System.out.println(o);
        }

        System.out.println("After Qick Sorting ");
        quickSort(order,0,order.length-1);
        for(Order o:order){
            System.out.println(o);
        }

    }

}
