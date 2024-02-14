package org.example.src.QianDuanKongZhiQiMoShi;

public class Dispatcher {
    private final StudentsView studentView;
    private final HomeView homeView;

    public Dispatcher() {
        studentView = new StudentsView();
        homeView = new HomeView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }
}
