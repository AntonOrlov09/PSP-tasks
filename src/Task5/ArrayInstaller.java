package Task5;

public class ArrayInstaller {
    public void fill(int[] array, Function function) {
        for (int i = 0; i < array.length; i++) {
            array[i] = function.function(i);
        }
    }
}
