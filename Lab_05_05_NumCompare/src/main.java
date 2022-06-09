public class main {
    public static void main(String[] args) {
        int numOne = -3553344;
        int numTwo = 2;

        if (numOne == (int)numOne)
        {
            if (numTwo == (int)numTwo)
            {
                if (numOne > numTwo) {
                    System.out.println("Number one: " + numOne + " is larger than Number two: " + numTwo);
                } else if (numOne < numTwo) {
                    System.out.println("Number two: " + numTwo + " is larger than Number one: " + numOne);
                } else if (numOne == numTwo) {
                    System.out.println("Number one: " + numTwo + " is equal to Number two: " + numOne);
                }
            }
        }

        else {
            System.out.println("Please input integers: " + numOne + numTwo);
        }


    }
}
