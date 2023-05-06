package First_project.hello_world;
public class Hello_world {
    protected String brand = "ford";
    public void honk()
    {
        System.out.println("tUUT tuut");
    }
    public void Bubble_sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n -i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[i];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
    public static int[][] Transpose_matrix(int arr[][])
    {
        int[][] Transposed = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                Transposed[i][j] = arr[j][i];
            }
        }
        return Transposed;
    }

    public static int[][] matrix_multiplication(int[][] A, int[][] arr)
    {
        if (A[0].length != arr.length)
        {
            System.out.println("The two matrices cannot be multiplied");
        }
        int[][] Transposed = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                Transposed[i][j] = arr[j][i];
            }
        }

        int[][] new_matrix = new int[A[0].length][arr[0].length];
        for (int i = 0; i < A[0].length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                int sum = 0;
                for (int k = 0; k < A.length; k++)
                {
                    sum += A[i][k] * Transposed[j][k];
                }
                new_matrix[i][j] = sum;
            }
        }
        return new_matrix;

    }
    /*
    public int _length(int[] arr)
    {
        if (arr == null) {
            return 0;
        }
        int length = 0;
        for (int i : arr) {
            length++;
        }
        return length;
    }

     */


    public static int my_arr_length(int[] arr)
    {
        int sum = 0;
        for (int count : arr)
        {
            sum ++;
        }
        return sum;
    }


}

class Car extends Hello_world {
    private String Mod_Name= "Mustang";
    public static void main(String[] args)
    {
        int[][] Bubble = {{1, 3, 9}, {4, 6, 56}, {7, 8, 9}};
        Car  my_obj = new Car();
        my_obj.honk();
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] transposed = Transpose_matrix(arr);
        int[][] gbami = matrix_multiplication(Bubble, arr);

// Print the transposed array to the terminal
        for (int i = 0; i < Bubble.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(gbami[i][j] + " ");
            }
            System.out.println();
        }
        int[] Kilo = {2, 4, 7, 9};
        int rel = my_obj.my_arr_length(Kilo);
        System.out.println(rel);

        for (Days_Of_The_Week days: Days_Of_The_Week.values())
        {
            System.out.println("This is " + days +" and It's day " + days.index());
        }

        Days_Of_The_Week day = Days_Of_The_Week.SUNDAY;
        switch (day) {
            case FRIDAY:
                System.out.println(" It's Friday, Can't wait for weekend bro!");
                break;
            case MONDAY:
                System.out.println("Monday, man needs to go to work you know.");
                break;
            case SUNDAY:
                System.out.println("wooo, It's Sunday to worship God!");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday!");
                break;
            case SATURDAY:
                System.out.println("WOOO... It's monday!");
                break;
            case THURSDAY:
                System.out.println("Hello thursday!");
                break;
            case WEDNESDAY:
                System.out.println("Its wednesday!");
                break;
            default:
                System.out.println("Hello, please check the week day very well!");
        }


        //System.out.println(Bina);
        //for (int i = 0; i < Bubble.length; i++)
       // {
            //for (int j = 0; j < Bubble.length; j++)
           // {
              //  System.out.println(Bubble[j][i]+ " ");
          //  }
           // System.out.println();

        //System.out.println("he brand of my vehicle is" + my_obj.brand + "the model name is "+ my_obj.Mod_Name);
        int a = 9;
        if (a == 9)
        {
            System.out.println("I'm a winner");
        }
        for (int i = 0; i < 100; i+= 2)
        {
            System.out.print(i + ",");
            if (i == 98)
            {
                System.out.print(".");
            }

        }

    }
}
