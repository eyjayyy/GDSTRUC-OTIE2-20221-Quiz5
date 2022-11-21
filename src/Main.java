public class Main {
    public static void main(String[] args) {
        int[] numbers = {8, 17, -3, 27, 1, 599, -96, 720};
        System.out.println(backAndForthSearch(numbers, 1));
    }

    public static int backAndForthSearch(int[] input, int value) {
        int front = 0;
        int back = input.length - 1;

        while (front <= back)
        {
            if (input[front] == value) return front;
            else if (input[back] == value) return back;

            front++;
            back--;
        }

        return -1;
    }
}