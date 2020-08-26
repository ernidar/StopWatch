public class NestedLoops {
    public static void main(String[] args) {

        for (int index = 1;index <= 9; index ++) {
            System.out.println("Index value during this loop :" + index);

            for (int count = 1; count <=9; count++);{ // count will go up to 9 before index goes up by 1
                System.out.println(index + "*" + index + "= " + (index * index));
            }
        }

        System.out.println("For loop over");
    }

}
