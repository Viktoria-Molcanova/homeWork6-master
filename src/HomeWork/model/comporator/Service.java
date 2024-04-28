package HomeWork.model.comporator;

import HomeWork.model.IO;
import HomeWork.model.Model;

import java.time.LocalDate;

public class Service extends IO {
    private Model model;

    public Service(Model model, IO serialize) {
        this.model = model;
    }

    public void addHuman(String name, String surname, String middlename, String sex, LocalDate age) {
        model.addHuman(name, surname, middlename, sex, age);
    }

    public void saveFamily() {
        model.saveFamilyTree();
    }

    public void loadFamily() {
        model.loadFamilyTree();
    }
}
