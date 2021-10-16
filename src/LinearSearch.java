public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11};
        System.out.println(linearSearch(array, 11));

    }

    /* Линейный или последовательный поиск – простейший алгоритм поиска.
     Алгоритм ищет элемент в заданной структуре данных, пока не достигнет конца структуры.
     При нахождении элемента возвращается его позиция в структуре данных.
     Если элемент не найден, возвращаем -1.*/

    public static int linearSearch(int[] arr, int elementToSearch) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch)
                return index;
        }
        return -1;
    }
}