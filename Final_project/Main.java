package lesson_4;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static Scanner scanner;
    public static void main(String[] args){
        scanner = new Scanner(System.in);
        Set<Notebook> store = new HashSet<Notebook>();
        store.add(new Notebook("Lenovo", 4, 500, "Windows 10", "Black"));
        store.add(new Notebook("Dell", 8, 1000, "Linux", "White"));
        store.add(new Notebook("Apple", 6, 250, "Mac Os", "Silver"));
        store.add(new Notebook("HP", 16, 2000, "Windows 11", "Red"));

        HashMap<Integer, NotebookFilter> filterParams = readFilterParams();

        filterNotebooks(filterParams, store);

        scanner.close();
    }


    private static void filterNotebooks(HashMap<Integer, NotebookFilter> filterParams, Set<Notebook> store){
        for (Notebook notebook : store) {
            boolean isMatch = true;
            for (NotebookFilter filter : filterParams.values()){
                isMatch = isMatch && filter.isMatch(notebook);
            }
            if (isMatch){
                System.out.println(notebook);
            }
        }
    }

    private static boolean checkIfFilterPresent(HashMap<Integer, NotebookFilter> filterParams, int filterId){
        if (filterParams.containsKey(filterId)){        
            System.out.println("Фильтр уже добавлен, если хотите перезаписать его, введите 1:");
            int choice = scanner.nextInt();
            if (choice != 1){
                return true;
            }
            filterParams.remove(filterId);
        }

        return false;
    }

    private static void readNotebookMinMaxFilter(HashMap<Integer, NotebookFilter> filterParams, int filterId, String filterName){
        if (checkIfFilterPresent(filterParams, filterId)){        
            return;
        }

        System.out.print("Введите минимальное значение для " + filterName + ": ");
        int min = scanner.nextInt();
        System.out.print("Введите максимальное значение для " + filterName + ": ");
        int max = scanner.nextInt();
        filterParams.put(filterId, new NotebookFilter(filterId, min, max));
    }

    private static void readNotebookStringFilter(HashMap<Integer, NotebookFilter> filterParams, int filterId, String filterName){
        if (checkIfFilterPresent(filterParams, filterId)){        
            return;
        }

        System.out.print("Введите подстроку для поиска по " + filterName + ": ");
        String text = scanner.next();
        filterParams.put(filterId, new NotebookFilter(filterId, text));
    }


    private static HashMap<Integer, NotebookFilter> readFilterParams(){
        HashMap<Integer, NotebookFilter> filterParams = new HashMap<Integer, NotebookFilter>();
        int filterChoice = 0;

        do {
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем жесткого диска");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            System.out.println("0 - Поиск");
            filterChoice = scanner.nextInt();
            
            switch (filterChoice) {
                case 1:
                    readNotebookMinMaxFilter(filterParams, 1, "ОЗУ");
                    break;
                case 2:
                    readNotebookMinMaxFilter(filterParams, 2, "объем жесткого диска");
                    break;
                case 3:
                    readNotebookStringFilter(filterParams, 3, "операционной системе");
                    break;
                case 4:
                    readNotebookStringFilter(filterParams, 4, "цвету");
                    break;
            }
        } while(filterChoice != 0);

        return filterParams;
    }
}
