package ProgrammingWithClasses.AgregAndComp;

import java.util.Collections;

public class Client {

    public void sortBase(TourBase tourBase) {
        for (int i = 1; i < tourBase.getTours().size(); i++) {
            if (tourBase.getTours().get(i).equals(tourBase.getTours().get(i - 1))) {
                Collections.swap(tourBase.getTours(), i, i - 1);
            }
            for (int j = 1; j < tourBase.getTours().size(); j++) {
                if (tourBase.getTours().get(j).equals(tourBase.getTours().get(j - 1))) {
                    Collections.swap(tourBase.getTours(), j, j - 1);

                }

            }
        }
    }
    public void sortBaseTransport(TourBase tourBase) {
        for (int i = 1; i < tourBase.getTours().size(); i++) {
            if (tourBase.getTours().get(i).getTransport().equals(tourBase.getTours().get(i - 1).getTransport())) {
                Collections.swap(tourBase.getTours(), i, i - 1);
            }
            for (int j = 1; j < tourBase.getTours().size(); j++) {
                if (tourBase.getTours().get(j).getTransport().equals(tourBase.getTours().get(j - 1).getTransport())) {
                    Collections.swap(tourBase.getTours(), j, j - 1);

                }
            }
        }
    }

    public void sortBaseBreakfast(TourBase tourBase){
        for (int i = 1; i < tourBase.getTours().size(); i++) {
            if (tourBase.getTours().get(i).getBreakfast().equals(tourBase.getTours().get(i - 1).getBreakfast())) {
                Collections.swap(tourBase.getTours(), i, i - 1);
            }
            for (int j = 1; j < tourBase.getTours().size(); j++) {
                if (tourBase.getTours().get(j).getBreakfast().equals(tourBase.getTours().get(j - 1).getBreakfast())) {
                    Collections.swap(tourBase.getTours(), j, j - 1);

                }
            }
        }
    }
    public void sortBaseDays(TourBase tourBase) {
        for (int i = 1; i < tourBase.getTours().size(); i++) {
            if (tourBase.getTours().get(i).getDays()==tourBase.getTours().get(i - 1).getDays()) {
                Collections.swap(tourBase.getTours(), i, i - 1);
            }
            for (int j = 1; j < tourBase.getTours().size(); j++) {
                if (tourBase.getTours().get(j).getDays()==tourBase.getTours().get(j - 1).getDays()) {
                    Collections.swap(tourBase.getTours(), j, j - 1);

                }
            }
        }
    }
    }

