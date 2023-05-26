package application;

import java.util.ArrayList;
import java.util.List;

public class DataClass {
    private List<User> importList;
    private List<User> exportList;

    public DataClass() {
        importList = new ArrayList<User>();
        importList.add(new User("Koussay", "Rachidi",15, 10,20));
        importList.add(new User("Bilel", "Saffar",16, 12,20));
        
        exportList = new ArrayList<User>(); // initialisation de exportList
    }

    public List<User> getImportList() {
        return importList;
    }

    public List<User> getExportList() {
        return exportList;
    }

    public void setExportList(List<User> exportList) {
        this.exportList.addAll(exportList);
        for (User p : this.exportList)
            System.out.println(p);
    }
}
