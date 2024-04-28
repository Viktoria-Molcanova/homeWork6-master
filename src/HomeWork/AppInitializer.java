package HomeWork;

import HomeWork.model.FamilyTree;
import HomeWork.model.IO;
import HomeWork.model.Model;
import HomeWork.ui.Console;
import HomeWork.ui.View;

public class AppInitializer {
    public void initialize() {
        View view = new Console();
        IO serialize = new IO();
        Model model = new Model(new FamilyTree<>(), serialize);
        ServiceInitializer serviceInitializer = new ServiceInitializer();
        PresenterInitializer presenterInitializer = new PresenterInitializer();
        serviceInitializer.initialize(model, serialize);
        presenterInitializer.initialize(view, model);
    }
}
