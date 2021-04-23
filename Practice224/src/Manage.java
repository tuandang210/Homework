import java.util.*;

public class Manage {
    Scanner sc = new Scanner(System.in);
    List<AllLibrary> allLibraries = new ArrayList<>();

    public Manage() {
    }

    public Manage(List<AllLibrary> allLibraries) {
        this.allLibraries = allLibraries;
    }

    public List<AllLibrary> getAllLibraries() {
        return allLibraries;
    }

    public void setAllLibraries(List<AllLibrary> allLibraries) {
        this.allLibraries = allLibraries;
    }

    public void inputNewspapersInformation() {
        allLibraries.add(new Newspapers().inputNewPapers());
    }

    public void inputMagazineInformation() {
        allLibraries.add(new Magazine().inputMagazine());
    }

    public void inputBookInformation() {
        allLibraries.add(new Book().inputBookInfor());
    }

    public void insertionSortAndDisplay() {
        String[] arr = new String[allLibraries.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = allLibraries.get(i).getPublisher();
        }
        String sortedArray[] = insertionSort(arr, arr.length);
        for (int i = 0; i < allLibraries.size(); i++) {
            for (int j = 0; j < allLibraries.size(); j++) {
                if (sortedArray[i].equals(allLibraries.get(j).getPublisher())) {
                    System.out.println(allLibraries.get(j).toString());
                    Collections.swap(allLibraries, j, i);
                }
            }
        }
    }

    public void displaySubjectById() {
        int[] ids = new int[allLibraries.size()];
        for (int i = 0; i < ids.length; i++) {
            ids[i] = allLibraries.get(i).getId();
        }

        for (int i = 1; i < ids.length; i++) {
            int temp = ids[i];
            int j = i - 1;
            for (; j >= 0 && ids[j] > temp; j--) {
                ids[j + 1] = ids[j];
            }
            ids[j + 1] = temp;
        }

        int check = findId(ids);
        if (check == -1) {
            System.out.println("Không tìm được id đó");
        } else {
            System.out.println(allLibraries.get(check).toString());
        }
    }

    public void disPlayAllLibrary() {
        for (int i = 0; i < allLibraries.size(); i++) {
            if (allLibraries.get(i) instanceof Book) {
                System.out.println(allLibraries.get(i).toString());
            } else if (allLibraries.get(i) instanceof Magazine) {
                System.out.println(allLibraries.get(i).toString());
            } else if (allLibraries.get(i) instanceof Newspapers) {
                System.out.println(allLibraries.get(i).toString());
            }
        }
    }

    public void findAllLibraryByType() {
        System.out.println("Nhập loại tài liệu cần tìm");
        String word = sc.next();
        if ((word.equals("Book")) || (word.equals("Magazine")) || (word.equals("Newspapers"))) {
            for (int i = 0; i < allLibraries.size(); i++) {
                if ((allLibraries.get(i) instanceof Book) && (word.equals("Book"))) {
                    System.out.println(allLibraries.get(i).toString());
                } else if ((allLibraries.get(i) instanceof Magazine) && (word.equals("Magazine"))) {
                    System.out.println(allLibraries.get(i).toString());
                } else if ((allLibraries.get(i) instanceof Newspapers) && (word.equals("Newspapers"))) {
                    System.out.println(allLibraries.get(i).toString());
                }
            }
        } else {
            System.out.println("Không tìm được loại tài liệu đó");
        }
    }

    public int findId(int[] ids) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id cần tìm");
        int key = sc.nextInt();
        int index = -1;
        int left = 0;
        int right = ids.length - 1;
        do {
            int mid = (left + right) / 2;
            if (key == ids[mid]) {
                index = mid;
                return index;
            } else if (key < ids[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } while (left <= right);
        return -1;
    }

    public String[] insertionSort(String array[], int f) {
        String temp = "";
        for (int i = 0; i < f; i++) {
            for (int j = i + 1; j < f; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}