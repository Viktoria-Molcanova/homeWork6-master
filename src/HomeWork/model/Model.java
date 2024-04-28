package HomeWork.model;

import HomeWork.model.comporator.HumanComparatorByAge;
import HomeWork.model.comporator.HumanComparatorByName;

import java.time.LocalDate;

public class Model {
    private final FamilyTree<Human> familyTree;
    private IO serialize;
    private HumanComparatorByAge sortAge;
    private HumanComparatorByName sortName;

    public Model(FamilyTree<Human> familyTree, IO serialize) {
        this.familyTree = familyTree;
        this.serialize = serialize;
        this.sortAge = sortAge;
        this.sortName = sortName;
    }

    public void addHuman(String name, String surname, String middlename, String sex, LocalDate age) {
        familyTree.addFamilyTree(new Human(name, surname, middlename, sex, age));
    }

    public FamilyTree<Human> getFamilyTree() {
        return familyTree;
    }

    public Human getHumanByName(String name) {
        return familyTree.getByName(name);
    }

    public void saveFamilyTree() {
        familyTree.saveObj(serialize);
    }

    public void loadFamilyTree() {
        serialize.load("TreeFamily.data");
    }

    public void sortFamilyByName() {
        familyTree.getFamilyTree().sort(sortName);
    }

    public void sortFamilyByAge() {
        familyTree.getFamilyTree().sort(sortAge);
    }
}