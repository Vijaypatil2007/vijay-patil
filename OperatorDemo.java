public class OperatorDemo {
    void add (int a, int b) {
        int sum = a + b;
        System.out.println("Addition:" + sum);
    }

    // Method with return 
    int multiply (int a, int b){
        return a * b;
    }

        public static void main(String[] args) {

            //Arithmetic Promotion 
            byte a = 10 , b = 20;
            int result = a + b;   // promated to int 
            System.out.println("Arithematic Promotion Result:" + result);

            //Operators
            int x = 10, y = 3;
            System.out.println("x + y ="+(x + y));
            System.out.println("x - y ="+(x - y));
            System.out.println("x * y ="+(x * y));
            System.out.println("x / y ="+(x / y));
            System.out.println("x % y ="+(x % y));

            //Method Calling 
            OperatorDemo obj = new OperatorDemo();
            obj.add(5, 7);
            int product = obj.multiply(5, 6);
            System.out.println("Mulyiplication:" + product);
        }

    }     
       
