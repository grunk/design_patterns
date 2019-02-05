package fr.oroger;


public class Main {

    public static void main(String[] args) {
        Mediator mediator = new UIMediator();

        SearchButton btn = new SearchButton(mediator);
        ProgressBar prg = new ProgressBar(mediator);
        SearchLabel lbl = new SearchLabel(mediator);

        //btn.click();

        lbl.click();
    }
}
